package com.khyuna0.ch13.part02;

import java.util.Stack;

public class StackTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> stack1 = new Stack<String>(); // 스택 = 클래스 
		
		stack1.push("1. kor"); // 스택에 값 넣기 push
		stack1.push("2. jap");
		stack1.push("3. usa");
		
		while (!stack1.isEmpty()) { // isEmpty() -> 스택이 비어있으면 T / ! -> 비어있지 않으면 실행됨
			String string = stack1.pop();
			System.out.println(string);
			// 후입선출 3 -> 2 -> 1 순으로 출력된다
			
			
		}
		
	}

}
