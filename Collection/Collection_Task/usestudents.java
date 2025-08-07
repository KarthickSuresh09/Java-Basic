package Collection_Task;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class usestudents {
public static void main(String[]args) {
	students s1=new students(12,"Karthick",87);
	students s2=new students(14,"Katzy",75);
	students s3=new students(15,"karan",66);
	
	ArrayList<students>s=new ArrayList<students>();
	
	s.add(s1);
	s.add(s2);
	s.add(s3);
	
	List<students>y=s.stream().filter(x->x.getMarks()>80).collect(Collectors.toList());

	System.out.println(y);
	
}
}
