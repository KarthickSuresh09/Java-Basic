package Collection_Task;

import java.util.HashMap;
import java.util.Iterator;

public class itr5 {

	public static void main(String[] args) {
    HashMap<Integer,String>s=new HashMap();
    s.put(101, "Apple");
    s.put(102, "mango");
    s.put(103, "Banana");
    s.put(104, "jackFruit");
    
    Iterator<Integer>x=s.keySet().iterator();
    while(x.hasNext()) {
    	int y=x.next();
    	if(s.get(y).length()>5) {
    		x.remove();
    	}
    }
    System.out.println(s);
	}

}
