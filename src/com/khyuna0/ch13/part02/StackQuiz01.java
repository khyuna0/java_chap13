package com.khyuna0.ch13.part02;

import java.util.Stack;

// 스택 사용 문자열 뒤집기 : Hello 문자열을 거꾸로 출력 

public class StackQuiz01 {

	public static void main(String[] args) {
		
		String string = "Hello";
		
		Stack<Character> strStack = new Stack<Character>();
		
		 for (int i=0;i<string.length();i++) {
			 char ch = string.charAt(i);
			 strStack.push(ch);
		 }
		
		 while (!strStack.isEmpty()) {
			 System.out.print(strStack.pop());
		 }
	}
	
}
