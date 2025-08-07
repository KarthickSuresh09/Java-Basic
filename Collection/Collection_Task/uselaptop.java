package Collection_Task;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class uselaptop {

	public static void main(String[] args) {

		HashMap<Integer,laptop>s=new HashMap();
		s.put(1,new laptop("Apple",80000,"M4"));
		s.put(2,new laptop("Lenova",60000,"ThinkPad"));
		s.put(3,new laptop("Dell",70000,"I5"));
		s.put(4,new laptop("Asus",50000,"NoteBook"));
		s.put(5,new laptop("Lenova",40000,"Amadpro"));
		
	
		System.out.println(s);		
		
		
		s.keySet().forEach(x->{if(s.get(x).getBrand().length()%2==0);System.out.println(s.get(x));});
		
		
		System.out.println("                                         ");
s.keySet().forEach(y->{if(s.get(y).getPrice()>60000)System.out.println(s.get(y)); });

s.keySet().forEach(z->{if(s.get(z).getBrand().length()%2!=0)System.out.println(s.get(z).getBrand().charAt(s.get(z).getBrand().length()-1));});

System.out.println("-----------------------------------------------------");
for(Integer d:s.keySet()) {
	if(s.get(d).getPrice()>50000) {
		s.get(d).setPrice(s.get(d).getPrice()+1000);
	}
}
System.out.println(s);
		
System.out.println("                                    ");

Iterator<Integer>k=s.keySet().iterator();
while(k.hasNext()) {
	int r=k.next();
	
	if(s.get(r).getPrice()>55000) {
		System.out.println(s.get(r).getBrand().charAt(s.get(r).getBrand().length()-1));
	}
}

Integer ma=s.keySet().stream().max(Comparator.comparing(x->s.get(x).getPrice())).get();
laptop max1=s.get(ma);
     System.out.println(max1+"1");  
     
  String st=s.values().stream().map(y->y.getBrand()).reduce("",(a,b)->a.concat(b));  
  System.out.println(st);
    
  
	}

}
