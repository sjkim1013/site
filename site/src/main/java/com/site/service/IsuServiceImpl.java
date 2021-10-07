package com.site.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.site.dao.IsuDAO;

@Service
public class IsuServiceImpl implements IsuService {
	
	@Inject
	private IsuDAO dao;

	@Override
	public String selectTest() throws Exception {

		return dao.selectTest();
	}

}
