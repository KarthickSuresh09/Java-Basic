package coll2_HashMap;

import java.util.HashMap;

public class t1 {
	public static void main(String[]args) {
HashMap<Integer,String>a=new HashMap();
a.put(0, "Hello");
a.put(2,"world");
a.put(3, "Inside");
a.put(4, "World");

a.remove(4);
System.out.println(a.get(3));
System.out.println(a.values());
System.out.println(a.keySet());

System.out.println("                  ");

a.forEach((x,y)->System.out.println("For Each "+x+" "+y));

for(int x:a.keySet()) {
	System.out.println("Enhanced For Using Values "+x);
}
System.out.println("Size is "+a.size());

System.out.println("                                    ");

a.values().forEach(x->System.out.println("For Each Using Values: "+x));


System.out.println("                                             ");

a.keySet().forEach(x->System.out.println("For Each Using Key" +x+" "+a.get(x)));

System.out.println("                                         ");

for(int i=0; i<a.size(); i++) {
	System.out.println(a);
}
	} 

}
