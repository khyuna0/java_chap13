package com.khyuna0.ch13.part01.Exer;

public class MaxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 배열에서 최대값 찾기 알고리즘
		
		// 아래 배열 요소 중 최고 점수를 출력하시오
		
		int[] scores = {10, 20, 30, 40, 50};
		
		int maxScore = 0; // 0 대신 0번 인덱스 값 넣어도 무방
		
		for ( int score : scores ) {
			if ( score > maxScore ) {
				maxScore = score;
			}
		}
		
		System.out.println(maxScore);
		
	}

}
