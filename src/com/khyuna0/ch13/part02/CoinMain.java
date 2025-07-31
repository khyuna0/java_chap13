package com.khyuna0.ch13.part02;

import java.util.Stack;

public class CoinMain {

	public static void main(String[] args) {
		
		Stack<Coin> coinBox = new Stack<Coin>();
		// Coin 클래스로 만든 객체만 들어올 수 있는 stack 컬렉션 coinBox 선언
		
		coinBox.push(new Coin(100)); // 100원 짜리 동전 1개 생성 -> 코인박스에 삽입
		coinBox.push(new Coin(500)); // 500원 짜리 동전 1개 생성 -> 코인박스에 삽입
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50)); // 50원 짜리 동전 1개 생성 -> 코인박스에 삽입
		
		while (!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전은 " + coin.getValue() + "원" );
		}

	}

}
