package org.kangnam.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.kangnam.domain.CouponVO;
import org.kangnam.domain.PageMaker;
import org.kangnam.domain.SearchCriteria;
import org.kangnam.service.CouponService;
import org.kangnam.service.LockifmListService;
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
@RequestMapping("/coupon/*")
public class CouponController {

	private static final Logger logger = LoggerFactory.getLogger(CouponController.class);

	@Inject
	private CouponService service;

	@Inject
	private LockifmListService service2;
	
	@Inject
	private SeatifmService service1;

	@Inject
	private SlService service4;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String listPage(@ModelAttribute("cri") SearchCriteria cri, Model model,HttpSession session, HttpServletRequest request) throws Exception {


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

		// model.addAttribute("list", service.listCriteria(cri));
		model.addAttribute("list", service.listSearchCriteria(cri));

		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);

		// pageMaker.setTotalCount(service.listCountCriteria(cri));
		pageMaker.setTotalCount(service.listSearchCount(cri));

		model.addAttribute("lockList", service2.lockList());
		model.addAttribute("cntList", service2.cntList());
		model.addAttribute("totList", service2.totList());

		model.addAttribute("pageMaker", pageMaker);

		/* div1 */
		model.addAttribute("seatifmlist", service1.list());
		model.addAttribute("monList", service1.monList());
		/* div4 */
		// Controller 에서 JSP 에게 전송, JSP파일에서는 EL을 사용하여 받는다.
		model.addAttribute("today_sell", service4.today_sell());

		return "coupon/list";
	}

	@RequestMapping(value = "/readPage", method = RequestMethod.GET)
	public void read(@RequestParam("cpn_sq") int cpn_sq, @ModelAttribute("cri") SearchCriteria cri, Model model)
			throws Exception {

		model.addAttribute(service.read(cpn_sq));
		model.addAttribute("lockList", service2.lockList());
		model.addAttribute("cntList", service2.cntList());
		model.addAttribute("totList", service2.totList());
		/* div1 */
		model.addAttribute("seatifmlist", service1.list());
		model.addAttribute("monList", service1.monList());
		model.addAttribute("today_sell", service4.today_sell());
	}

	@RequestMapping(value = "/removePage", method = RequestMethod.POST)
	public String remove(@RequestParam("cpn_sq") int cpn_sq, SearchCriteria cri, RedirectAttributes rttr)
			throws Exception {

		service.remove(cpn_sq);

		rttr.addAttribute("page", cri.getPage());
		rttr.addAttribute("perPageNum", cri.getPerPageNum());
		rttr.addAttribute("searchType", cri.getSearchType());
		rttr.addAttribute("keyword", cri.getKeyword());

		rttr.addFlashAttribute("msg", "SUCCESS");

		return "redirect:/coupon/list";
	}

	@RequestMapping(value = "/modifyPage", method = RequestMethod.GET)
	public void modifyPagingGET(int cpn_sq, @ModelAttribute("cri") SearchCriteria cri, Model model) throws Exception {

		model.addAttribute(service.read(cpn_sq));
		model.addAttribute("lockList", service2.lockList());
		model.addAttribute("cntList", service2.cntList());
		model.addAttribute("totList", service2.totList());
		model.addAttribute("today_sell", service4.today_sell());
		/* div1 */
		model.addAttribute("seatifmlist", service1.list());
		model.addAttribute("monList", service1.monList());
	}

	@RequestMapping(value = "/modifyPage", method = RequestMethod.POST)
	public String modifyPagingPOST(CouponVO coupon, SearchCriteria cri, RedirectAttributes rttr) throws Exception {

		logger.info(cri.toString());
		service.modify(coupon);

		rttr.addAttribute("page", cri.getPage());
		rttr.addAttribute("perPageNum", cri.getPerPageNum());
		rttr.addAttribute("searchType", cri.getSearchType());
		rttr.addAttribute("keyword", cri.getKeyword());


		rttr.addFlashAttribute("msg", "SUCCESS");

		logger.info(rttr.toString());

		return "redirect:/coupon/list";
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void registGET(Model model) throws Exception {

		logger.info("regist get ...........");
		model.addAttribute("lockList", service2.lockList());
		model.addAttribute("cntList", service2.cntList());
		model.addAttribute("totList", service2.totList());
		model.addAttribute("today_sell", service4.today_sell());
		/* div1 */
		model.addAttribute("seatifmlist", service1.list());
		model.addAttribute("monList", service1.monList());
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registPOST(CouponVO coupon, RedirectAttributes rttr) throws Exception {

		logger.info("regist post ...........");
		logger.info(coupon.toString());

		service.regist(coupon);

		rttr.addFlashAttribute("msg", "SUCCESS");

		return "redirect:/coupon/list";
	}

}
