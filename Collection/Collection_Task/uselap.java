package Collection_Task;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class uselap {

	public static void main(String[] args) {
		
		lap l1=new lap("Hp",70000,"Pavillion",true);
		lap l2=new lap("Apple",90000,"M2",true);
		lap l3=new lap("Dell",57000,"I5",false);
		lap l4=new lap("Lenova",40000,"Thinkpad",true);
		lap l5=new lap("Asus",45000,"NoteBook",false);

		ArrayList<lap>s=new ArrayList();
		s.add(l1);
		s.add(l2);
		s.add(l3);
		s.add(l4);
		s.add(l5);
		
		for(int i=0;i<s.size();i++) {
			if(s.get(i).isWarranty()==true) {
				s.get(i).setPrice(s.get(i).getPrice()+100);
			}
		}
		System.out.println(s);
		
		lap max=l1;
		for(int i=0;i<s.size();i++) {
			if(s.get(i).getPrice()>max.getPrice()) {
				max=s.get(i);
			}
		}
		System.out.println(max);
		System.out.println("                                     ");
		
		
		for(lap d:s) {
			if(d.getModel().length()%2!=0) {
				System.out.println(d.getModel().charAt(d.getModel().length()-1));
			}
		}
		
		
		
		
lap l=s.stream().max(Comparator.comparing(lap::getPrice)).get();
System.out.println(l.getPrice()-100);

lap l0=s.stream().sorted(Comparator.comparing(lap::getPrice).reversed()).skip(1).findFirst().get();
System.out.println(l0.getPrice());


System.out.println("-------------------------------------------------");
lap max1=l1;
Iterator<lap>v=s.iterator();

while(v.hasNext()) {
	lap t=v.next();
	if(t.getPrice()>max1.getPrice()) {
		max1=t;
	}
}
System.out.println(max1);
	}

} 
