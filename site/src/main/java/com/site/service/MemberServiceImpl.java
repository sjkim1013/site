package com.site.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.site.dao.MemberDAO;
import com.site.domain.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Inject
	private MemberDAO dao;

	@Override
	public MemberVO login(MemberVO member) throws Exception {
		
		return dao.login(member);
	}

}
