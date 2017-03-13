package org.kangnam.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.kangnam.domain.PageMaker;
import org.kangnam.domain.SearchCriteria;
import org.kangnam.domain.SeatVO;
import org.kangnam.service.LockifmListService;
import org.kangnam.service.SeatService;
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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/seat/*")
public class SeatController {

	private static final Logger logger = LoggerFactory.getLogger(SeatController.class);

	@Inject
	private SeatService service;

	@Inject
	private LockifmListService service2;
	
	@Inject
	private SeatifmService service1;

	@Inject
	private SlService service4;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String listPage(@ModelAttribute("cri") SearchCriteria cri, @Param("seat_aloc_sq") String seat_aloc_sq, Model model,HttpSession session, HttpServletRequest request) throws Exception {

		
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
		
		/**** 만약, 퇴실처리로 왔을 경우 ****/
		
		if (seat_aloc_sq != null)
			service1.update(seat_aloc_sq);
		
		/**** 만약, 퇴실처리로 왔을 경우 ****/
		
		logger.info(cri.toString());

		model.addAttribute("list", service.listSearchCriteria(cri));

		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);

		pageMaker.setTotalCount(service.listSearchCount(cri));

		model.addAttribute("pageMaker", pageMaker);

		model.addAttribute("lockList", service2.lockList());
		model.addAttribute("cntList", service2.cntList());
		model.addAttribute("totList", service2.totList());
		
		/* div1 */
		model.addAttribute("seatifmlist", service1.list());
	    model.addAttribute("monList", service1.monList());
		/* div4 */
		// Controller 에서 JSP 에게 전송, JSP파일에서는 EL을 사용하여 받는다.
		model.addAttribute("today_sell", service4.today_sell());

		return "seat/list";
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void registGET(Model model) throws Exception {

		logger.info("regist get ...........");

		// 월회원 고정석 출력 쿼리문
		model.addAttribute("day_seat_list", service.day_seat_list());
		
		/* div1 */
		model.addAttribute("seatifmlist", service1.list());
	    model.addAttribute("monList", service1.monList());
		/* div4 */
		// Controller 에서 JSP 에게 전송, JSP파일에서는 EL을 사용하여 받는다.
		model.addAttribute("today_sell", service4.today_sell());
		
		/* div3 */
		// Controller 에서 JSP 에게 전송, JSP파일에서는 EL을 사용하여 받는다.
		model.addAttribute("lockList", service2.lockList());
		model.addAttribute("cntList", service2.cntList());
		model.addAttribute("totList", service2.totList());

		
		
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registPOST(SeatVO seat, RedirectAttributes rttr) throws Exception {

		logger.info("regist post ...........");
		logger.info(seat.toString());

		service.regist(seat);

		rttr.addFlashAttribute("msg", "SUCCESS");

		return "redirect:/seat/list";
	}

	

}
