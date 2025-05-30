package da4Condition;

public class elseTask4 {
public static void main(String[]args) {
	int mark=68;
	if (mark >= 90 && mark >= 100) {
		System.out.println("A grade");
	}
	else if (mark < 90 && mark >= 80) {
		System.out.println("B grade");
	}
	else if (mark < 80 && mark >= 70) {
		System.out.println("C grade");
	}
	else if (mark < 70 && mark >= 60) {
		System.out.println("D grade");	
	}
	else if (mark < 60 && mark >= 50) {
		System.out.println("E grade");
	}
	else  {
System.out.println(" Fail ");
}
}
}
