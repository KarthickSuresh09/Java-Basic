package day5loop;

public class loop_primenumbers {
public static void main(String[]args) {
	int a=7;
	boolean isPrime=false;
	for(int i=2; i<a; i++) {
		if (a%i==0) {
			isPrime=true;
			break;
		}
	}
	if (isPrime==false) {
		System.out.println(a+" Is a prime");
	}
	else {
		System.out.println(a+" Is not prime");
	}
	
}
}
