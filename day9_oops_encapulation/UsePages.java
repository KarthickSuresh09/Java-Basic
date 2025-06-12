package day9_oops_encapulation;

public class UsePages {
public static void main(String[]args) {
	Pages p=new Pages(500,10);
	book b=new book(400,"Harry","colen",p);
	System.out.println(b);
}
}
