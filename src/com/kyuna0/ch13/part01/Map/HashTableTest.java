package com.kyuna0.ch13.part01.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class HashTableTest {

	public static void main(String[] args) {
		
		Map<String, String> map1 = new HashMap<String, String>();
		
		map1.put("tiger", "1234"); // id , pw
		map1.put("lion", "4321");
		map1.put("blackcat", "5678");
		map1.put("dog", "8765");
		
		Scanner scanner = new Scanner(System.in);
		
		 while (true) {
			System.out.println("아이디 : ");
			String id = scanner.nextLine();
			 
			System.out.println("비밀번호 : ");
			String pw = scanner.nextLine();
			 
			System.out.println("--------------------------------");
			// containsKey() -> 일치하는 key 값이 포함되어 있는지 판단하는 메소드
			if (map1.containsKey(id)) { 
			// map 에 들어있는 데이터 중에 key 값이 id 값과 일치하는 값이 존재하면 T 반환
				if (map1.get(id).equals(pw)) {
					System.out.println("로그인되었습니다.");
					break;
					} else { // id 값은 존재하나 해당 id 의 비밀번호가 틀린 경우
						System.out.println("비밀번호를 잘못 입력하셨습니다.");
					} else {
						System.out.println("입력하신 아이디가 존재하지 않습니다.");
					
				}
			}
}	