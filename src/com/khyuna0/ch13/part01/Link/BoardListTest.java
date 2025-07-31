package com.khyuna0.ch13.part01.Link;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.khyuna0.ch13.part01.Exer.Board;

public class BoardListTest {
	
	public static void main(String[] args) {
		
		List<Board> boardList = new ArrayList<Board>();
		Date nowDate = new Date(); // 현재 오늘 날짜 시간
		
		// 방법 1
		Board board1 = new Board();
		board1.setWriter("홍길동");
		board1.setSubjext("안녕하세요");
		board1.setContent("가입인사");
		board1.setDateTimestamp(new Timestamp(nowDate.getTime()));
		
		boardList.add(board1);
		
		// 2
		boardList.add(new Board("이순신", "저는 이순신입니다.", "저는 조선의 해군 장군입니다.", new Timestamp(nowDate.getTime())));
		
		// 3
		Board board2 = new Board("김유신", "저는 김유신입니다.", "저는 신라의 장군입니다.", new Timestamp(nowDate.getTime()));
		boardList.add(board2);
		
		System.out.println("   제목	/	 글내용	 /	 글쓴이	 /	 글쓴날짜	");
		System.out.println("======================");
		for(int i=0;i<boardList.size();i++) {
			Board board = boardList.get(i);
			System.out.println(board.getSubjext() + " / "  + board.getContent() + " / " + board.getWriter() + " / " + board.getDateTimestamp());
			System.out.println("======================");
		}
		
		
		
		
	}
}
