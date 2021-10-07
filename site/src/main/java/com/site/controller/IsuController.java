package com.site.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.site.service.IsuService;

@Controller
@RequestMapping("/isu/*")
public class IsuController {
	
	@Inject
	IsuService isuService;

	// 게시물 목록
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String getIsu(Model model, HttpServletRequest request) throws Exception {

		model.addAttribute("test", isuService.selectTest());

		return "/isu/isu";
	}

	// 게시물 목록
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public void getTest(Model model, HttpServletRequest request) throws Exception {

		model.addAttribute("test", isuService.selectTest());
	}
	
}