package com.noah.Main;

public class Main {

	public static void main(String[] args) {
		GenericQueue<Integer> queue = new GenericQueue<>();
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		queue.enQueue(4);
		
		System.out.println(queue.toString());
		
		queue.deQueue();
		
		System.out.println(queue.toString());
		
		queue.enQueue(5);
		
		System.out.println(queue.toString());
	}

}
