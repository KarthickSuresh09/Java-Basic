package day_11_abstaraction;

interface car{
	public String brand(String brand) ;
		public int price(int a,int b);
	
}
public class sportscar  implements car{
public String brand(String brand) {
	return brand;
}
public int price(int a,int b) {
	return a+b;
}
}
