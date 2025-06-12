package day_10_oops_polymorphism;



 class Bank {
public int rateofintrest(int amt) {
	return amt*3/100;
}
}
class AxisBank extends Bank {
	public int rateofintrest(int x) {
		return x*5/100;
	}
}
class cub extends Bank{
	public int rateofintrest(int y) {
		return y*7/100;
	}
}
public class UseBank{
public static void main(String[]args) {
	AxisBank ab=new AxisBank();
	System.out.println(ab.rateofintrest(5000));
	cub cb=new cub();
	System.out.println(cb.rateofintrest(5000));
}
}

