package com.site.controller;

import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.site.domain.ReplyVO;
import com.site.service.ReplyService;

@Controller
@RequestMapping("/reply/*")
public class ReplyController {
	
	@Inject
	ReplyService replyService;

	// 댓글 등록
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String postWrite(ReplyVO vo) throws Exception {
		
		replyService.write(vo);
		
		return "redirect:/board/view?bid="+ vo.getBid();
	}

	// 댓글 삭제
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String postDelete(@RequestParam Map<String, Object> param) throws Exception {
		
		int bid = Integer.parseInt((String)param.get("bid"));
		int rid = Integer.parseInt((String)param.get("rid"));
		
		ReplyVO vo = new ReplyVO();
		vo.setBid(bid);
		vo.setRid(rid);
		
		replyService.delete(vo);
		
		return "redirect:/board/view?bid="+ vo.getBid();
	}

}
