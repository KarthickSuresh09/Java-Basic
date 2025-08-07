package Collection_Task;

public class tab {
	private String brand;
	private int price;
	private boolean warranty;
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
	public boolean isWarranty() {
		return warranty;
	}
	public void setWarranty(boolean warranty) {
		this.warranty = warranty;
	}
	public tab(String brand, int price, boolean warranty) {
		super();
		this.brand = brand;
		this.price = price;
		this.warranty = warranty;
	}
	@Override
	public String toString() {
		return "tab [brand=" + brand + ", price=" + price + ", warranty=" + warranty + "]";
	}
	
	

}
