package com.khyuna0.ch13.part01.Exer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapMaxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		// entrySet 사용하는 방법
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("red", 86);
		map.put("blue", 85);
		map.put("yellow", 84);
		
		String name = null; // 최고점 id 저장
		int maxScore = 0; // 최고 점수 저장
		int totalScore = 0; // 점수 합계 저장
		
		// entrySet 메소드로 Map.Entry를 set 컬렉션으로 얻음
		Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
		
		while ( iter.hasNext()) { // 반복자를 통해 Map.entry를 하나씩 얻음
			Map.Entry<String, Integer> entry = iter.next();
//			System.out.println(entry.getKey());
//			System.out.println(entry.getValue());
			totalScore += entry.getValue();
			
			if ( entry.getValue() > maxScore ) {
				maxScore = entry.getValue();
				name = entry.getKey();
			}
			
		}
		
		System.out.println("최고 점수 받은 id : " + name);
		System.out.println("최고점 : " + maxScore);
		System.out.println("평균점수 : " + (totalScore / map.size()) );
		System.out.println(" 총점 : " + totalScore);
		
	
	}

}
