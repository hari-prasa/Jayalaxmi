package com.travel.com.travel;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		PriorityQueue <Integer>queue=new PriorityQueue<Integer>();
		for(int i=10;i>0;i--){
			queue.add(i);
			
		}
		// TODO Auto-generated method stub
System.out.println(queue.peek());
	}

}
