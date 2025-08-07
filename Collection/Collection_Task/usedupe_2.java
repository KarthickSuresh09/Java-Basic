package Collection_Task;

import java.util.*;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class usedupe_2 {

	public static void main(String[] args) {
    
		ArrayList<dupe_2>s=new ArrayList();
		s.add(new dupe_2("Karthick","python developer",20000,26));
		
		s.add(new dupe_2("Kamesh","Scrum Master",100000,40));
		
		s.add(new dupe_2("Karan","Linux Admin",40000,34));
		
		s.add(new dupe_2("Ashok","Java developer",45000,28));
		
		s.add(new dupe_2("K@tzy","DevOps",70000,27));
		
	List<dupe_2>k=s.stream().filter(x->x.getRole().equalsIgnoreCase("java developer"))
		.peek(y->y.setSalary(y.getSalary()+y.getSalary()*100/5)).collect(Collectors.toList());
	
System.out.println(k+" 3");

 dupe_2 r=s.stream().sorted(Comparator.comparing(dupe_2::getSalary).reversed()).skip(1).findFirst().get();
 System.out.println(r+" 4");

     dupe_2 max=s.get(0);
     
     for(int i=0; i<s.size();i++) {
    	 if(s.get(i).getSalary()>max.getSalary()) {
    		 max=s.get(i);
    	 }
     }
 System.out.println(max+" 4");
 
 dupe_2 t=s.stream().sorted(Comparator.comparing(dupe_2::getSalary)).skip(2).findFirst().get();
 System.out.println(t+" 5");
 
 
 List<Integer> q=s.stream().map(x->x.getName().length()).collect(Collectors.toList());
 System.out.println(q+" 6");
 
 List<Character>w=s.stream().map(x->x.getName().charAt(0)).distinct().skip(1).collect(Collectors.toList());
 System.out.println(w+" 7");
 
// Map<Character, Integer> chars = new HashMap<>();
// for(int i=0; i<s.size();i++) {
//	 int count=+1;
//	 char ch = s.get(i).getName().charAt(0);
//	 if(c) {
//		 chars.put(ch, chars.get(ch) + 1);
//	 } else {
//		 chars.put(ch, 1);
//	 }
////	  if(count>) {}

 }
 
	}
	 


