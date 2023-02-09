package accessSpecifierPack2;

import accessSpecifierPack1.*;

public class Class2 {

	public static void main(String[] args) {
		
		
	Class1 c1=new Class1();	
		
		System.out.println(c1.a);
//		System.out.println(c1.b);
//		System.out.println(c1.c); accessible within same class only...field is not visible...this is private variable
//		System.out.println(c1.d); accessible within same package only...protected
		 
		
		
		c1.publicMethod();
//		c1.dafaultMethod(); accessible within same package only...default
//		c1.privateMethod(); accessible within same class only...The method privateMethod() from the type Class1 is not visible...private method
//		c1.protectedMethod(); accessible within same package only...protected
		
	
		
		
	}
}
