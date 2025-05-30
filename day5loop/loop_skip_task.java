package day5loop;

public class loop_skip_task {
	public static void main(String[]args) {
		for(int i=0; i<=20; i++) {
			if (i%2==0) {
				continue;
			}
			else {
				System.out.println(i);
			}
		}
		System.out.println();
		for (int k=1; k<=20; k++) {
			if (k%5==0) {
				break;
			}
			else {
				System.out.print(k);
			}
		}
	}

}
