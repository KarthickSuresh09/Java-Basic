package Collection_Task;

import java.util.stream.Collectors;
import java.util.*;
import java.util.Map.Entry;

public class useemplo {
public static void main(String[]args) {
	
	HashMap<Integer,emplo>k=new HashMap();
	k.put(1, new emplo(2,20000,"karan"));
	k.put(2,new emplo(1,15000,"varun"));
	k.put(3, new emplo(3,25000,"kamesh"));
	
	int hg=0;
	for(Integer i:k.keySet()) {
		if(k.get(i).getSalary() >hg ) {
			hg=hg=k.get(i).getSalary();
		}
		
	}
	System.err.println(hg);
	
k.keySet().forEach(x->{if(k.get(x).getExp()>2)System.out.println();});
	
	for(Integer z:k.keySet()) {
		if(k.get(z).getExp()>=2) {
			k.get(z).setSalary(k.get(z).getSalary()+1000);
		
	System.out.println(k);
	

	}
}
System.out.println(k);
	
List<Integer>v=k.entrySet().stream().filter(x->x.getValue().
getSalary()>20000).map(x->x.getKey()).collect(Collectors.toList());
v.forEach(x->{System.out.println(k.get(x));});

//k.keySet().stream().filter(x->x.>=2500).forEach(x->System.out.println(x+" "+k.get(x)));

}
}
