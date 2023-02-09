package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		
System.out.println("1.HashMap.....................................");		
		
		HashMap hm=new HashMap();
		
		hm.put(1,10);
		hm.put(1,100);
		hm.put(2,100);  //key value sorting in asc order...means...insertion order not preserver
		hm.put(0,101);  
		hm.put(3,null); // single null key
		hm.put(4,null); //no duplicate key
		hm.put(null,1); //for duplicate key...we get second key value i.e. first key value hides 
		hm.put(null,2);

		System.out.println(hm);
		
System.out.println("2.LinkedHashMap.....................................");		
		
		LinkedHashMap lhm=new LinkedHashMap();
		
		lhm.put(6,88);  //insertion order is preserver for KEY
		
		lhm.put(5,99);  // single null key
		                 //no duplicate key
		lhm.putAll(hm);
		
		System.out.println(lhm);

System.out.println("3.TreeMap.....................................");		
		
		TreeMap tm=new TreeMap();
		 
		tm.put(1,10);  //for duplicate key...we get second key value i.e. first key value hides 
		tm.put(1,100); 
		tm.put(1,102);
		tm.put(2,100);  //key value sorting in asc order...means...insertion order not preserver
		tm.put(0,101);  
		tm.put(3,null); //no duplicate key
		tm.put(4,null); //for duplicate key...we get second key value i.e. first key value hides 
//		tm.put(null,1); // not even single null key
//		tm.put(null,2); 
		 
	System.out.println(tm);	
	}
}
