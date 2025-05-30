package da4Condition;

public class elseTask1 {
public static void main(String[]args) {
	int a=40;
	int b=25;
	int c=30;
	int d=26;
	if (a < b && a < c && a < d) {
		System.out.println("A is  Minimum age");
	}
	else if (b < a && b < c && b < d ) {
		System.out.println("B is Minimum age ");
	}
	else if (c < a && c < b && c < d) {
		System.out.println("C is Minimum age");
			
		}
		else {
			System.out.println("D is Minimum age");
		}
	
}
}
