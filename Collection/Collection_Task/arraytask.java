package Collection_Task;

import java.util.ArrayList;

public class arraytask {
public static void main(String[]args) {
	ArrayList<Integer>s=new ArrayList();
	s.add(10);
	s.add(26);
	s.add(33);
	s.add(43);
	s.add(52);
	s.add(67);
	s.add(76);
	s.add(85);
	s.add(99);
	s.add(10);
	
	for(int i=s.size()-1;i>=0;i--) {
		if(s.get(i)%2==0) {
			s.remove(i);
	}
}
	System.out.println(s);
}
}