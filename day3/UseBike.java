package day3;

public class UseBike {
	public static void main(String args[]) {
		Bike a=new Bike();
		 a.brand=args[0];
		 a.color=args[1];
		 a.price=Integer.parseInt(args[2]);
		 System.out.println(a.brand+" "+a.color+" "+a.price);
		 
		 Bike b=new Bike();
		 b.brand=args[3];
		 b.color=args[4];
		 b.price=Integer.parseInt(args[5]);
		 System.out.println(b.brand+" "+b.color+" "+b.price);
	}

}
