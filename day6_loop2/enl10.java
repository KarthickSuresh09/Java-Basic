package day6_loop2;

public class enl10 {
	public static void main(String args[]) {
		String[]a= {"Karthick","van","sicily","bristol"};
		String max=a[0];
		for(String x:a) {
			if(max.length()<x.length()) {
				max=x;
			}
		}
		System.out.print(max);
	}

}
