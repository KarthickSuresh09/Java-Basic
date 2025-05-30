package day5loop;

public class loop_Skip_Break {
public static void main(String[]args) {
	for(int i=1; i<=20; i++) {
		
		if (i%3==0) {
		break; // break or continue
	}
		else {
			System.out.println(i);
		}
	}
}
}
