package day6_loop2;

public class l5_max {
public static void main(String[]args) {
	int []a= {12,13,85,45,56};
	int max=a[0];
	for(int i=0; i<a.length;i++) {
		if(max<a[i]) {
			max=a[i];
		}
	}
	System.out.println(max);
}
}
