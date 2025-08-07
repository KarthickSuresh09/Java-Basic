 package java8;

import java.util.Scanner;

public class sc {

	public static void main(String[] args) {

		Scanner a=new Scanner(System.in);
		
		System.out.println("Enter the Qualifaction");
		
		String b=a.nextLine();
        if(b.equals("BE")) {
        	System.out.println("Eligible");
        }		
        else {
        	System.out.println("Not Eligible");
        }
        Scanner c=new Scanner(System.in);
        
        System.out.println("Enter the Value");
        int r=c.nextInt();
        Scanner x=new Scanner(System.in);
        String d=x.nextLine();
        System.out.println(r+d);
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your mobile number");
        long er=s.nextInt();
        
                
	}

}