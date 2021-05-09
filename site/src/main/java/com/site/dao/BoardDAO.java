package com.site.dao;

import java.util.List;

import com.site.domain.BoardVO;

public interface BoardDAO {
	// 게시물 목록 조회
	public List<BoardVO> select() throws Exception;
	// 게시물 조회
	public BoardVO selectOne(int bid) throws Exception;
	// 게시물 수정
	public int update(BoardVO vo) throws Exception;
	// 게시물 등록
	public int insert(BoardVO vo) throws Exception;
	// 게시물 삭제
	public int delete(int bid) throws Exception;
}
