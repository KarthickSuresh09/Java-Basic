package Collection_Task;

import java.util.HashMap;
import java.util.Iterator;

public class itr4 {

	public static void main(String[] args) {

		HashMap<Integer,String>s=new HashMap();
		s.put(1, "Mike");
		s.put(2, "Steve");
		s.put(3, "El");
		s.put(4, "dustin");
		
		Iterator<Integer>x=s.keySet().iterator();
		while(x.hasNext()) {
		int t=x.next();
		//String n=s.get(t);
		System.out.println(t+" "+s.get(t));
		
	//	if(n.charAt(0)=='A' || n.charAt(0)=='Z') {
	//		System.out.println(s.get(t));
			
	//	}
	}
	}
}
