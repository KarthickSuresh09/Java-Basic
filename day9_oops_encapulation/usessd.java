package day9_oops_encapulation;

public class usessd {
public static void main(String[]args) {
	Ssd a=new Ssd(18,500);
a.setram(33);
	laptop l=new laptop("apple",100000,false,a);
	System.out.println(l);
	
	
	
}
}
