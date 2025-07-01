package coll2_HashMap;

import java.util.HashMap;

public class UseEmployee {
public static void main(String[]args) {
	
	Employee e1=new Employee(12,"Karthi",26,100000);
	Employee e2=new Employee(14,"Naren",40,40000);
	Employee e3=new Employee(16,"karan",30,30000);
	Employee e4=new Employee(144,"Arun",28,20000);
	
	HashMap<Integer,Employee>a=new HashMap();
	
	a.put(e1.getId(), e1);
	a.put(e2.getId(), e2);
	a.put(e3.getId(), e3);
	a.put(e4.getId(), e4);
	
	System.out.println(a);
	a.forEach((x,y)->System.out.println(x+" "+y));
		
	Employee max=e1;
	for(Integer x:a.keySet()) {
		if(max.getSalary()<a.get(x).getSalary()) {
			  max=a.get(x);
		}
	}
	
	System.out.println(max);
	Employee max1=e1;

	for(Employee x:a.values()) {
		if(max1.getSalary()<x.getSalary()) {
			max1=x;
		}
	}
	System.out.println(max1);
	
	
	a.values().forEach(x->System.out.println(x.getName().charAt(x.getName().length()-1)));
	
	System.out.println("                                             ");
	
	a.keySet().forEach(x->System.out.println(a.get(x).getName().charAt(a.get(x).getName().length()-1)));
 
a.keySet().forEach(x->System.out.println(x%2==0));
}
	
}
