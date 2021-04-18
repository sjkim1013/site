package com.site.service;

import java.util.List;

import com.site.domain.NoticeVO;

public interface NoticeService {
	// Notice 조회
	public List<NoticeVO> list() throws Exception;
}
