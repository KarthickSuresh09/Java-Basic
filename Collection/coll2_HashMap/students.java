package coll2_HashMap;

import java.util.HashMap;

public class students {

	public static void main(String[] args) {
HashMap<Integer,String>l=new HashMap();
l.put(101, "ajay");
l.put(102, "prabhu");
l.put(103,"vijay");
l.put(104, "katzy");
System.out.println(l);
System.out.println(l.get(102));

l.remove(104);
System.out.println(l);

l.put(102,"dinesh");
System.out.println(l);

System.out.println(l.keySet());
System.out.println(l.values());
	
System.out.println("                                                                   ");
	l.forEach((x,y)->{System.out.println(x+" "+y);});
	
	l.values().forEach(x->System.out.println(x));

	l.keySet().forEach(x->System.out.println(x+" "+l.get(x)));
	
	for(String x:l.values()) {
		System.out.println(x);
	}
	
	for(Integer x:l.keySet()) {
		System.out.println(x);
	}
	System.out.println("                                                     ");
	String max="";
	for(String x:l.values()) {
		if(max.length()<x.length()) {
			max=x;
		}
	}
System.out.println(max);

String maxi="";
for(Integer x:l.keySet()) {
	if(maxi.length()<x) {
		//maxi=x;
	}
	System.out.println();
}
	}

}
