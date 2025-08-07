package Collection_Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class array_task5 {
public static void main(String[]args) {
	ArrayList<Integer>s=new ArrayList<>();
	s.add(10);
	s.add(20);
	s.add(20);
	s.add(30);
	s.add(10);
	s.add(40);
	s.add(50);
	
	List<Integer> y=s.stream().distinct().collect(Collectors.toList());
	System.out.println(y);
	
	Set<Integer> v=s.stream().collect(Collectors.toSet());
	System.out.println(v);
	
}
}
