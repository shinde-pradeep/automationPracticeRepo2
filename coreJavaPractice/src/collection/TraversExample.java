package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TraversExample {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList();

		al.add(11);
		al.add(22);
		al.add(33);
		al.add(null); 
		al.add(null);
System.out.println(al);

System.out.println("1.using advance for loop.....................");

 //if we use int...then to fetch null value we get run time error 
 //java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" 
 //   because the return value of "java.util.Iterator.next()" is null

for(Integer listContent:al)
		{
			System.out.println(listContent);
		}
		
System.out.println("2.using Iterator interface.....................");
		
		
		Iterator<Integer> i=al.iterator();
		
		while(i.hasNext())
		{
			Integer number=i.next();
			System.out.println(number);
		}
		
	
		
System.out.println("3.backword and forward traverse using ListIterator interface.....................");
		
		
		ListIterator<Integer> i2=al.listIterator(al.size());
		
		while(i2.hasPrevious())
		{
			Integer number2=i2.previous();
			System.out.println(number2);
		}		

// we can forward traverse by ListIterator interface
	
//ListIterator<Integer> i3=al.listIterator();
//		
//		while(i3.hasNext())
//		{
//			Integer number3=i3.next();
//			System.out.println(number3);
//		}		

		
System.out.println("4.Enumeration.....................");
		











System.out.println("5.forEach method (lamda equation) of iterable interface.....................");

    al.forEach(aa ->{
    	
    	System.out.println(aa);
    	
    	
    });











	
		
	}
}
