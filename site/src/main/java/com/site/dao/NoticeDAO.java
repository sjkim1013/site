package com.site.dao;

import java.util.List;

import com.site.domain.NoticeVO;

public interface NoticeDAO {
	// Notice 조회
	public List<NoticeVO> list() throws Exception;
}
