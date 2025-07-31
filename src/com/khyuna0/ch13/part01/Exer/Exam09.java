package com.khyuna0.ch13.part01.Exer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Exam09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 90);
		map.put("white", 86);
		map.put("hong", 76);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Iterator<String> keyIter = map.keySet().iterator();
		
		while (keyIter.hasNext()) {
			String key = (String) keyIter.next();
			totalScore += map.get(key);
		
			if ( map.get(key) > maxScore ) {
				maxScore = map.get(key);
				name = key;
			}
		}	
		
		
		
		
		System.out.println(" 총점 : " + totalScore);
		System.out.println(" 최고점 : " + maxScore);	
		System.out.println(" 최고점 받은 아이디 : " + name);		
			
		
		}
		
	}


