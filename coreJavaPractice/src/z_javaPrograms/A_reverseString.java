package z_javaPrograms;

public class A_reverseString {

	public static void main(String[] args) {

		String s1 = "ramar";
		String rev = "";

		for (int a = s1.length() - 1; a >= 0; a--) {
			rev = rev + s1.charAt(a);
		}
		System.out.println("original string is -" + s1 + "\nString reverse by StringBuilder -" + rev);

//System.out.println("checking for palendrom........................................");

		if (s1.equals(rev)) {
			System.out.println("string is a palindrom");
		} else {
			System.out.println("string is not a palindrom");
		}

		System.out.println("revers String using string builder........................................");

		String s2 = "ram";

		StringBuilder sb = new StringBuilder();
		sb.append(s2);
		StringBuilder s2rev = sb.reverse();

		System.out.println("original string is -" + s2 + "\nString reverse by StringBuilder -" + s2rev);

		System.out.println("revers String using string buffer........................................");

		String s3 = "ramraja";

		StringBuffer sbuff = new StringBuffer();
		sbuff.append(s3);
		StringBuffer s3rev = sbuff.reverse();

		System.out.println("orihinal string is -" + s3 + "\nString reverse by StringBuilder -" + s3rev);

	}
}
