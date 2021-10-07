package com.site.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.site.domain.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {
	@Autowired
	@Resource(name="sqlSessionMaria")
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
	public int update(BoardVO vo) throws Exception {
		
		return sql.update(namespace +".update", vo);
	}

	@Override
	public int insert(BoardVO vo) throws Exception {

		return sql.insert(namespace +".insert", vo);
	}

	@Override
	public int delete(int bid) throws Exception {
		
		return sql.delete(namespace +".delete", bid);
	}

}
