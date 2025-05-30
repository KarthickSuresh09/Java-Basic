package da7_nested_for;

public class nes_8 {
public static void main(String[]args) {
	for(int i=1; i<=15; i++) {
		boolean isprime=true;
for(int j=2; j<i; j++) {
	if(i%2==0) {
	 isprime=false;
}
}
	if(isprime==true) {
		System.out.println(i);
	}

	}
}
}
