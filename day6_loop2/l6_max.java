package day6_loop2;

public class l6_max {
public static void main(String[]args) {
	String[]a=new String[5];
	a[0]="hello";
	a[1]="Karthick";
	a[2]="mini";
	a[3]="push";
	a[4]="sicily";
	String max=a[0];
	for(int i=0; i<a.length;i++) {
		if(max.length()< a[i].length()) {
			max=a[i];
		}
	}
	System.out.println(max);
}
}
