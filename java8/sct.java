package java8;

import java.util.Scanner;

public class sct {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		
		int a=s.nextInt();
		for(int i=0;i<=a;i++) {
			
			for(int j=0; j<=i; j++) {
				System.out.println(j);
			}
		}
	}

}
