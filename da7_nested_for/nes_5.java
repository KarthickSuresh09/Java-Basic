package da7_nested_for;

public class nes_5 {
public static void main(String[]args) {
	int[]num={5,2,4,3,4,7,8,9};
for(int i=0; i<num.length; i++) {
	for(int j=i+1; j<num.length; j++) {
	if(num[i]+num[j]==7) {
		System.out.println(num[i]+" "+num[j]);
	}
}
}
}
}
