package com.site.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.site.domain.NoticeVO;

@Repository
public class NoticeDAOImpl implements NoticeDAO {
	@Inject
	private SqlSession sql;
	
	private static String namespace = "com.site.mappers.notice";

	@Override
	public List<NoticeVO> list() throws Exception {

		return sql.selectList(namespace +".list");
	}

}
