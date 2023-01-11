package com.noah.Main;

import java.util.LinkedList;

public class GenericQueue<E> {
	private LinkedList<E> list = new LinkedList<>();
	
	public void enQueue(E e) {
		list.addLast(e);
	}
	
	public E deQueue() {
		return list.removeFirst();
	}
	
	public int getSize() {
		return list.size();
	}
	
	@Override
	public String toString() {
		return list.toString();
	}

}
