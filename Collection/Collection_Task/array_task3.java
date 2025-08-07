package Collection_Task;

import java.util.ArrayList;
import java.util.Collections;

public class array_task3 {
public static void main(String[]args) {
	
	ArrayList<String>k=new ArrayList<String>();
	k.add("Apple");
	k.add("Mango");
	k.add("Banana");
	k.add("Grapes");
	
	Collections.sort(k);
	System.out.println(k);
	
	Collections.reverse(k);
	System.out.println(k);

	
}
}
