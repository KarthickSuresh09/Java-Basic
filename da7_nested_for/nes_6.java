package da7_nested_for;

public class nes_6 {
public static void main(String[]args) {
	String a="banana";
	char[]b=a.toCharArray();
	for(int i=0; i<b.length;i++) {
		int count=+1;
		for(int j=i+1; j<b.length; j++) {
			if(b[i]==b[j]) {
				b[j]='#';
				count++;
			}
		}
		if(count>1 && b[i]!='#') {
			System.out.println(b[i]);
		}
	}
}
}
