package com.site.domain;

public class MemberVO {
	
/*
drop table t_member;
create table t_member (
	email varchar(50) not null,
	pwd varchar(50) not null,
	name varchar(50),
	role varchar(20),
	primary key (email)
);
insert into t_member
select 'sjkim1013@isu.co.kr', '123123', 'JayTR', 'Admin';
*/
	
	private String email;
	private String pwd;
	private String name;
	private String role;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}