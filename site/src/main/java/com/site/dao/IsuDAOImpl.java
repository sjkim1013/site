package com.site.dao;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class IsuDAOImpl implements IsuDAO {
	@Autowired
	@Resource(name="sqlSessionGW")
	private SqlSession sql;
	
	private static String namespace = "com.site.mappers.isu";

	@Override
	public String selectTest() throws Exception {
		
		return sql.selectOne(namespace +".selectTest");
	}

}
