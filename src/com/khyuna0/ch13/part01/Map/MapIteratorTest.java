package com.khyuna0.ch13.part01.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// map - iterator -> 키 값만 뽑아냄
		
		Map<String, String> map1 =  new HashMap<String, String>();
		
		map1.put("이름", "홍길동"); 
		map1.put("직업", "개발자");
		map1.put("직장", "서울자동차");
		
		
		// Map 에 Iterator 쓰기
		
		Iterator<String> iter = map1.keySet().iterator(); // key 값에 대해서 iterator 사용
		
		while ( iter.hasNext()) {
			String key = iter.next(); // key 값을 추출
			System.out.println(map1.get(key)); // key 값을 이용하여 value 가져오기
		}
		
		System.out.println("=============================");
		
		Iterator<Map.Entry<String, String>> iter2 = map1.entrySet().iterator(); 
		
		// 키, 값 한 쌍에 대해서 iterator 사용
		while ( iter2.hasNext()) {
			Map.Entry<String, String> entry = iter2.next();
			System.out.println(entry.getKey()); // key 값 가져오기
			System.out.println(entry.getValue()); // value 값 가져오기
		}
		
	}

}
