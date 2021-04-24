package com.site.service;

import java.util.List;

import com.site.domain.BoardVO;

public interface BoardService {
	// Board 조회
	public List<BoardVO> list() throws Exception;
}
