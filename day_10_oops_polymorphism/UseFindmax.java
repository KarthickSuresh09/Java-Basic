package day_10_oops_polymorphism;


class Findmax{
	public int max(int a,int b) {
		if(a<b) {
			return a;
		}
		else {
			return b;
		}
	}

public String max(String a,String b) {
	if(a.length()>b.length()) {
		return a;
	}
	else {
		return b;
	}
}
public int max(int[]a) {
	int max=a[0];
	for(int i=0; i<a.length; i++) {
		if(max<a[i]) {
			max=a[i];
		}
	}
	return max;
}
}
public class UseFindmax{
public static void main(String[]args) {
	int a[]= {5,10,8,26};
	Findmax f=new Findmax();
	System.out.println(f.max(20, 15));
	System.out.println(f.max("Karthick", "null"));
	System.out.println(f.max(a));
}	
}


