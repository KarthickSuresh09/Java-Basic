package day9_oops_encapulation;

public class UseFruit {

	public static void main(String[] args) {
Fruit f=new Fruit();
f.colour="Red";
f.fruit="Apple";
Apple a=new Apple();
a.state="Jamu & Kashmire";
a.price=30;
a.fruit=f;
System.out.print(a.state+" "+a.price+" "+a.fruit.colour+" "+a.fruit.fruit);
	}

}
