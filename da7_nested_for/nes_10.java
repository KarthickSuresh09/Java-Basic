package da7_nested_for;

public class nes_10 {
public static void main(String []args) {
	int[]a= {13,19,21,17,98,20,8};
	for (int i=0; i<=a.length;i++) {
		for(int j=i+1; j<a.length;j++) {
			if(a[i]>a[i]) {
				int temp=a[i];
				a[i]=a[i];
				a[i]=temp;
			}
		}
	}
	for(int x:a) {
		System.out.println(x);
	}
}
}
