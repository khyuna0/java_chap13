package com.khyuna0.ch13.part01.Exer;

import java.util.Iterator;
import java.util.List;

public class Exer07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		BoardDao dao =  new BoardDao();
		List<Board> BoardList = dao.getBoardDao();
		
		Iterator<Board> iter = BoardList.iterator();
		while (iter.hasNext()) {
			Board board = (Board) iter.next();
			System.out.println(board.getTitle() + board.getContent());
		}
		
		
		
	}

}
