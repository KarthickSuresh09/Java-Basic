package day_10_oops_polymorphism;

class Housingloan{
	public int rateofloanintrest(int x) {
		return x*2/100;
	}
}
class SBI extends  Housingloan{
	public int rateofloanintrest(int y) {
		return y*3/100;
	}
}
class UCO extends  Housingloan{
	public int rateofloanintrest(int z) {
		return z*5/100;
	}
}

public class UseHousingLoan {
public static void main(String[]args) {
	SBI s=new SBI();
	System.out.println(s.rateofloanintrest(50000));
	UCO u=new UCO();
	System.out.println(u.rateofloanintrest(10000000));
}
}
