package coll2_HashMap;

public class car {
private int id;
private String name;
private int price;
private String color;
private boolean iswarranty;
private String model;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
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
public boolean isIswarranty() {
	return iswarranty;
}
public void setIswarranty(boolean iswarranty) {
	this.iswarranty = iswarranty;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public car(int id, String name, int price, String color, boolean iswarranty, String model) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
	this.color = color;
	this.iswarranty = iswarranty;
	this.model = model;
}
@Override
public String toString() {
	return "car [id=" + id + ", name=" + name + ", price=" + price + ", color=" + color + ", iswarranty=" + iswarranty
			+ ", model=" + model + "]";
}

}
