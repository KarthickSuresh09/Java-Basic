package day3;

public class UseMobile {
public static void main(String[]args) {
	Mobile a=new Mobile();
	a.brand=args[0];
	a.color=args[1];
	a.price=Integer.parseInt(args[2]);
	a.discountprice=Integer.parseInt(args[3]);
	a.netprice=a.price-(a.price*a.discountprice)/100;
	System.out.println(a.netprice);
}
}
