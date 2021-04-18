package com.site.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/notice/*")
public class NoticeController {

	// 게시물 목록
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String getList(Model model) throws Exception {
		
//		List<BoardVO> list = null;
//		list = service.list();
		
//		model.addAttribute("list", list);
		return "notice/noticeList";
	}

}
