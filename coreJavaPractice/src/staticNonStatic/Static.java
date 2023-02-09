package staticNonStatic;

public class Static {

	static int nos=10;
	int no=1;
	
	
public void nsm() {
	
	System.out.println("this is non static method");
	
}
	
public static void sm() {
	
	System.out.println("this is static method");

}
	
	public static void main(String[] args) {
	
System.out.println("static methods and veriables....................");

		System.out.println(nos);
		sm();
		Static.sm();


System.out.println("static methods and veriables....................");

		Static st=new Static();//creating class object to call nonstatic veriables and methods into the static method
		
		
		System.out.println(st.no);
		st.nsm();
		
		
		
		
		
		
		
		
		
	}
	
}
