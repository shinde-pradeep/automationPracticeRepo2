package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		
		
System.out.println("1.HashSet class.............................");		
		
		HashSet al = new HashSet();

		al.add(11);
		al.add(22);
		al.add("ram");  // allow single null value
		al.add("ram");  // sorting in ascending ...means...does not maintain insertion order
		al.add(null);
		al.add(null);
		
//		al.get(); no such method...no index collection available
		
		System.out.println(al);
		
System.out.println("2.LinkedHashSet class.............................");		
		
		LinkedHashSet lhs=new LinkedHashSet();
		
		lhs.add(1);   // allow single null value
		lhs.add(2);   // maintain insertion order
		
		lhs.addAll(al);
		
		System.out.println(lhs);

System.out.println("3.TreeSet class.............................");
		
		TreeSet ts=new TreeSet();
		
		ts.add(100);
		ts.add(20);  // sorting in asc order...means does not maintain insertion order
		ts.add(300);
//		ts.add(null); //not even single null value... java.lang.NullPointerException
		
System.out.println(ts);	
		
		
		
	}
	
	
	
}
