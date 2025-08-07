package Collection_Task;

import java.util.HashMap;
import java.util.Scanner;

public class usestu {
public static void main(String[]args) {
	
	stu s1=new stu(50,"alice");
	
	stu s2=new stu(60,"mike");
	
	stu s3=new stu(80,"el");
	
	stu s4=new stu(78,"lucuas");
	
	HashMap<Integer,stu>s=new HashMap();
	
	s.put(s1.getMarks(),s1);
	s.put(s2.getMarks(), s2);
	s.put(s3.getMarks(), s3);
	s.put(s4.getMarks(), s4);
	
	s.forEach((x,y)->System.out.println(x+" "+y));
	
	Scanner x=new Scanner(System.in);
	String nam=x.next();
	var mar=0;
	
	for(stu t:s.values()) {
	if(t.getName().equals(nam)) {
		mar=t.getMarks();
		//System.out.println(t.getMarks());
		break;
	}
	else {
		System.out.println("student Not found");
	}
	}
	System.out.println(mar);
	
	Scanner b=new Scanner(System.in);
	var key=0;
	if(s.containsKey(b)) {
		System.out.println(s.get(b));
	}
	else {
		System.out.println("Key Not Found");
	}
	
}
}
