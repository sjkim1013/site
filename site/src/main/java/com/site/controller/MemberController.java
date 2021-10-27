package com.site.controller;

import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.site.domain.MemberVO;
import com.site.service.MemberService;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	
	@Inject
	MemberService memberService;

	// 로그인 화면 조회 
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String getLoginPage(Model model, HttpServletRequest request) throws Exception {
		
		// 로그인 화면을 호출한 화면
		HttpSession session = request.getSession();
		session.setAttribute("pageBeforeLogin", request.getHeader("REFERER"));

		// 쿠키에 메일값이 있으면 가져오기
		Cookie[] cookies = request.getCookies();
		if(cookies != null && cookies.length > 0) {
			for(int i=0; i<cookies.length; i++) {
				if(cookies[i].getName().equals("userMail")) {
					model.addAttribute("email", cookies[i].getValue());
				}
			}
		}
		
		return "login/login";
	}

	// 로그인
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@RequestParam Map<String, Object> param, Model model, HttpServletRequest request, HttpServletResponse response) throws Exception {

		HttpSession session = request.getSession();
		
		Cookie cookie = new Cookie("userMail", (String)param.get("email"));
		if(param.get("chkRemember") != null) {
			// 체크박스 체크가 되었을때 : 쿠키 저장
			response.addCookie(cookie);
		}else {
			// 체크박스 체크가 해제되었을때 : 쿠키 유효시간 0으로 해서 브라우저에서 삭제하게 한다.
			cookie.setMaxAge(0);
			response.addCookie(cookie);
		}

		MemberVO member = new MemberVO();
		member.setEmail((String)param.get("email"));
		member.setPwd((String)param.get("password"));
		
		member = memberService.login(member);

		if(member != null) {
			session.setAttribute("member", member);
		}else {
			if(param.get("chkRemember") != null) {
				model.addAttribute("email", (String)param.get("email"));
			}
			model.addAttribute("message", "로그인에 실패했습니다.\\n아이디 또는 비밀번호를 확인해주세요.");
			return "login/login";
		}

		String pageReturn = session.getAttribute("pageBeforeLogin").toString();
		if(pageReturn == null) {
			return "home";
		}else {
			return "redirect:"+ pageReturn;
		}
	}
	
	// 로그아웃
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public String logout(RedirectAttributes redirAttr, HttpServletRequest request) {

		HttpSession session = request.getSession();
		session.removeAttribute("member");
		
		redirAttr.addFlashAttribute("message", "로그아웃 되었습니다.");
		return "redirect:"+ (String)request.getHeader("REFERER");
	}
	
}