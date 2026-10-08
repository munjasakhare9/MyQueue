package com.demo.queue;

public class MyDeque<E> {
	private E[] arr=null;
	private int count=0, front=0, rear=-1;
	
	public MyDeque() {
		this(10);
	}
	
	public MyDeque(int size) {
		arr=(E[]) new Object[size];
	}
	
	public boolean isFull() {
		return count==arr.length;
	}
	
	public boolean isEmpty() {
		return count==0;
	}
	
	public int size() {
		return count;
	}
	
	public String toString() {
		StringBuilder sb=new StringBuilder("[");
		if(!isEmpty()) {
			for(int i=0;i<count;i++) {
				int index=(front+i)%arr.length;
				sb.append(arr[index]);
				sb.append(",");
			}
			sb.deleteCharAt(sb.length()-1);
		}
		sb.append("]");
		return sb.toString();
	}
	
	public boolean offerLast(E element) {
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
	
	public boolean offerFirst(E element) {
		if(isFull()) {
			throw new QueueFullException("only "+arr.length+" element allowed");
		}
		else {
			front=(arr.length+front-1)%arr.length;
			arr[front]=element;
			count++;
			return true;
		}
	}
	
	public E pollFirst() {
		if(isEmpty()) {
			throw new QueueEmptyException();
		}
		else {
			E element=arr[front];
			front=(front+1)%arr.length;
			count--;
			return element;
		}
	}
	
	public E pollLast() {
		if(isEmpty()) {
			throw new QueueEmptyException();
		}
		else {
			E element=arr[rear];
			rear=(arr.length+rear-1)%arr.length;
			count--;
			return element;
		}
	}
	
	public E elementFirst() {
		if(isEmpty()) {
			throw new QueueEmptyException();
		}
		else {
			return arr[front];
		}
	}
	
	public E elementLast() {
		if(isEmpty()) {
			throw new QueueEmptyException();
		}
		else {
			return arr[rear];
		}
	}
}
