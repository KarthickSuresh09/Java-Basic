package Collection_Task;

import java.util.ArrayList;
import java.util.List;

public class usetab {
public static void main(String[]args) {
	
	ArrayList<Integer>t=new ArrayList();
	
	t.add(10);
	t.add(20);
	t.add(30);
	t.add(40);
	t.add(50);
	
Integer k=t.stream().reduce(0,(a,b)->a+b);	
System.out.println(k);
	

}
}
