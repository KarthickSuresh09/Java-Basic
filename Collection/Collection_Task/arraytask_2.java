package Collection_Task;

import java.util.ArrayList;

public class arraytask_2 {
public static void main(String[]args) {
	ArrayList<Integer>s=new ArrayList();
	s.add(10);
	s.add(20);
	s.add(30);
	s.add(40);
	s.add(50);
	
	System.out.println(s);
	s.remove(2);
	System.out.println(s);
	s.add(1,80);
	System.out.println(s);
	
	ArrayList<Integer>k=new ArrayList();
      for(Integer d:s) {
    	  if(d==40) {
    		  k.add(d);
    	  }
      }
	System.out.println(k);
	System.out.println(s.size());
	
}
}
