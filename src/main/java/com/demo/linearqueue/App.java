package com.demo.linearqueue;

import java.util.Queue;

public class App {
	public static void main(String[] args) {
		MyQueue<Integer> myQueue=new MyQueue<>();
		
		myQueue.offer(10);
		myQueue.offer(20);
		myQueue.offer(30);
		myQueue.offer(40);
		myQueue.offer(50);
		myQueue.offer(60);
		
		System.out.println(myQueue);
		System.out.println(myQueue.poll());
		System.out.println(myQueue);
	}
}
