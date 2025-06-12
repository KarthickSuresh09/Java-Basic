package day_11_abstaraction;

public class userefill {
public static void main(String[]args) {
	refill r=new refill();
	System.out.println(r.material("rey")+" "+r.ishole(true));
	System.out.println(r.brand("parker")+ r.price(50));
}
}
