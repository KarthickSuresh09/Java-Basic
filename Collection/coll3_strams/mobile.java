package coll3_strams;

public class mobile {
private int price;
private	String color;
private	int discountprice;
private	String brand;
private boolean isAndroid;
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getDiscountprice() {
	return discountprice;
}
public void setDiscountprice(int discountprice) {
	this.discountprice = discountprice;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public boolean isAndroid() {
	return isAndroid;
}
public void setAndroid(boolean isAndroid) {
	this.isAndroid = isAndroid;
}
public mobile(int price, String color, int discountprice, String brand, boolean isAndroid) {
	super();
	this.price = price;
	this.color = color;
	this.discountprice = discountprice;
	this.brand = brand;
	this.isAndroid = isAndroid;
}
@Override
public String toString() {
	return "mobile [price=" + price + ", color=" + color + ", discountprice=" + discountprice + ", brand=" + brand
			+ ", isAndroid=" + isAndroid + "]";
}


}
