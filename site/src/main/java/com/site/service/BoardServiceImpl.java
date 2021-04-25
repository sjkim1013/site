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

	@Override
	public BoardVO view(int bid) throws Exception {

		return dao.view(bid);
	}

	@Override
	public int write(BoardVO vo) throws Exception {
		return dao.write(vo);
	}

	@Override
	public int delete(int bid) throws Exception {
		
		return dao.delete(bid);
	}

}
