package day9_oops_encapulation;

public class Pages {
private int pageOn;
private int length;

public Pages(int pageOn,int length) {
	this.pageOn=pageOn;
	this.length=length;
}

public String toString() {
	return pageOn+" "+length;
}
}
class book{
	private int price;
	private String brand;
	private String author;
	private Pages pages;

	public book(int price, String brand,String author, Pages pages){
		this.price=price;
		this.brand=brand;
		this.author=author;
		this.pages=pages;
	} 
	public String toString() {
		return price+"\n "+brand+" "+author+" "+pages;
	}
}


