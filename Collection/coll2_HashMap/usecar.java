package coll2_HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class usecar {

	public static void main(String[] args) {

		car car1=new car(102,"BMW",200000,"white",true,"b6");
		car car2=new car(103,"Audi",800000,"red",false,"A6");
		car car3=new car(104,"Mini copper",100000,"blue",false,"M8");
		car car4=new car(105,"Ferrari",800000,"grey",true,"F10");
		car car5=new car(106,"Tesala",500000,"Black",true,"T3");
		
		
HashMap<Integer,car>c=new HashMap();
c.put(car1.getId(), car1);
c.put(car2.getId(), car2);
c.put(car3.getId(), car3);
c.put(car4.getId(), car4);
c.put(car5.getId(), car5);

c.forEach((x,y)->System.out.println(x+" "+y));

System.out.println("                                                                   ");

for(Integer x:c.keySet()) {
	
	System.out.println(x);
}

for(car x:c.values()) {
	System.out.println(x);
}

for(int i=0; i<c.size();i++) {
	System.out.println(c);
}
car max=car1;
for(Integer x:c.keySet()) {
	if(max.getPrice()<c.get(x).getPrice()) {
		max=c.get(x);
	}
}
System.out.println(max);


car maxi=car1;
for(car x:c.values()) {
	if(maxi.getPrice()<x.getPrice()) {
		maxi=x;
	}
}
System.out.println(maxi);

System.out.println("-------------------------------------------------------------------------");

for(car x:c.values()) {
	if(x.isIswarranty()==true) {
		System.out.println(x);
	}
	
	for(Integer x1:c.keySet()) {
		if(c.get(x1).isIswarranty()==true) {
			System.out.println(x1);
		}
	}
c.keySet().forEach(d->{
	
if(c.get(d).isIswarranty()==true) {
c.get(d).setPrice(c.get(d).getPrice()+c.get(d).getPrice()*10/100);

}});	
System.out.println(c);
	
}
System.out.println("=================================================================");

c.values().forEach(y->{
	if(y.isIswarranty()==false) {
		y.setPrice(y.getPrice()+y.getPrice()-10/100);
	}
});
System.out.println(c);
System.out.println("###################################################################");

//Iterator <car>cars=c.values().iterator();
//while(cars.hasNext()) {
//	if(cars.next().isIswarranty()==false) {
//		cars.remove();
//	}
//}
//System.out.println(c);

Iterator<Integer>cars1=c.keySet().iterator();
while(cars1.hasNext()) {
	if(c.get(cars1.next()).isIswarranty()) {
		c.remove(cars1);
	}
}
System.out.println(c);
	}

}
