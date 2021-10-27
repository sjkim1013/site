package com.site.dao;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.site.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	@Autowired
	@Resource(name="sqlSessionMaria")
	private SqlSession sql;
	
	private static String namespace = "com.site.mappers.member";

	@Override
	public MemberVO login(MemberVO member) throws Exception {
		
		return sql.selectOne(namespace +".loginSelect", member);
	}

}
