package com.site.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.site.dao.ReplyDAO;
import com.site.domain.ReplyVO;

@Service
public class ReplyServiceImpl implements ReplyService {
	
	@Inject
	ReplyDAO dao;

	@Override
	public List<ReplyVO> select(int bid) throws Exception {
		return dao.select(bid);
	}

	@Override
	public int write(ReplyVO vo) throws Exception {
		return dao.insert(vo);
	}

	@Override
	public int delete(ReplyVO vo) throws Exception {
		return dao.delete(vo);
	}

}
