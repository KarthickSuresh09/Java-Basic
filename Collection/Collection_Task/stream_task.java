package Collection_Task;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class stream_task {
public static void main(String[]args) {
	
	ArrayList<Integer>s=new ArrayList();
	s.add(25);
	s.add(57);
	s.add(30);
	s.add(40);
	s.add(60);
	
	List<Integer> d=s.stream().filter(x->x>50).collect(Collectors.toList());
	d.forEach(x->System.out.println(x)); //1
	System.out.println("         ");
	
	Integer k=s.stream().max(Comparable::compareTo).get();
	System.out.println(k);
	
	Integer z=(int)s.stream().mapToInt(Integer::intValue).average().orElse(0);
	
	System.out.println(z);
}
}
