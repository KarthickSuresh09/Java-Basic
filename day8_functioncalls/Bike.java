package day8_functioncalls;

public class Bike {
public static void main(String[]args) {
Bike b=new Bike();
	b.brand="Ninja";
	b.price=200000;
	b.speed=190;
	b.tax=5000;
	b.findnetprice();
	b.finddisplaydetails();

Bike c=new Bike();
c.brand="Hero";
c.price=150000;
c.speed=140;
c.tax=4000;
c.findnetprice();
c.finddisplaydetails();

Bike d=new Bike();
d.brand="Aprila";
d.price=130000;
d.speed=140;
d.tax=5000;
d.findnetprice();
d.finddisplaydetails();


findmax( b, c, d);
findmin(b,c,d);

}




	 
		String brand;
		int speed;
		int price;
		int tax;
public void findnetprice() {
	int netPrice=tax+price;
	System.out.print(netPrice);
}	

public void finddisplaydetails() {
	System.out.println(" "+brand+" "+speed+" "+price+" "+tax);
}

public static void  findmax(Bike b, Bike c, Bike d) {
	Bike max=b;
	if( max.price<c.price) {
		  System.out.println(c.price+" is Max");
	}
	else if(max.price < d.price){
		System.out.println( d.price+" is Max");
	}
	else {
		System.out.println(max.price+" is Max");
	}
	
	
}
public static void  findmin(Bike b, Bike c, Bike d) {
	Bike min=b;
	if( min.price >c.price) {
		  System.out.println(c.price+" is Min");
	}
	else if(min.price > d.price){
		System.out.println( d.price+" is Min");
	}
	else {
		System.out.println(min.price+" is Min");
	}
	
	
}

}

