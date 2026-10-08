package com.demo.queue;

public class QueueEmptyException extends RuntimeException{
	private String msg="Queue is empty!!";
	
	public QueueEmptyException() {};
	
	public QueueEmptyException(String msg) {
		this.msg=msg;
	}
	
	public String toString() {
		return getClass().getName()+": "+msg;
	}
}
