package Collection_Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class iter {
public static void main(String[]args) {
	ArrayList<String>x=new ArrayList();
	
	x.add("car");
	x.add("van");
	
	Iterator<String>s= x.iterator();
	while(s.hasNext()) {
		String value=s.next();
		System.out.println(value);
	}
	
	HashMap<Integer,String>k=new HashMap();
	k.put(1, "Cricket");
	k.put(2, "Football");
	k.put(3, "Hockey");
	k.put(4, "Chess");
	
	Iterator<Integer>r= k.keySet().iterator();
	while(r.hasNext()) {
		int y=r.next();
	//	System.out.println(y+" "+k.get(y));
		if(k.get(y).length()%2==0) {
			System.out.println(k.get(y).charAt(k.get(y).length()-1));
		}
	}
	
	
}
}
