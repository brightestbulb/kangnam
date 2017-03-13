package org.kangnam.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.kangnam.domain.LockifmVO;
import org.kangnam.domain.PageMaker;
import org.kangnam.domain.SearchCriteria;
import org.kangnam.service.LockifmListService;
import org.kangnam.service.LockifmService;
import org.kangnam.service.SeatifmService;
import org.kangnam.service.SlService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/lockifm/*") // 포트 번호 다음에 입력하는 url 인듯 하다.
public class LockifmController
{

	private static final Logger logger = LoggerFactory.getLogger(LockifmController.class);

	// 연결할 Service 클래스를 설정해준다.
	@Inject
	private LockifmService service;

	@Inject
	private LockifmListService service2;
	// value 값은 url을 뜻하는듯 하다.
	/**
	 * method 값은 Form과 마찬가지로 get 방식과 post 방식을 뜻하는 것일까?
	 */
	@Inject
	private SeatifmService service1;

	@Inject
	private SlService service4;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String listPage(@ModelAttribute("cri") SearchCriteria cri, Model model,HttpSession session, HttpServletRequest request) throws Exception
	{

		/*** 로그인 ***/
		// 세션이 있는지 확인한다, 만약 없다면 새로 생성하지 않는다.
		session = request.getSession(false);


		String admn_id = null;
		// 세션을 불러와 admn_id에 넣는다. 없다면 null이나 ""이가 들어오겟죠
		admn_id = (String)session.getAttribute("admn_id");

		// 만약 admn_id가 null 또는 "" 이라면 (로그인을 하지 않은 상태라면) 
		// 로그인 페이지로 강제로 보내라
		if (admn_id == null || admn_id.equals(""))
			return "redirect:/login/loginForm";
		/*** 로그인 ***/

		logger.info(cri.toString());


		// Controller 에서 JSP 에게 전송 JSP파일에서는 EL을 사용하여 받는다.
		model.addAttribute("list", service.listSearchCriteria(cri));

		// PageMaker 객체 생성 페이징 처리 역할을 맡는다.
		PageMaker pageMaker = new PageMaker();

		pageMaker.setCri(cri);
		pageMaker.setTotalCount(service.listSearchCount(cri));

		// Controller 에서 JSP 에게 전송 JSP파일에서는 EL을 사용하여 받는다.
		model.addAttribute("pageMaker", pageMaker);


		/* div3 */
		// Controller 에서 JSP 에게 전송 JSP파일에서는 EL을 사용하여 받는다.
		model.addAttribute("lockList", service2.lockList());
		model.addAttribute("cntList", service2.cntList());
		model.addAttribute("totList", service2.totList());

		/* div1 */
		model.addAttribute("seatifmlist", service1.list());
		model.addAttribute("monList", service1.monList());
		/* div4 */
		// Controller 에서 JSP 에게 전송, JSP파일에서는 EL을 사용하여 받는다.
		model.addAttribute("today_sell", service4.today_sell());

		// JSP 파일 경로 (폴더명 / 파일명을 리턴해준다.)
		return "lockifm/list";
	}

	// 월 회원 클릭시 출력되는 페이지
	@RequestMapping(value = "/readPage", method = RequestMethod.GET)
	public void read(@RequestParam("mem_sq") int mem_sq, @ModelAttribute("cri") SearchCriteria cri, Model model)
			throws Exception
	{
		model.addAttribute("LockifmVO", service.read(mem_sq));
		model.addAttribute("nullLockifm", service.nullLockifm());
		/* div1 */
		model.addAttribute("seatifmlist", service1.list());
		model.addAttribute("monList", service1.monList());
		/* div4 */
		// Controller 에서 JSP 에게 전송, JSP파일에서는 EL을 사용하여 받는다.
		model.addAttribute("today_sell", service4.today_sell());
		/* div3 */
		// Controller 에서 JSP 에게 전송 JSP파일에서는 EL을 사용하여 받는다.
		model.addAttribute("lockList", service2.lockList());
		model.addAttribute("cntList", service2.cntList());
		model.addAttribute("totList", service2.totList());
	}

	// 사물함 수정시 처리할 메소드 → 리다이렉트 처리
	@RequestMapping(value = "/modifyPage", method = RequestMethod.GET)
	public String update(LockifmVO vo, @ModelAttribute("cri") SearchCriteria cri, Model model)
			throws Exception
	{	
		// null값으로 변경한다.
		if (vo.getLc_sq().equals(""))
			vo.setLc_sq(null);

		// 회원 페이지에 진입
		// 회원 vo로 리스트를 뿌려주고
		// 그 vo의 내용을 수정함.
		service.update(vo);



		return "redirect:list";
	}


}
