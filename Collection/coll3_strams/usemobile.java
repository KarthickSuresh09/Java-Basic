package coll3_strams;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class usemobile {
public static void main(String[]args) {
	mobile m1=new mobile(25000,"blue",2500,"oppo",true);
	
	mobile m2=new mobile(20000,"black",2100,"vivo",true);
	
	mobile m3=new mobile(98000,"white",1000,"iphone",false);
	
	mobile m4=new mobile(85000,"red",500,"samasung",true);
	
	mobile m5=new mobile(90000,"sky blue",2800,"google",true);
	
	List<mobile>mob=new ArrayList();
	mob.add(m1);
	mob.add(m2);
	mob.add(m3);
	mob.add(m4);
	mob.add(m5);
	
	
	mob.forEach(x->System.out.println(x));
	List<mobile>y=mob.stream().filter(x-> x.isAndroid()==true).collect(Collectors.toList());
	System.out.println(y);
	
	System.out.println("                                                               ");
	
	List<String>z=mob.stream().map(x->x.getBrand()).collect(Collectors.toList());
	System.out.println(z);
	
	
 Long v=mob.stream().filter(x->x.getColor().equals("white")).count();
 System.out.println(v);
 
List<String>r=mob.stream().map(x->x.getBrand()).distinct().collect(Collectors.toList());
System.out.println(r);


List<String>e=mob.stream().map(x->x.getBrand()).sorted().collect(Collectors.toList());
System.out.println(e);

Integer s=mob.stream().map(x->x.getPrice()).max(Comparable::compareTo).get();
System.out.println(s);

Integer k=mob.stream().map(x->x.getPrice()).min(Comparable::compareTo).get();
System.out.println(k);

List<mobile>w=mob.stream().filter(x->x.getPrice()>20000).skip(1).limit(2).collect(Collectors.toList());
System.out.println(w);

Boolean q=mob.stream().anyMatch(x->x.getBrand().startsWith("i"));
System.out.println(q);

Integer u=mob.stream().map(x->x.getPrice()).sorted(Comparator.reverseOrder()).distinct().skip(2).findFirst().get();
System.out.println(u);

mobile w1=mob.stream().max(Comparator.comparing(mobile::getPrice)).get();
System.out.println(w1);


Set<mobile>w2=mob.stream().filter(x->x.getPrice()>20000).skip(1).limit(2).collect(Collectors.toSet());
System.out.println(w2);

System.out.println("                                                                             ");

Map<String,mobile>w3=mob.stream().collect(Collectors.toMap(x->x.getBrand(), x->x));
System.out.println(w3);

IntSummaryStatistics v2=mob.stream().collect(Collectors.summarizingInt(x->x.getPrice()));
System.out.println(v2);

}
}
