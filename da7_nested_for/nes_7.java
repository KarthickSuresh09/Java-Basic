package da7_nested_for;

public class nes_7 {
public static void main(String[]args) {
	String a="banana";
	char[]b=a.toCharArray();
	int count1=0;
	int count2=0;
	for(int i=0; i<b.length;i++) {
		int count=1;
		for(int j=i+1; j<b.length; j++) {
			if(b[i]==b[j]) {
				b[j]='#';
				count++;
				
			}
		}
		if(count>1 && b[i]!='#') {
              count1++;
		}
		if(1==count && b[i]!='#') {
			count2++;
		}
		//if(count==1) {
		//	System.out.println(count);
		//}
	}
	System.out.println(count1);
	System.out.println(count2);
}
}
//find the duplicate not duplicate count