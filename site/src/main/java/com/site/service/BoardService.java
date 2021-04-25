package com.site.service;

import java.util.List;

import com.site.domain.BoardVO;

public interface BoardService {
	// 게시물 목록 조회
	public List<BoardVO> list() throws Exception;
	// 게시물 등록
	public int write(BoardVO vo) throws Exception;
}
