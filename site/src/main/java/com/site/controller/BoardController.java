package com.site.controller;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.site.domain.BoardVO;
import com.site.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@Inject
	BoardService boardService;

	// 게시물 목록
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String getList(@RequestParam Map<String, Object> param, Model model) throws Exception {
		
		List<BoardVO> list = null;
		list = boardService.select();
		
		model.addAttribute("list", list);
		return "/board/boardList";
	}
	
	// 게시물 상세 화면
	@RequestMapping(value="/view", method=RequestMethod.GET)
	public String getView(@RequestParam Map<String, Object> param, Model model) throws Exception {
		
		int bid = Integer.parseInt((String)param.get("bid"));
		BoardVO vo  = boardService.selectOne(bid);

		// Content 줄바꿈 처리
		vo.setContent(vo.getContent().replace("\r\n", "<br>"));
		
		model.addAttribute("view", vo);
		return "/board/boardDetail";
	}
	
	// 게시물 수정 화면
	@RequestMapping(value="/modify", method=RequestMethod.GET)
	public String getModify(@RequestParam Map<String, Object> param, Model model) throws Exception {
		
		int bid = Integer.parseInt((String)param.get("bid"));
		BoardVO vo  = boardService.selectOne(bid);
		
		model.addAttribute("view", vo);
		return "/board/boardModify";
	}
	
	// 게시물 수정
	@RequestMapping(value="/modify", method=RequestMethod.POST)
	public String postModify(BoardVO vo) throws Exception {
		
		boardService.modify(vo);
		
		return "redirect:/board/view?bid="+ vo.getBid();
	}

	// 게시물 등록
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String postWrite(BoardVO vo) throws Exception {
		
		boardService.write(vo);
		
		return "redirect:/board/list";
	}

	// 게시물 삭제
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String postDelete(@RequestParam Map<String, Object> param) throws Exception {
		
		int bid = Integer.parseInt((String)param.get("bid"));
		
		boardService.delete(bid);
		
		return "redirect:/board/list";
	}

}
