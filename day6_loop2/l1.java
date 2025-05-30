package day6_loop2;

public class l1 {
	public static void main(String[]args) {
		int []a=new int[3];
		a[0]=12;
		a[1]=13;
		a[2]=14;
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		for(int k=a.length-1; k>=0; k-- ) {
			System.out.println(a[k]);
		}
	}

}
