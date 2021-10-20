package com.site.domain;

public class IsuEmployeeVO {

/*
select
  a.ENT_CODE,
  ent.NAME as ent_name,
  a.UNIT_CODE,
  un.NAME as unit_name,
  a.PERSON_CODE,
  a.DISPLAY_NAME as name,
  a.PSTN_CODE as jikchak_code,
  jp.NAME as jikchak_name,
  a.OFFICE_TEL,
  a.MOBILE_TEL,
  a.email,
  case when a.USAGE_STATE = 'A' then '사용' else '사용안함' end as 사용여부,
  'http://gw.isu.co.kr/CoviWeb/gate/AutoAuthentication.aspx?UserID='+ a.PERSON_CODE +'&BackUrl=/coviweb' as gw_link
from ORG_PERSON a
inner join ORG_ENTERPRISE ent on ent.ENT_CODE = a.ENT_CODE
inner join ORG_UNIT un on un.UNIT_CODE = a.UNIT_CODE
inner join ORG_JOBPOSITION jp on jp.PSTN_CODE = a.PSTN_CODE
where 1=1
and a.USAGE_STATE = 'A'
and (a.DISPLAY_NAME like '%'+ @keyword +'%'
  or a.PERSON_CODE like '%'+ @keyword +'%'
  or a.OFFICE_TEL like '%'+ @keyword +'%'
  or a.MOBILE_TEL like '%'+ @keyword +'%'
  or a.EMAIL like '%'+ @keyword +'%')
*/
	private String ent_code;
	private String ent_name;
	private String unit_code;
	private String unit_name;
	private String person_code;
	private String name;
	private String jikchak_code;
	private String jikchak_name;
	private String office_tel;
	private String mobile_tel;
	private String email;
	private String gw_link;
	
	public String getEnt_code() {
		return ent_code;
	}
	public void setEnt_code(String ent_code) {
		this.ent_code = ent_code;
	}
	public String getEnt_name() {
		return ent_name;
	}
	public void setEnt_name(String ent_name) {
		this.ent_name = ent_name;
	}
	public String getunit_code() {
		return unit_code;
	}
	public void setunit_code(String unit_code) {
		this.unit_code = unit_code;
	}
	public String getunit_name() {
		return unit_name;
	}
	public void setunit_name(String unit_name) {
		this.unit_name = unit_name;
	}
	public String getPerson_code() {
		return person_code;
	}
	public void setPerson_code(String person_code) {
		this.person_code = person_code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJikchak_code() {
		return jikchak_code;
	}
	public void setJikchak_code(String jikchak_code) {
		this.jikchak_code = jikchak_code;
	}
	public String getJikchak_name() {
		return jikchak_name;
	}
	public void setJikchak_name(String jikchak_name) {
		this.jikchak_name = jikchak_name;
	}
	public String getOffice_tel() {
		return office_tel;
	}
	public void setOffice_tel(String office_tel) {
		this.office_tel = office_tel;
	}
	public String getMobile_tel() {
		return mobile_tel;
	}
	public void setMobile_tel(String mobile_tel) {
		this.mobile_tel = mobile_tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGw_link() {
		return gw_link;
	}
	public void setGw_link(String gw_link) {
		this.gw_link = gw_link;
	}
	
}
