package day9_oops_encapulation;

public class Ssd {
private int ram;
private int stoarge;

public void setram(int ram) {
	this.ram=ram;
}
public int getram() {
	return ram;
}
public void setstorage(int storage) {
	this.stoarge=storage;
}
public int getstoarge() {
return stoarge;
}
public Ssd(int ram,int stoarge){
	this.ram=ram;
	this.stoarge=stoarge;
}
public String toString() {
	return ram+" "+stoarge;
}
}

 class laptop{
	 private String brand;
	 private int price;
	 private boolean iswindows;
	 private Ssd ssd;
	 
	 public void setbrand(String brand) {
			this.brand=brand;
		}
		public String getbrand() {
			return brand;
		}
		public void setprice(int price) {
			this.price=price;
		}
		public int getprice() {
			return   price;
		}
		public void setiswindows(boolean iswindows) {
			this.iswindows=iswindows;
		}
		public boolean getiswindows() {
			return  iswindows;
		}
		public void setssd(Ssd ssd) {
			this.ssd=ssd;
		}
		public Ssd getssd() {
			return ssd;
		}
		
		
	 public laptop(String brand,int price,boolean iswindows, Ssd ssd) {
		 this.brand=brand;
		 this.price=price;
		 this.iswindows=iswindows;
		 this.ssd=ssd;
	 }
	 public String toString() {
		 return brand+"\n"+price+" "+iswindows+" "+ssd;
	 }
	 
 }
