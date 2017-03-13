package org.kangnam.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.kangnam.domain.CouponVO;
import org.kangnam.domain.MemberVO;
import org.kangnam.domain.PageMaker;
import org.kangnam.domain.SearchCriteria;
import org.kangnam.service.CouponService;
import org.kangnam.service.LockifmListService;
import org.kangnam.service.MemberService;
import org.kangnam.service.OnedayService;
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
@RequestMapping("/member/*")
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	@Inject
	private MemberService service;

	@Inject
	private OnedayService service1;

	@Inject
	private CouponService service2;

	@Inject
	private LockifmListService service3;

	@Inject
	private SeatifmService service4;

	@Inject
	private SlService service5;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String listPage(@ModelAttribute("cri") SearchCriteria cri, Model model, HttpSession session,
			HttpServletRequest request) throws Exception {

		/*** 로그인 ***/
		// 세션이 있는지 확인한다, 만약 없다면 새로 생성하지 않는다.
		session = request.getSession(false);

		String admn_id = null;
		// 세션을 불러와 admn_id에 넣는다. 없다면 null이나 ""이가 들어오겟죠
		admn_id = (String) session.getAttribute("admn_id");

		// 만약 admn_id가 null 또는 "" 이라면 (로그인을 하지 않은 상태라면)
		// 로그인 페이지로 강제로 보내라
		if (admn_id == null || admn_id.equals(""))
			return "redirect:/login/loginForm";
		/*** 로그인 ***/

		logger.info(cri.toString());

		model.addAttribute("list", service.listSearchCriteria(cri));

		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);

		pageMaker.setTotalCount(service.listSearchCount(cri));

		model.addAttribute("pageMaker", pageMaker);
		model.addAttribute("locList", service.locList());
		model.addAttribute("memList", service.memList());
		model.addAttribute("seatList", service.seatList());

		model.addAttribute("lockList", service3.lockList());
		model.addAttribute("cntList", service3.cntList());
		model.addAttribute("totList", service3.totList());

		/* div1 */
		model.addAttribute("seatifmlist", service4.list());
		model.addAttribute("monList", service4.monList());
		/* div4 */
		// Controller 에서 JSP 에게 전송, JSP파일에서는 EL을 사용하여 받는다.
		model.addAttribute("today_sell", service5.today_sell());

		return "member/list";
	}

	@RequestMapping(value = "/readPage", method = RequestMethod.GET)
	public String read(@RequestParam("mem_sq") int mem_sq, @ModelAttribute("cri") SearchCriteria cri, Model model)
			throws Exception {

		/*
		 * model.addAttribute("memberVO", service.read(mem_sq));
		 * model.addAttribute("memberVO1", service.read1(mem_sq));
		 * 
		 * int mon_mem_rgstrt_sq = service.maxRgsSq(mem_sq); // mem_sq에 해당하는 많은
		 * // mon_mem_rgstrt_sq // 중 가장 큰 값, 즉 가장 // 최근값을 가져온다
		 * 
		 * model.addAttribute("memberVO2", service.read2(mon_mem_rgstrt_sq)); //
		 * 그 // mon_mem_rgstrt_sq // 값을 // select // 한다.
		 */
		MemberVO vo = service.read3(mem_sq);
		
		model.addAttribute("vo", vo);

		/* div1 */
		model.addAttribute("seatifmlist", service4.list());
		model.addAttribute("monList", service4.monList());

		/* div3 */
		// Controller 에서 JSP 에게 전송, JSP파일에서는 EL을 사용하여 받는다.
		model.addAttribute("lockList", service3.lockList());
		model.addAttribute("cntList", service3.cntList());
		model.addAttribute("totList", service3.totList());

		/* div4 */
		// Controller 에서 JSP 에게 전송, JSP파일에서는 EL을 사용하여 받는다.
		model.addAttribute("today_sell", service5.today_sell());

		return "member/readPage";
	}

	@RequestMapping(value = "/removePage", method = RequestMethod.POST)
	public String remove(@RequestParam("mem_sq") int mem_sq, SearchCriteria cri, RedirectAttributes rttr)
			throws Exception {

		service.remove(mem_sq);

		rttr.addAttribute("page", cri.getPage());
		rttr.addAttribute("perPageNum", cri.getPerPageNum());
		rttr.addAttribute("searchType", cri.getSearchType());
		rttr.addAttribute("keyword", cri.getKeyword());

		rttr.addFlashAttribute("msg", "SUCCESS");

		return "redirect:/member/list";
	}

	@RequestMapping(value = "/modifyPage", method = RequestMethod.GET)
	public void modifyPagingGET(int mem_sq, @ModelAttribute("cri") SearchCriteria cri, Model model) throws Exception {

		/*model.addAttribute(service.read(mem_sq));*/
		MemberVO vo = service.read3(mem_sq);
		
		model.addAttribute("vo", vo);
	}

	@RequestMapping(value = "/modifyPage", method = RequestMethod.POST)
	public String modifyPagingPOST(MemberVO member, SearchCriteria cri, RedirectAttributes rttr) throws Exception {

		System.out.println("들어왔다.");
		
		logger.info(cri.toString());
/*		service.modify(member);

		rttr.addAttribute("page", cri.getPage());
		rttr.addAttribute("perPageNum", cri.getPerPageNum());
		rttr.addAttribute("searchType", cri.getSearchType());
		rttr.addAttribute("keyword", cri.getKeyword());

		rttr.addFlashAttribute("msg", "SUCCESS");*/
		
		service.modify(member);
		

		logger.info(rttr.toString());

		return "redirect:/member/list";
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registGET(Model model, HttpSession session, HttpServletRequest request) throws Exception {

		/*** 로그인 ***/
		// 세션이 있는지 확인한다, 만약 없다면 새로 생성하지 않는다.
		session = request.getSession(false);

		String admn_id = null;
		// 세션을 불러와 admn_id에 넣는다. 없다면 null이나 ""이가 들어오겟죠
		admn_id = (String) session.getAttribute("admn_id");

		// 만약 admn_id가 null 또는 "" 이라면 (로그인을 하지 않은 상태라면)
		// 로그인 페이지로 강제로 보내라
		if (admn_id == null || admn_id.equals(""))
			return "redirect:/login/loginForm";

		/*** 로그인 ***/

		logger.info("regist get ...........");
		model.addAttribute("locList", service.locList());
		model.addAttribute("memList", service.memList());
		model.addAttribute("seatList", service.seatList());
		model.addAttribute("mdvsList", service.mdvsList());

		model.addAttribute("lockList", service3.lockList());
		model.addAttribute("cntList", service3.cntList());
		model.addAttribute("totList", service3.totList());

		model.addAttribute("admn_id", admn_id);

		/* div1 */
		model.addAttribute("seatifmlist", service4.list());
		model.addAttribute("monList", service4.monList());
		/* div4 */
		// Controller 에서 JSP 에게 전송, JSP파일에서는 EL을 사용하여 받는다.
		model.addAttribute("today_sell", service5.today_sell());

		return "member/register";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registPOST(MemberVO member, CouponVO coupon, RedirectAttributes rttr, @Param("mem_dvs") int mem_dvs)
			throws Exception {

		logger.info("regist post ...........");

		logger.info(member.toString());
		logger.info(coupon.toString());

		service.regist1(member);

		if (mem_dvs == 2) {
			int num = service.maxMemSq(); // mem_tb 의 mem_sq 중 가장큰수(최근수)를 뽑아 num
											// 에
			// 저장
			member.setMem_sq(num); // 뽑은 num 을 다시 member에 넣는다.
			service.regist2(member);
		}

		rttr.addFlashAttribute("msg", "SUCCESS");

		return "redirect:/member/list";
	}

}
