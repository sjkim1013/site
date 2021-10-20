package com.site.controller;

import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.site.service.IsuService;

@Controller
@RequestMapping("/isu/*")
public class IsuController {
	
	@Inject
	IsuService isuService;

	// 게시물 목록
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String getIsu(Model model, HttpServletRequest request) throws Exception {

		return "/isu/isu";
	}

	// 게시물 목록
	@RequestMapping(value="/empList", method=RequestMethod.GET)
	public String getEmployeeList(@RequestParam Map<String, Object> param, Model model, HttpServletRequest request) throws Exception {

		String keyword = (String)param.get("sKeyword");
		
		if(keyword != null) {
			model.addAttribute("keyword", keyword);
			model.addAttribute("empList", isuService.selectEmployees(keyword));
		}
		
		return "/isu/isu";
	}
	
}