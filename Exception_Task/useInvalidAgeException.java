package Exception_Task;

import java.util.Scanner;

public class useInvalidAgeException {

	public static void main(String[] args) {

		try {
			Scanner a=new Scanner(System.in);
			System.out.println("Enter Your Age");
			int b=a.nextInt();
				if(b<18) {
					System.out.println("Not Eligile for vote");
				}
				else {
					System.out.print("Eligible for vote");
				}
			
		}
		catch(Exception e) {
			System.out.println(e);//"Your Age is Lesserthan 18"
		}
	}

}
  