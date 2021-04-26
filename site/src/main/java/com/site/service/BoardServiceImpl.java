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
	public List<BoardVO> select() throws Exception {
		return dao.select();
	}

	@Override
	public BoardVO selectOne(int bid) throws Exception {

		return dao.selectOne(bid);
	}

	@Override
	public int modify(BoardVO vo) throws Exception {

		return dao.modify(vo);
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
