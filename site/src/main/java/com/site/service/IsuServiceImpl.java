package com.site.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.site.dao.IsuDAO;
import com.site.domain.IsuEmployeeVO;

@Service
public class IsuServiceImpl implements IsuService {
	
	@Inject
	private IsuDAO dao;

	@Override
	public List<IsuEmployeeVO> selectEmployees(String keyword) throws Exception {

		return dao.selectEmployees(keyword);
	}

	@Override
	public String selectTest() throws Exception {

		return dao.selectTest();
	}

}
