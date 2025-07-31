package com.khyuna0.ch13.part01.Exer;

import java.util.ArrayList;
import java.util.List;

public class BoardDao { // 매개변수 필요 x 
	public List<Board> getBoardDao() { 
		List<Board> list = new ArrayList<Board>();
		list.add(new Board("제목1","내용1"));
		list.add(new Board("제목2","내용2"));
		list.add(new Board("제목3","내용3"));
		
		return list; 
	}
}
