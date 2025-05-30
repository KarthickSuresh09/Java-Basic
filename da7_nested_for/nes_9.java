package da7_nested_for;

public class nes_9 {
public static void main(String[]args) {
	String b="Java is a fun and java is a program";
	String[] a=b.split(" ");
	for(int i=0; i<a.length; i++) {
		int count=1;
		for(int j=i+1; j<a.length;j++) {
			if(a[i].equalsIgnoreCase(a[j])) {
				a[j]="#";
				count++;
			}
		}
		if(count >1 && a[i]!="#") {
			System.out.println(a[i]+" ");
		}
	}
}
}
