package com.demo.circularqueue;

public class MyCircularQueue<E> {
	private E arr[] = null;
	private int count = 0, front = 0, rear = -1;

	public MyCircularQueue() {
		this(10);
	}

	public MyCircularQueue(int size) {
		arr = (E[]) new Object[size];
	}

	private boolean isEmpty() {
		return count == 0;
	}

	private boolean isFull() {
		return count == arr.length;
	}

	public int size() {
		return count;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		if (!isEmpty()) {
			for (int i = 0; i < count; i++) {
				int index = (front + i) % arr.length;
				sb.append(arr[index]);
				sb.append(",");
			}
			sb.deleteCharAt(sb.length()-1);
		}
		sb.append("]");
		return sb.toString();
	}
	
	public boolean add(E element) {
		if(isFull()) {
			throw new QueueFullException("only "+arr.length+" elements allowed");
		}
		else {
			rear=(rear+1)%arr.length;
			arr[rear]=element;
			count++;
			return true;
		}
	}
	
	public boolean offer(E element) {
		if(isFull()) {
			return false;
		}
		else {
			rear=(rear+1)%arr.length;
			arr[rear]=element;
			count++;
			return true;
		}
	}
	
	public E remove() {
		if(isEmpty()) {
			throw new QueueEmptyException("NoSuchElementException");
		}
		else {
			E element=arr[front];
			front=(front+1)%arr.length;
			count--;
			return element;
		}
	}
	
	public E poll() {
		if(isEmpty()) {
			
			return null;
		}
		else {
			E element=arr[front];
			front=(front+1)%arr.length;
			count--;
			return element;
		}
	}
	
	public E element() {
		if(isEmpty()) {
			throw new QueueEmptyException();
		}
		else {
			return arr[front];
		}
	}

}
