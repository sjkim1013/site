package com.site.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.site.domain.ReplyVO;

@Repository
public class ReplyDAOImpl implements ReplyDAO {
	
	@Inject
	private SqlSession sql;
	
	private static String namespace = "com.site.mappers.reply";

	@Override
	public List<ReplyVO> select(int bid) throws Exception {
		return sql.selectList(namespace + ".select", bid);
	}

	@Override
	public int insert(ReplyVO vo) throws Exception {
		return sql.insert(namespace + ".insert", vo);
	}

	@Override
	public int delete(ReplyVO vo) throws Exception {
		return sql.delete(namespace +".delete", vo);
	}

}
