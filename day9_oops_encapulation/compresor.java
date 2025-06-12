package day9_oops_encapulation;

 class compresor {
private int capacity;
private int length;

 public void setcapacity(int capacity) {
	 this.capacity=capacity;
 }
public void setlength(int length) {
	this.length=length;
}	
public int getcapacity() {
	return capacity;
} 
public int getlength() {
	return length;
}
}
 class AC {
	 private int price;
	 private String brand;
	 private compresor c;
	 
	 public void setprice(int price) {
		 this.price=price;
	 }
	 public void setbrand(String brand) {
		 this.brand=brand;
	 }
	 public String getbrand() {
		 return brand;
	 }
	 public int getprice() {
		 return price;
	 } 
	 public void setcompresor(compresor c) {
		 this.c=c;
	 }
	 public  compresor getcompresor() {
		 return c;
	 }
	 
 }