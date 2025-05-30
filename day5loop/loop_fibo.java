package day5loop;

public class loop_fibo {
public static void main(String[]args) {
	int a=0;
	int b=1;
	int c=0;
	for (int i=a; i<=20; i++) {
		
		System.out.println(a);
		c=a+b;
		a=b;
		b=c;
	}
}
}
