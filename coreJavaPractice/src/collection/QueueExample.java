package collection;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		
System.out.println("1.PriorityQueue.....................");		
		
	PriorityQueue pq=new PriorityQueue();	
	
	// if we add string first then we can not add int...and vice versa...shows run time error
	
 //  	pq.add("sam");  java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer
		pq.add(11);
		pq.add(22);
		pq.add(11); //maintain insertion order
		pq.add(33); // allow duplicate
		pq.add(44);
		
//		pq.add("sam");  java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String
//		pq.add(null); //no null
//		pq.add(null);
		
		System.out.println(pq);
		
System.out.println("1.ArrayDeque.....................");		
		
		ArrayDeque adq=new ArrayDeque();
		
		adq.add(1000); //maintain insertion order
		adq.add(900);  // allow duplicate
//		adq.add(null); // no null
//		adq.add(null);
        adq.add("ram");
        
		adq.addAll(pq);
		
		System.out.println(adq);
		
		adq.addFirst(1);
		
		System.out.println(adq);

		
		
	}
}
