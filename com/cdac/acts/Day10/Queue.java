package com.cdac.acts.Day10;

public class Queue {
	
	private int arr[];
	private int front = 0;
	private int rear = 0;
	private int size = 0;


	public Queue(int capacity) {
		arr = new int[capacity];	
	}

	public void enqueue(int item) {
		if(rear == arr.length) {
			System.out.println("Queue at max Size");
		}
		arr[rear++] = item;
		size++;
		System.out.println(item + "enqueued");
	}
	
	public int dequeue() throws QueueEmptyException {
		if(size == 0) {
			System.out.println("cannot dequeue. empty already ");
		}
		int item =arr[front++];
		size--;
		return item;
	}
}
