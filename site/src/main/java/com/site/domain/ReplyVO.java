package com.site.domain;

import java.util.Date;

public class ReplyVO {

/*
DROP TABLE tbl_reply;
CREATE TABLE tbl_reply (
	rid INT NOT NULL AUTO_INCREMENT,
	bid INT NOT NULL,
	writer VARCHAR(30) default '익명',
	content TEXT,
	createTime TIMESTAMP NOT NULL default NOW(),
	password VARCHAR(30) default '0000',
	PRIMARY KEY (rid, bid)
);
INSERT INTO tbl_reply (bid, writer, content)
SELECT 1, '김선재', '테스트 댓긋 입니다.' UNION ALL
SELECT 1, '김선재', '테스트 댓글 입니다.' UNION ALL
SELECT 1, '김선재', '테스트 댓글 입니다.'
;
 */
	private int rid;
	private int bid;
	private String writer;
	private String content;
	private Date createTime;
	private String password;

	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
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
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
