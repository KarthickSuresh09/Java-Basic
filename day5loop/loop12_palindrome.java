package day5loop;

public class loop12_palindrome {
public static void main(String[]args) {
	String a="madam";
	String b="";
	for(int i=a.length()-1; i>=0; i--) {
		b=b+a.charAt(i);
		
	}
		if(a.equals(b)) {
			System.out.print("Palindrome");
		}
		else {
			System.out.print("Not Palindrome ");
		}
}
}
