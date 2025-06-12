package day_11_abstaraction;

abstract class lorry {
	abstract String brand(String brand);  //abstract method
	public int price(int a,int b) {       //concrete method
		return a+b;
	}
}
 public class sportslorry extends lorry{
public String brand(String brand) {
	return brand;
}
public int price(int a,int b) {
	return a-b;
}
}

 class racelorry extends lorry{
	 public String brand(String brand) {
		 return brand;
	 }
	 
 }