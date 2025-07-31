package com.khyuna0.ch13.Exer;

import java.util.Iterator;
import java.util.List;

public class MemberMain {
	
	public static void main(String[] args) {
		
		MemberDao dao = new MemberDao();
		List<MemberDto> list = dao.getMemberDao();
		
		Iterator<MemberDto> iterator = list.iterator();
		while ( iterator.hasNext()) {
			MemberDto dao2 = (MemberDto) iterator.next();
			System.out.println(dao2.getId() + dao2.getPw() + dao2.getName() + dao2.getEmail());
		}
		
		
	}
}
