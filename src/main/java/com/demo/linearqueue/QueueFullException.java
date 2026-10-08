package com.demo.linearqueue;

public class QueueFullException extends RuntimeException{
	private String msg="Queue is full!!";
	
	public QueueFullException() {};
	
	public QueueFullException(String msg) {
		this.msg=msg;
	}
	
	public String toString() {
		return getClass().getName()+": "+msg;
	}
}
