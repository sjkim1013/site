package com.site.service;

import java.util.List;

import com.site.domain.IsuEmployeeVO;

public interface IsuService {
	// 테스트 조회
	public List<IsuEmployeeVO> selectEmployees(String keyword) throws Exception;
	// 테스트 조회
	public String selectTest() throws Exception;
}
