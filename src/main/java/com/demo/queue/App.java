package com.demo.queue;

public class App {
	public static void main(String[] args) {
		MyDeque<Integer> deque=new MyDeque<>(5);
		deque.offerLast(10);
		deque.offerLast(20);
		deque.offerLast(30);
		deque.pollFirst();
		System.out.println(deque);
		System.out.println(deque.size());
	}
}
