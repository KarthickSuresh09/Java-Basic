package day_10_oops_inheritance;

public class UseFruit {
public static void main(String[]args) {
	Apple a=new Apple();
	a.name="Apple";
	a.price=200;
	a.kg=1;
	a.use="Boost immune";
	
	Orange o=new Orange();
	o.name="Orange";
	o.price=400;
	o.kg=5;
	o.isEatable=true;
	
	mango m=new mango();
	m.name="Mango";
	m.price=250;
	m.kg=4;
	m.use="Vitaman 'C'";
	
	System.out.println(a.name+" "+o.name+" "+o.price+" "+a.price);
}
}
