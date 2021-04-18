package com.site.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.site.domain.NoticeVO;
import com.site.service.NoticeService;

@Controller
@RequestMapping("/notice/*")
public class NoticeController {
	
	@Inject
	NoticeService noticeService;

	// 게시물 목록
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String getList(Model model) throws Exception {
		
		List<NoticeVO> list = null;
		list = noticeService.list();
		
		model.addAttribute("list", list);
		return "notice/noticeList";
	}

}
