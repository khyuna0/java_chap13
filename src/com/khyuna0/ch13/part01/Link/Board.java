package com.khyuna0.ch13.part01.Link;

import java.sql.Timestamp;

public class Board {
// 글 한개를 저장하는 객체 ( 글쓴이, 글 제목, 글 내용, 글쓴 날짜 ) -> DTO클래스
	
	// 필드
	private String writer;	
	private String subjext;
	private String content;
	private Timestamp dateTimestamp;
	
	// 생성자
	public Board(String writer, String subjext, String content, Timestamp dateTimestamp) {
		super();
		this.writer = writer;
		this.subjext = subjext;
		this.content = content;
		this.dateTimestamp = dateTimestamp; // 오늘 날짜 저장하기
	}

	public Board() {
		super();
		// TODO Auto-generated constructor stub
	}

	// getter setter
	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getSubjext() {
		return subjext;
	}

	public void setSubjext(String subjext) {
		this.subjext = subjext;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getDateTimestamp() {
		return dateTimestamp;
	}

	public void setDateTimestamp(Timestamp dateTimestamp) {
		this.dateTimestamp = dateTimestamp;
	}
		
	
	

}
