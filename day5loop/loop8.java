package day5loop;

public class loop8 {
public static void main(String[]args) {
	String a="Java";
	for (int i=0; i<a.length(); i++) {
		if (a.charAt(i) !='a' && a.charAt(i)!='e' && a.charAt(i)!='o' && a.charAt(i)!='i' && a.charAt(i)!='u') {
			System.out.println(a.charAt(i));
		}
		
	}
	
}
}
