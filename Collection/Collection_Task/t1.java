package Collection_Task;

import java.util.*;

public class t1 {
public static void main(String[]args) {
	
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	ArrayList <Integer> b=new ArrayList();
	
	for(int i=0; i<a;i++) {
		b.add(s.nextInt());
	}
int q=s.nextInt();
s.nextLine();

for(int i=0;i<q;i++) {
	String c=s.next();
	if(c.equals("insert")) {
	int x=s.nextInt();
	int y=s.nextInt();
	b.add(x,y);
	}
	else if(c.equals("delete")) {
		int z=s.nextInt();
		b.remove(z);
	}
	for(int n: b) {
		System.out.println(n+"");
	}
}
}
}
