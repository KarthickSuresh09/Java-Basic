package colle1_array_list;

import java.util.ArrayList;

public class UseShirt {
public static void main(String[]args) {
	Shirt a=new Shirt("Denim", 2000, 423, 5, false);
	
	Shirt b=new Shirt("Allen", 3000, 432, 9, true);
	
	Shirt c=new Shirt("Peter", 4000, 666, 3, true);
	
	Shirt d=new Shirt("Zara", 600, 444, 6, true);
	
	Shirt e=new Shirt("Louis", 5000, 555, 7, false);
	
	ArrayList<Shirt>s=new ArrayList();
	
	s.add(a);
	s.add(b);
	s.add(c);
	s.add(d);
	s.add(e);
	s.forEach(x->System.out.println(x));
	
	System.out.println("      ");
	s.forEach(y->{if(y.getBrand().length()%2==0)System.out.println(y);});
	System.out.println("--------------------------");
	
	for(Shirt t:s) {
		if(t.getBrand().length()%2==0) {
			System.out.println(t);
		}
	}
	System.out.println("=============================");
	//Shirt maximum=a;
	for(Shirt r:s) {
		if(r.getPrice()>4500) {
			System.out.println(r);
		}
	}
	System.out.println("++++++++++++++++++++++++++++++++++");	
	for(int i=0; i<s.size(); i++) {
		if(s.get(i).getPrice()>4500) {
			System.out.println(s.get(i));
		}
	}
	System.out.println(".........................................");	
	for(Shirt se:s) {
		if(se.getBrand().equals("Peter")) {
			System.out.println(se);
		}
	}
	System.out.println("*****************************************");

	s.forEach(z->{if(z.isIsfabric()==true)System.out.println(z);});
	
	System.out.println("#####################################");
	
	
	ArrayList<Shirt>am=new ArrayList();
	s.forEach(w->{if(w.getBrand().length()%2==0)am.add(w);});
System.out.println(am);
System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

Integer maximium=a.getPrice(); 
ArrayList<Integer>ma=new ArrayList();
for(Shirt be:s) {
	if(maximium<be.getPrice()) {
		maximium=be.getPrice();
	}
}
		ma.add(maximium);
	System.out.println(ma);
	
Shirt max=a;
ArrayList<Shirt>mp=new ArrayList();
for(int i=0; i<s.size();i++) {
	if(max.getPrice()<s.get(i).getPrice()) {
		max=s.get(i);
	}
}
mp.add(max);
System.out.println(mp);
}
}
