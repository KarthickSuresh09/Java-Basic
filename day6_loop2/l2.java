package day6_loop2;

public class l2 {
public static void main(String[]args) {
	int []a=new int[5];
	a[0]=10;
	a[1]=12;
	a[2]=16;
	a[3]=18;
	a[4]=40;
	int b=0;
	for(int i=0; i<a.length;i++ ) {
		b=b+a[i];
	}
	System.out.println(b);
}
}
