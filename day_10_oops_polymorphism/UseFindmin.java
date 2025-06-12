package day_10_oops_polymorphism;

class Findmin{
	public int min(int a,int b) {
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
	}
	public String min(String a,String b) {
		if(a.length()>b.length()) {
			return a;
		}
		else {
			return b;
		}
	}
	public String min(int[]a) {
	for(int i=0; i<a.length;i++) {
		if(a[i]%2==0) {
			return "even";
		}
		if(a[i]%2!=0) {
			return "odd";
		}
	}
	return null;
	
	}
	
}
public class UseFindmin {
public static void main(String[]args) {
	int []a= {10,2,56,7,3};
	Findmin m=new Findmin();
	System.out.println(m.min(40, 20));
	System.out.println(m.min("Karthick", "Suresh"));
	System.out.println(m.min(a));
}
}
