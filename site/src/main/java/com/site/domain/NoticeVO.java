package com.site.domain;

import java.util.Date;

public class NoticeVO {

/*
	CREATE TABLE tbl_notice (
		notice_id INT NOT NULL AUTO_INCREMENT,
		title VARCHAR(100) NOT NULL,
		writer VARCHAR(30),
		content TEXT,
		createdTime TIMESTAMP NOT NULL default NOW(),
		PRIMARY KEY (notice_id)
	)
 */
	private int notice_id;
	private String title;
	private String writer;
	private String content;
	private Date createdTime;
	
	public int getNotice_id() {
		return notice_id;
	}
	public void setNotice_id(int notice_id) {
		this.notice_id = notice_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	
}
