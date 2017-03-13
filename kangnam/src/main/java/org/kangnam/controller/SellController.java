package org.kangnam.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.kangnam.domain.PageMaker;
import org.kangnam.domain.SearchCriteria;
import org.kangnam.domain.SellVO;
import org.kangnam.service.LockifmListService;
import org.kangnam.service.SeatifmService;
import org.kangnam.service.SellService;
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
@RequestMapping("/sell/*")
public class SellController
{

	private static final Logger logger = LoggerFactory.getLogger(SellController.class);

	@Inject
	private SellService service;

	@Inject
	private SeatifmService service1;

	@Inject
	private LockifmListService service3;

	@Inject
	private SlService service4;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String listPage(@ModelAttribute("cri") SearchCriteria cri, Model model, HttpSession session, HttpServletRequest request) throws Exception
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

		/**** 만약, insert에서 되 돌아 왔을 경우 ****/
		String errMsg = null;
		errMsg = (String)session.getAttribute("errMsg");

		if (errMsg != null) {
			session.removeAttribute("errMsg");
			model.addAttribute("errMsg", errMsg);
		}

		/**** 만약, insert에서 되 돌아 왔을 경우 ****/



		logger.info(cri.toString());

		// model.addAttribute("list", service.listCriteria(cri));
		model.addAttribute("list", service.listSearchCriteria(cri));

		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);

		// pageMaker.setTotalCount(service.listCountCriteria(cri));
		pageMaker.setTotalCount(service.listSearchCount(cri));

		model.addAttribute("pageMaker", pageMaker);

		/* div1 */
		model.addAttribute("seatifmlist", service1.list());
		model.addAttribute("monList", service1.monList());

		/* div3 */
		// Controller 에서 JSP 에게 전송, JSP파일에서는 EL을 사용하여 받는다.
		model.addAttribute("lockList", service3.lockList());
		model.addAttribute("cntList", service3.cntList());
		model.addAttribute("totList", service3.totList());

		/* div4 */
		// Controller 에서 JSP 에게 전송, JSP파일에서는 EL을 사용하여 받는다.
		model.addAttribute("today_sell", service4.today_sell());

		return "sell/list";
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registGET(@ModelAttribute("cri") SearchCriteria cri, Model model, HttpSession session) throws Exception
	{
		model.addAttribute("sl_prod_list", service.sl_prod_list());
		model.addAttribute("by_list", service.by_list());
		model.addAttribute("lc_list", service.lc_list());
		model.addAttribute("seat_dvs_list", service.seat_dvs_list());

		// 월회원 고정석 출력 쿼리문
		model.addAttribute("mon_seat_list", service.mon_seat_list());
		// 월회원 고정석 출력 쿼리문
		model.addAttribute("day_seat_list", service.day_seat_list());

		/* div1 */
		model.addAttribute("seatifmlist", service1.list());
		model.addAttribute("monList", service1.monList());
		/* div3 */
		// Controller 에서 JSP 에게 전송, JSP파일에서는 EL을 사용하여 받는다.
		model.addAttribute("lockList", service3.lockList());
		model.addAttribute("cntList", service3.cntList());
		model.addAttribute("totList", service3.totList());

		/* div4 */
		// Controller 에서 JSP 에게 전송, JSP파일에서는 EL을 사용하여 받는다.
		model.addAttribute("today_sell", service4.today_sell());

		return "sell/register";
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insert(HttpSession session, HttpServletRequest request, SellVO vo, Model model) throws Exception
	{
		// 로그인 기능, 세션을 사용하겠다는 의미
		session = request.getSession();

		// 월회원이 아닐 때 insert 또는 update 시키지 않기 위해
		// mem_sq로 mon_mem_tb를 검색하고
		// 데이터가 없다면, sell/list로 리 다이렉트 시킨다.
		// 사용자가 알기 쉽게 메세지를 전달하여
		// sell/list에서는 얼럿이 뜨게끔 한다.
		String mem_sq = null;
		String sl_prod_sq = null;
		mem_sq = service.mon_mem_list(vo.getMem_sq());
		sl_prod_sq = vo.getSl_prod_sq();

		if (mem_sq == null && Integer.parseInt(sl_prod_sq) == 1)
		{
			session.setAttribute("errMsg", "월 회원이 아닙니다.");
			return "redirect:/sell/list";
		}
		// 세션의 admn_id 변수의 데이터를 String admn_id 변수에 넣어라.
		String admn_id = (String)session.getAttribute("admn_id");

		// String admn_id 변수의 데이터를 SellVO admn_id 변수에 넣어라.
		vo.setAdmn_id(admn_id);

		// 판매 테이블에 데이터를 넣어랑
		service.sl_insert(vo);

		// 월 회원이면
		if (vo.getSl_prod_sq().equals("1")) {
			System.out.println("월 회원 데이터 넣기");

			// 자유석 이라면
			if (vo.getSeat_dvs_sq().equals("1")) {
				vo.setSeat_sq(null);
			}
			// JSP에서 보낸 데이터를 전달 받는다.
			mem_sq = null;
			mem_sq = service.mon_mem_list(vo.getMem_sq());

			// 데이터가 null이면 MON_MEM_TB에 데이터가 없다는 뜻
			if (mem_sq == null) {
				// MON_MEM_TB 에 데이터를 넣어라
				service.mon_mem_insert(vo);
			}
			// 데이터가 null이 아니면 MON_MEM_TB에 데이터가 있다는 뜻
			else if (mem_sq != null) {
				// MON_MEM_TB 업데이트 해라
				service.mon_mem_update(vo);
			}
			// MON_MEM_RGSTRT_TB에서 현재 월회원인지를 판단함
			mem_sq = null;
			mem_sq = service.mon_mem_rgstrt_list(vo.getMem_sq());

			// MON_MEM_RGSTRT_TB에 데이터를 넣기 위해 구매한 개월수를 체크
			String mon_mem_end_dd = Integer.toString(Integer.parseInt(vo.getMon_mem_end_dd()));

			vo.setMon_mem_end_dd(mon_mem_end_dd);
			// MON_MEM_RGSTRT_TB 에 데이터를 넣어라.

			// 데이터가 null이면 MON_MEM_RGSTRT_TB에 데이터가 없다는 뜻
			if (mem_sq == null) {
				// MON_MEM_TB 에 데이터를 넣어라
				service.mon_mem_rgstrt_Insert(vo);
			}
			// 데이터가 null이 아니면 MON_MEM_RGSTRT_TB에 데이터가 있다는 뜻
			else if (mem_sq != null) {
				// MON_MEM_TB 업데이트 해라
				service.mon_mem_rgstrt_update(vo);
			}
		}
		// 일회원이면 
		else if (vo.getSl_prod_sq().equals("2")) {
			// 좌석 배정 테이블에 데이터를 넣어랑
			System.out.println("일 회원 데이터 넣기");
			service.seat_aloc_insert(vo);
		}
		// 쿠폰 회원이면
		else if (vo.getSl_prod_sq().equals("3")) {
			// 쿠폰 판매 테이블에 데이터를 넣어라.
			System.out.println("쿠폰 회원 데이터 넣기");
			// 현재 날짜에서 종료일을 구하기 위해 쿠폰 나누기 10을 한다.
			String cpn_end_dd = Integer.toString(Integer.parseInt(vo.getCpn_num()) / 10);
			// 구매한 쿠폰 갯수 나누기 10 한 숫자를 vo에 넣어 

			vo.setCpn_end_dd(cpn_end_dd);
			// mapper 에서 쿼리문을 이용해 자동으로 쿠폰 종료일을 입력할 수 있도록 한다.
			service.cpn_insert(vo);
		}

		System.out.println("판매테이블 입력완료");

		return "redirect:/sell/list";
	}


	@RequestMapping(value = "/readPage", method = RequestMethod.GET)
	public void read(@RequestParam("sl_sq") int sl_sq, @ModelAttribute("cri") SearchCriteria cri, Model model)
			throws Exception
	{
		model.addAttribute(service.read(sl_sq));
	}

	@RequestMapping(value = "/removePage", method = RequestMethod.POST)
	public String remove(@RequestParam("sl_sq") int sl_sq, SearchCriteria cri, RedirectAttributes rttr) throws Exception
	{
		service.remove(sl_sq);
		rttr.addAttribute("page", cri.getPage());
		rttr.addAttribute("perPageNum", cri.getPerPageNum());
		rttr.addAttribute("searchType", cri.getSearchType());
		rttr.addAttribute("keyword", cri.getKeyword());
		rttr.addFlashAttribute("msg", "SUCCESS");

		return "redirect:/sell/list";
	}

	@RequestMapping(value = "/modifyPage", method = RequestMethod.GET)
	public void modifyPagingGET(int sl_sq, @ModelAttribute("cri") SearchCriteria cri, Model model) throws Exception
	{
		model.addAttribute(service.read(sl_sq));
	}

	@RequestMapping(value = "/modifyPage", method = RequestMethod.POST)
	public String modifyPagingPOST(SellVO sell, SearchCriteria cri, RedirectAttributes rttr) throws Exception
	{
		logger.info(cri.toString());
		service.modify(sell);
		rttr.addAttribute("page", cri.getPage());
		rttr.addAttribute("perPageNum", cri.getPerPageNum());
		rttr.addAttribute("searchType", cri.getSearchType());
		rttr.addAttribute("keyword", cri.getKeyword());
		rttr.addFlashAttribute("msg", "SUCCESS");

		logger.info(rttr.toString());

		return "redirect:/sell/list";
	}
}
