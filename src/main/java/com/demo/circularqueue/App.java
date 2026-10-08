package com.demo.circularqueue;

public class App {
	public static void main(String[] args) {
		MyCircularQueue<Integer> q = new MyCircularQueue<>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);

		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		
		//System.out.println(q.offer(100));

		q.remove();
		q.poll();
		//System.out.println(q.poll());
		System.out.println(q.element());
		System.out.println(q);
	}
}
