package com.site.service;

import java.util.List;

import com.site.domain.ReplyVO;

public interface ReplyService {
	// 댓글 목록 조회
	public List<ReplyVO> select(int bid) throws Exception;
	// 댓글 등록
	public int write(ReplyVO vo) throws Exception;
	// 댓글 삭제
	public int delete(ReplyVO vo) throws Exception;
}
