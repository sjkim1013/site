package com.site.domain;

import java.util.Date;

public class BoardVO {

/*
	CREATE TABLE tbl_board (
		board_id INT NOT NULL AUTO_INCREMENT,
		title VARCHAR(100) NOT NULL,
		writer VARCHAR(30),
		content TEXT,
		createTime TIMESTAMP NOT NULL default NOW(),
		PRIMARY KEY (board_id)
	)
 */
	private int board_id;
	private String title;
	private String writer;
	private String content;
	private Date createTime;
	
	public int getBoard_id() {
		return board_id;
	}
	public void setBoard_id(int board_id) {
		this.board_id = board_id;
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
	public Date getcreateTime() {
		return createTime;
	}
	public void setcreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
}
