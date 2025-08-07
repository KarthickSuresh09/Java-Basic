package Collection_Task;

public class lap {
private String brand;

private int price;

private String model;

private boolean Warranty;

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}

public boolean isWarranty() {
	return Warranty;
}

public void setWarranty(boolean warranty) {
	Warranty = warranty;
}

public lap(String brand, int price, String model, boolean warranty) {
	super();
	this.brand = brand;
	this.price = price;
	this.model = model;
	Warranty = warranty;
}

@Override
public String toString() {
	return "lap [brand=" + brand + ", price=" + price + ", model=" + model + ", Warranty=" + Warranty + "]";
}


}
