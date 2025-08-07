package Collection_Task;

import java.util.ArrayList;
import java.util.Iterator;

public class it2 {

	public static void main(String[] args) {
ArrayList<Integer>x=new ArrayList();
x.add(10);
x.add(33);
x.add(100);
x.add(45);

Iterator<Integer>k=x.iterator();
while(k.hasNext()) {
	int t=k.next();
	if(t%2==0) {
		System.out.println(t);
	}
}
	}

}
