package com.site.dao;

import java.util.List;

import com.site.domain.IsuEmployeeVO;

public interface IsuDAO {
	// 직원 검색
	public List<IsuEmployeeVO> selectEmployees(String keyword) throws Exception;
	// 테스트 조회
	public String selectTest() throws Exception;
}
