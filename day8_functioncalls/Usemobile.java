package day8_functioncalls;


 
	
	
	
	
public class Usemobile{	
public static void main(String[]args) {
	mobiless a=new mobiless();
	a.brand="vivo";
	a.color="white";
	a.price=100000;
	a.discountprice=10000;
	
	mobiless b=new mobiless();
	b.brand="oppo";
	b.color="black";
	b.price=30000;
	b.discountprice=1000;

	mobiless c=new mobiless();
	c.brand="Apple";
	c.color="white";
	c.price=100000;
	c.discountprice=1000;
	
	mobiless[]mobile= {a,b,c};
	mobiless.getmobile(mobile);
	
}
}

