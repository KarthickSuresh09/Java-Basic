package Collection_Task;

import java.util.ArrayList;
import java.util.Iterator;

public class it3 {

	public static void main(String[] args) {
ArrayList<String>t=new ArrayList();
t.add("Arun");
t.add("Karan");
t.add("arvind");
t.add("Mike");



Iterator<String>x=t.iterator();
while(x.hasNext()) {
	String r=x.next();
System.out.println(r);

if(r.startsWith("a") || r.startsWith("A")) {
	x.remove();
}	
}
System.out.println(t);
	}

}
