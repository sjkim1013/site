package com.site.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.site.dao.NoticeDAO;
import com.site.domain.NoticeVO;

@Service
public class NoticeServiceImpl implements NoticeService {

	@Inject
	private NoticeDAO dao;
	
	@Override
	public List<NoticeVO> list() throws Exception {
		return dao.list();
	}

}
