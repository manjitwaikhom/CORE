package com.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.PriorityBlockingQueue;

public class OrderOfStorageInListAndSet {

	public static void main(String[] args) {
		System.out.println("-------LIST---------");
		ArrayList al = new ArrayList();
		al.add("c");
		al.add("b");
		al.add("a");
		al.add(9);
		al.add(8);
		al.add(7);
		al.add("a");
		al.add(9);
		System.out.println("ArrayList: " + al + "  >> AS ADDED ORDER");// as-added

		LinkedList ll = new LinkedList();
		ll.add("c");
		ll.add("b");
		ll.add("a");
		ll.add(9);
		ll.add(8);
		ll.add(7);
		System.out.println("LinkedList:  " + ll + "  >> AS ADDED ORDER");// as-added

		Vector v = new Vector();
		v.add("c");
		v.add("b");
		v.add("a");
		v.add(9);
		v.add(8);
		v.add(7);
		System.out.println("Vector:  " + v + "  >> AS ADDED ORDER");// as-added

		Stack s = new Stack();
		s.add("c");
		s.add("b");
		s.add("a");
		s.add(9);
		s.add(8);
		s.add(7);
		System.out.println("Stack:   " + s + "  >> AS ADDED ORDER");// as-added
		
		/*OUTPUT:
		-------LIST---------
		ArrayList: [c, b, a, 9, 8, 7, a, 9]  >> AS ADDED ORDER
		LinkedList:  [c, b, a, 9, 8, 7]  >> AS ADDED ORDER
		Vector:  [c, b, a, 9, 8, 7]  >> AS ADDED ORDER
		Stack:   [c, b, a, 9, 8, 7]  >> AS ADDED ORDER
		*/

		// set
		System.out.println("\n");
		System.out.println("-------SET---------");
		HashSet hs = new HashSet();
		hs.add("c");
		hs.add("b");
		hs.add("a");
		hs.add(9);
		hs.add(8);
		hs.add(7);
		System.out.println("HashSet: " + hs + "  >> NO ORDER");// no-order

		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("c");
		lhs.add("b");
		lhs.add("a");
		lhs.add(9);
		lhs.add(8);
		lhs.add(7);
		System.out.println("LinkedHashSet: " + hs + "  >> ORDERED");// no-order

		TreeSet ts = new TreeSet();
		ts.add("d");
		ts.add("4");
		ts.add("c");
		ts.add("b");
		ts.add("a");
		ts.add("3");
		ts.add("2");
		ts.add("1");
		System.out.println("TreeSet: " + ts + "  >> SORTED ORDER");// sorted-order
		
		
		//Queue
		System.out.println("\n");
		System.out.println("-------QUEUE---------");
		PriorityQueue<String> pQueue=new PriorityQueue<String>();
		pQueue.add("c");
		pQueue.add("b");
		pQueue.add("a");
		pQueue.add("9");
		pQueue.add("8");
		pQueue.add("7");
		System.out.println("PriorityQueue: "+pQueue+"   >> NO ORDER");
				
		//NEED TO CHECK THE CODE
		PriorityBlockingQueue<String> bQueue=new PriorityBlockingQueue<String>();
		pQueue.add("c");
		pQueue.add("b");
		pQueue.add("a");
		pQueue.add("9");
		pQueue.add("8");
		pQueue.add("7");
		System.out.println("PriorityBlockingQueue: "+pQueue+"   >> NO ORDER");
		
		/*
		 -------SET---------
		HashSet: [a, b, c, 7, 8, 9]  >> NO ORDER
		LinkedHashSet: [a, b, c, 7, 8, 9]  >> ORDERED
		TreeSet: [1, 2, 3, 4, a, b, c, d]  >> SORTED ORDER
		*/

		// ArrayDeque q = new ArrayDeque();
		// q.add("c");
		// q.add("b");
		// q.add("a");
		// q.add("3");
		// q.add("2");
		// q.add("1");
		// System.out.println("ARRAYDEQUE : " + q + "  >> SORTED ORDER");
		// System.out.println(q.peek());
		// System.out.println(q.poll());
		// System.out.println(q.pop());

	}
}
