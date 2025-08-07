package Exception_Task;

import java.util.Scanner;

public class TestCustomException {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		try {
            int age =s.nextInt();
            if(age < 18) {
                throw new MyCustomException("Age is below 18");
            }
            else {
            System.out.println("Age is valid");
            }
        } catch (MyCustomException e) {
            System.out.println("Error: " + e.getMessage());
        }
	}

}
