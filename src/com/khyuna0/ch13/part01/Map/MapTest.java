package com.khyuna0.ch13.part01.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {
	
	public static void main(String[] args) {
		Map<String, String> map1 = new HashMap<String, String>(); // 타입 파라미터 <> 안에 객체만 가능 
		
		// 인덱스 대신 key 사용 
		// key 중복 저장 불가, value 중복 저장 가능
		// 객체 값에 대한 명시 위함
		    
		 map1.put("이름", "홍길동"); // put -> 데이터 삽입 ( key, value )
		 map1.put("직업", "개발자");
		 map1.put("성별", "남자");
		 //map1.put("성별", "여자"); -> 불가! 성별 값이 여자로 바뀜. 2개로 저장 x
		 
		 
		 // map1.get(key값) -> key 값으로 value 값 가져오기
		 System.out.println(map1.get("이름"));
		 System.out.println(map1.get("직업"));
		 System.out.println(map1.get("성별"));

		 Map<String, Integer> map2 = new HashMap<String, Integer>();	
		 
		 map2.put("홍길동", 90);
		 map2.put("이순신", 80);
		 map2.put("김유신", 70);
		 map2.put("강감찬", 85);
		 
		 map2.put("강감찬", 95); // -> 값이 수정됨
		 
//		 Iterator 사용가능
		 
		 
		 
		 
		 
	}	
}
