package com.site.controller;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.site.domain.BoardVO;
import com.site.domain.ReplyVO;
import com.site.service.BoardService;
import com.site.service.ReplyService;

@Controller
@RequestMapping("/boardPrev/*")
public class BoardPrevController {
	
	@Inject
	BoardService boardService;

	@Inject
	ReplyService replyService;

	// 게시물 목록
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String getList(@RequestParam Map<String, Object> param, Model model, HttpServletRequest request) throws Exception {
		
		List<BoardVO> list = null;
		list = boardService.select();
		
		// iframe 세션 유지
		HttpSession session = request.getSession();
		session.setAttribute("mainIframeSession", "prev/board/list");
		
		model.addAttribute("list", list);
		return "prev/board/boardList";
	}
	
	// 게시물 상세 화면
	@RequestMapping(value="/view", method=RequestMethod.GET)
	public String getView(@RequestParam Map<String, Object> param, Model model, HttpServletRequest request) throws Exception {
		
		int bid = Integer.parseInt((String)param.get("bid"));
		BoardVO vo  = boardService.selectOne(bid);

		// Content 줄바꿈 처리
		vo.setContent(vo.getContent().replace("\r\n", "<br>"));
		
		// 댓글 조회
		List<ReplyVO> replyList = null;
		replyList = replyService.select(bid);

		// 댓글 Content 줄바꿈 처리
		ReplyVO replyVo = null;
		for(int i=0; i<replyList.size(); i++) {
			replyVo = replyList.get(i);
			replyVo.setContent(replyVo.getContent().replace("\r\n", "<br>"));
			replyList.set(i, replyVo);
		}
		
		// iframe 세션 유지
		HttpSession session = request.getSession();
		session.setAttribute("mainIframeSession", "board/view?bid="+ bid);
		
		model.addAttribute("view", vo);
		model.addAttribute("reply", replyList);
		return "prev/board/boardDetail";
	}
	
	// 게시물 수정 화면
	@RequestMapping(value="/modify", method=RequestMethod.GET)
	public String getModify(@RequestParam Map<String, Object> param, Model model, HttpServletRequest request) throws Exception {
		
		int bid = Integer.parseInt((String)param.get("bid"));
		BoardVO vo  = boardService.selectOne(bid);
		
		// iframe 세션 유지
		HttpSession session = request.getSession();
		session.setAttribute("mainIframeSession", "board/modify?bid="+ bid);
		
		model.addAttribute("view", vo);
		return "prev/board/boardModify";
	}
	
	// 게시물 수정
	@RequestMapping(value="/modify", method=RequestMethod.POST)
	public String postModify(BoardVO vo) throws Exception {
		
		boardService.modify(vo);
		
		return "redirect:prev/board/view?bid="+ vo.getBid();
	}

	// 게시물 등록
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String postWrite(BoardVO vo) throws Exception {
		
		boardService.write(vo);
		
		return "redirect:prev/board/list";
	}

	// 게시물 삭제
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String postDelete(@RequestParam Map<String, Object> param) throws Exception {
		
		int bid = Integer.parseInt((String)param.get("bid"));
		
		boardService.delete(bid);
		
		return "redirect:prev/board/list";
	}

}
