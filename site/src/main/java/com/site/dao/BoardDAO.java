package com.site.dao;

import java.util.List;

import com.site.domain.BoardVO;

public interface BoardDAO {
	// Board 조회
	public List<BoardVO> list() throws Exception;
}
