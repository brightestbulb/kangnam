package org.kangnam.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.kangnam.domain.PageMaker;
import org.kangnam.domain.SearchCriteria;
import org.kangnam.service.SellTotalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin/*") // 포트 번호 다음에 입력하는 url 인듯 하다.
public class SellTotalController
{
	private static final Logger logger = LoggerFactory.getLogger(LockifmController.class);

	// 연결할 Service 클래스를 설정해준다.
	@Inject
	private SellTotalService service;

	@RequestMapping(value = "/sellTotal", method = RequestMethod.GET)
	public String list(@ModelAttribute("cri") SearchCriteria cri, Model model,HttpSession session, HttpServletRequest request) throws Exception
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

		// SellTotal은 admin 계정만 볼 수 있어야 한다.
		if (!admn_id.equals("admin"))
			return "redirect:/member/list";


		logger.info(cri.toString());

		// Controller 에서 JSP 에게 전송 JSP파일에서는 EL을 사용하여 받는다.
		model.addAttribute("list", service.listSearchCriteria(cri));

		// PageMaker 객체 생성 페이징 처리 역할을 맡는다.
		PageMaker pageMaker = new PageMaker();

		pageMaker.setCri(cri);
		pageMaker.setTotalCount(service.listSearchCount(cri));

		// Controller 에서 JSP 에게 전송 JSP파일에서는 EL을 사용하여 받는다.
		model.addAttribute("pageMaker", pageMaker);

		// 총합 보내기
		model.addAttribute("total", service.totallist(cri));


		// JSP 파일 경로 (폴더명 / 파일명을 리턴해준다.)
		return "admin/sellTotal";
	}
}
