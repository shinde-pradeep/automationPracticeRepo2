package accessSpecifierPack1;

public class Class1 {


public void publicMethod() {
	
	System.out.println("this is public method from pack1.Class1");
}
	
 void dafaultMethod() {
	
	System.out.println("this is default method from pack1.Class1");
}

private void privateMethod() {
	
	System.out.println("this is private method from pack1.Class1");
}

protected void protectedMethod() {
	
	System.out.println("this is protected method from pack1.Class1");
}
	
public int a=1;
int b=2;
private int c=3;
protected int d=4;


public static void main(String[] args) {
	
	Class1 c1= new Class1();
	
//	c1.a;
//	c1.2;
//	c1.c;
//	c1.d;
	
	
	System.out.println(c1.a);
	System.out.println(c1.b);    // using Getter Setter in this class we can call b variable in other package
//	System.out.println(c1.getB())// actually/technically we r using public method to set and get value of b...direct not accessible
	System.out.println(c1.c);
	System.out.println(c1.d);
	 
	
	
	c1.publicMethod();
	c1.dafaultMethod();
	c1.privateMethod();
	c1.protectedMethod();
	
	
	
	
	
}

//public int getB() {
//	return b;
//}
//
//public void setB(int b) {
//	this.b = b;
//}
//

	
}
