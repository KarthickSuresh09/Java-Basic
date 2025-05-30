package day6_loop2;

public class enl_max {
public static void main(String[]args) {
	int []a= {12,45,65,78,95,22};
	int max=0;
	for(int x:a) {
		if(max<x) {
			max=x;
		}
	}
	System.out.println(max);
}
}
