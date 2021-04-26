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
	public List<BoardVO> select() throws Exception {

		return sql.selectList(namespace +".select");
	}

	@Override
	public BoardVO selectOne(int bid) throws Exception {
		
		return sql.selectOne(namespace +".selectOne", bid);
	}

	@Override
	public int modify(BoardVO vo) throws Exception {
		
		return sql.update(namespace +".modify", vo);
	}

	@Override
	public int write(BoardVO vo) throws Exception {

		return sql.insert(namespace +".write", vo);
	}

	@Override
	public int delete(int bid) throws Exception {
		
		return sql.delete(namespace +".delete", bid);
	}

}
