package com.site.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.site.dao.BoardDAO;
import com.site.domain.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDAO dao;
	
	@Override
	public List<BoardVO> list() throws Exception {
		return dao.list();
	}

}
