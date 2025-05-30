package day6_loop2;

public class l4_even_char_print {
public static void main(String[]args) {
	String[]a=new String[3];
	a[0]="sicily";
	a[1]="hello";
	a[2]="Hi";
	for(int i=0; i<a.length; i++) {
		if(a[i].length()%2==0) {
			System.out.println(a[i]);
		}
	}
}
}
