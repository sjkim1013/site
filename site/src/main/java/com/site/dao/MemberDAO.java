package com.site.dao;

import com.site.domain.MemberVO;

public interface MemberDAO {
	// 로그인
	public MemberVO login(MemberVO member) throws Exception;
}
