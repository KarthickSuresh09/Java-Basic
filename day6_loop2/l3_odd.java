package day6_loop2;

public class l3_odd{
public static void main(String[]args) {
	int[]a=new int[5];
	a[0]=1;
	a[1]=2;
	a[2]=3;
	a[3]=4;
	a[4]=5;
	int b=0;
	for(int i=0; i<a.length; i++) {
		if(a[i]%2!=0) {
	b++;		

		}
	}
	System.out.println(b);

}
}
