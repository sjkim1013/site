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
		list = boardService.list();
		
		model.addAttribute("list", list);
		return "board/boardList";
	}

	// 게시물 등록
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String postWrite(BoardVO vo) throws Exception {
		
		boardService.write(vo);
		
		return "redirect:/board/list";
	}

}
