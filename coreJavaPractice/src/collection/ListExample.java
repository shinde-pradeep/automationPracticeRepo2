package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListExample {

	public static void main(String[] args) {

		System.out.println("List interface........................");

System.out.println("1.ArrayList class........................");

		ArrayList al = new ArrayList();

		al.add(11); //insertion order maintained
		al.add(22);
		al.add("ram"); // allow duplicate
		al.add("ram");
		al.add("ram");
		al.add(null); // allow multiple null values
		al.add(null);

//		System.out.println(al.get(2));
//		System.out.println(al.get(1));
//		System.out.println(al.get(0));
//		System.out.println(al.get(3));
//		System.out.println(al.get(4));
//		System.out.println(al.get(5));
		System.out.println(al);
		
		//to check our list is empty or not 
		System.out.println("list isEmpty -"+al.isEmpty());
		
		// to check size of list...i.e. list how many objects has
		System.out.println("list size -"+al.size());
		
		// replace value of index 0 with new value
		al.set(0,99);
		System.out.println(al);
		
		// add value at index 0 and value at index 0 will shift to index 1
		al.add(0,1212);
		System.out.println(al);

       // if list contains given object...then will return true 
		al.contains("list contains...this obj. or not -"+1212);
		
	// remove abject from list 
		//1. remove object by adding object as argument
		al.remove("ram");

		System.out.println("list after remove obj. ram -"+al);
		
		//2.remove object by index number
        al.remove(0);
		System.out.println(al);
		

System.out.println("2.LinkedList class........................");

		LinkedList ll = new LinkedList();

         ll.add(5);
         ll.add(3);
         
		ll.addAll(al);
		System.out.println(ll);
		
		// pass list object as argument in containsAll method
//		ll.containsAll(al);
//		System.out.println(ll);

System.out.println("3.Vector class........................");

		Vector vec = new Vector();

        vec.add(1000);
        vec.add(900);
        
		vec.addAll(ll);
		System.out.println(vec);

System.out.println("4.Stack class........................");

		Stack st = new Stack();

        st.add("ramram");
        st.add("pahune");
        
		st.addAll(vec);
		System.out.println(st);
		
		System.out.println(st.firstElement());
		

	}
}
