package com.demo.linearqueue;

public class MyQueue<E> {
	private E[] arr;
	private int rear = -1;

	public MyQueue() {
		this(10);
	}

	public MyQueue(int size) {
		arr = (E[]) new Object[size];
	}

	public boolean isEmpty() {
		return rear == -1;
	}

	public int size() {
		return rear + 1;
	}

	public boolean isFull() {
		return rear == arr.length - 1;
	}
	
	public String toString() {
		StringBuilder sb=new StringBuilder("[");
		if(!isEmpty()) {
			for(int i=0;i<=rear;i++) {
				sb.append(arr[i]);
				sb.append(",");
			}
			sb.deleteCharAt(sb.length()-1);
		}
		sb.append("]");
		
		return sb.toString();
	}
	
	public void offer(E element) {
		if(isFull()) {
			throw new QueueFullException("only "+arr.length+" elements allowed");
		}
		else {
			arr[++rear]=element;
		}
	}
	
	public E poll() {
		if(isEmpty()) {
			throw new QueueEmptyException();
		}
		else {
			E element=arr[0];
			for(int i=1;i<=rear;i++) {
				arr[i-1]=arr[i];
			}
			arr[rear] = null;
			rear--;
			return element;
		}
	}
	
	public E element() {
		if(isEmpty()) {
			throw new QueueEmptyException();
		}
		else {
			return arr[0];
		}
	}
	
}
