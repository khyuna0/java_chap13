package com.khyuna0.ch12.part01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Kor");
		list.add("Jap"); 
		list.add(1, "USA"); // 1번 인덱스로 추가됨

		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));


		list.remove(1); //인덱스 1 삭제
		
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		System.out.println("==============");
		for ( String string : list ) {
			System.out.println(string);
		}
		
		System.out.println("==============");
		// Iterator 사용
		
		Iterator<String> iterator = list.iterator();
		
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		
		
		
		
		
		
		
		
	}	

}
