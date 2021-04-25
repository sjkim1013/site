package com.site.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.site.domain.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {
	@Inject
	private SqlSession sql;
	
	private static String namespace = "com.site.mappers.board";

	@Override
	public List<BoardVO> list() throws Exception {

		return sql.selectList(namespace +".list");
	}

	@Override
	public int write(BoardVO vo) throws Exception {

		return sql.insert(namespace +".write", vo);
	}

}
