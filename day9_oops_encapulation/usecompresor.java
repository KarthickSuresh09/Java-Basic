package day9_oops_encapulation;

public class usecompresor {
public static void main(String[]args) {
	compresor o=new compresor();
	o.setcapacity(200);
	o.setlength(12);
	AC a=new AC();
	a.setbrand("croma");
	a.setprice(12000);
	a.setcompresor(o);
	System.out.println(a.getbrand()+a.getprice()+a.getcompresor().getcapacity()+a.getcompresor().getlength());
}
}
