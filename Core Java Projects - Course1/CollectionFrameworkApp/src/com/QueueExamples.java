package com;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExamples {

	public static void main(String[] args) {
	Queue q1 = new PriorityQueue();

	Queue q2 = new LinkedList();
	
	q1.add(3);q1.add(8);q1.add(7);q1.add(4);q1.add(5);q1.add(1);
	q2.add(3);q2.add(8);q2.add(7);q2.add(4);q2.add(5);q2.add(1);
	System.out.println(q1);
	System.out.println(q2);
	System.out.println("Remove "+q1.poll());
	System.out.println("Remove "+q2.poll());
	System.out.println(q1);
	System.out.println(q2);
	}

}
