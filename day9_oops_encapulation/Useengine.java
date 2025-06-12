package day9_oops_encapulation;

public class Useengine {
public static void main(String[]args) {
	engine e=new engine();
	e.cc=500;
	e.year=1985;
	Car c=new Car();
	c.brand="ferrari";
	c.price=500000;
	c.engine=e;
	System.out.println(c.brand+" "+c.price+" "+c.engine.year+" "+c.engine.cc);
}
}
