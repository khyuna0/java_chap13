package com.khyuna0.ch13.Exer;

import java.util.ArrayList;
import java.util.List;

public class MemberDao {
	public List<MemberDto> getMemberDao() {
		List<MemberDto> list = new ArrayList<MemberDto>();
		
		list.add(new MemberDto("tiger", "12345", "홍길동", "tiger@abc.com"));
		list.add(new MemberDto("lion", "54321", "이순신", "lion@abc.com"));
		list.add(new MemberDto("blackcat", "56789", "김유신", "blackcat@abc.com"));
		list.add(new MemberDto("whitedog", "98765", "강감찬", " whitedog@abc.com"));
		
		return list;
	}
}
