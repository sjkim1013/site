package com.site.domain;

import java.util.Date;

public class BoardVO {

/*
DROP TABLE tbl_board;
CREATE TABLE tbl_board (
	bid INT NOT NULL AUTO_INCREMENT,
	title VARCHAR(100) NOT NULL,
	writer VARCHAR(30),
	content TEXT,
	createTime TIMESTAMP NOT NULL default NOW(),
	viewCnt INT default 0,
	PRIMARY KEY (bid)
);
INSERT INTO tbl_board (title, writer, content)
SELECT '테스트1', '김선재', '테스트 게시글 입니다.' UNION ALL
SELECT '테스트2', '김선재', '테스트 게시글 입니다.' UNION ALL
SELECT '테스트3', '김선재', '테스트 게시글 입니다.'
;
 */
	private int bid;
	private String title;
	private String writer;
	private String content;
	private Date createTime;
	private int viewCnt;
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
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
	public int getViewCnt() {
		return viewCnt;
	}
	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}
	
}
