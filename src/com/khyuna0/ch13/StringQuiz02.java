package com.khyuna0.ch13;

import java.util.Stack;

// ( ) ( ) (  -> 유효한지 아닌지 출력하는 프로그램
public class StringQuiz02 {

	public static void main(String[] args) {

		String str = "(())())"; // -> 유효하지 않은 구성입니다.
		
		Stack<Character> strStack = new Stack<Character>();
		
		 for (int i=0;i<str.length();i++) {
			 char ch = str.charAt(i);
			 
			 if (ch == '(') {
				 strStack.push(ch);
			 } else { 
				if (strStack.isEmpty()) {
					System.out.println("유효하지 않은 구성입니다.");
					return;
				}
				strStack.pop(); // ')' 들어온 ')'의 짝이 추출된다
			}
			 
			 
		 }
		
		 if (strStack.isEmpty()) {
			 System.out.println("유효한 구성입니다.");
		 } else {
			System.out.println("유효하지 않은 구성입니다.");
		}
		 
	}

}
