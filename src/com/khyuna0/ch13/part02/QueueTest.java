package com.khyuna0.ch13.part02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new LinkedList<String>();
		
		queue.offer("kor");
		queue.offer("usa");
		queue.offer("jap");
		
		while (!queue.isEmpty()) {
			System.out.println(queue.poll() );
		}
		
	}

}
