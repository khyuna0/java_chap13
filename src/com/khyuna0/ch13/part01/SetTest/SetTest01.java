 package com.khyuna0.ch13.part01.SetTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest01 {
	// set은 인덱스 없음
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set1 = new HashSet<String>();
		set1.add("KOR");
		set1.add("JAP");
		set1.add("CHINA");
		set1.add("USA");
		
		System.out.println(set1.size()); // set1에 들어간 총 객체 수 -> 4
		
		set1.add("JAP");
		set1.add("RUSIA");
		set1.add("CHINA");
		
		System.out.println(set1.size());
		
		// Set 객체 가져오는 방법
		
		// 향상된 for 문으로 가져오기
		System.out.println("==============");
		for ( String string : set1 ) {
			System.out.println(string);
		}
		
		System.out.println("==============");
		// Iterator 사용
		Iterator<String> iter = set1.iterator(); // set1 전용 iterator 생성. 반복자 얻기, 값이 저장되는건 아님
		
		while (iter.hasNext()) { // hasNext -> boolean 타입, 가져올 다음 Set 요소(객체)가 있으면 T, 없으면 F 반환
			String setStr = iter.next(); // set 요소(객체)를 꺼내고 iterator 이동
			System.out.println(setStr); // 순서 X 
		}
		
		// Iterator 사용, 객체 꺼내서 바로 삭제하기
		
		while (iter.hasNext()) {
			String setStr = (String) iter.next();
			if (setStr.equals("JAP")) {
				iter.remove();
			}
		}
		
		System.out.println("==============");
		for ( String string : set1 ) {
			System.out.println(string);
		}
		
		System.out.println("==============");
		
		set1.clear(); // 모든 요소 삭제
		for ( String string : set1 ) {
			System.out.println(string);
		}
		
		System.out.println("==============");
		
		if (set1.isEmpty()) {
			System.out.println("비어있음");
		}
		
		
	}
}


