package com.site.service;

import com.site.domain.MemberVO;

public interface MemberService {
	// 로그인
	public MemberVO login(MemberVO member) throws Exception;
}
