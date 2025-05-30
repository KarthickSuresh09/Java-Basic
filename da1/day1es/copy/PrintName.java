package da1.day1es.copy;

import java.util.Scanner;

public class PrintName {
public static void main (String[]args) {
	String name="karthick";
	char initial='k';
	System.out.println(initial+"."+name);
	Scanner k=new Scanner(System.in);
	String Degree=k.nextLine();
	if (Degree !="BE"){
		System.out.println("eligible");
	}
	else {
		System.out.println("Not eligible");
	}
}
}
