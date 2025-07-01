package colle1_array_list;

public class Shirt {
	private String brand;
	private int price;
	private int id;
	private int size;
	private boolean isfabric;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public boolean isIsfabric() {
		return isfabric;
	}
	public void setIsfabric(boolean isfabric) {
		this.isfabric = isfabric;
	}
	public Shirt(String brand, int price, int id, int size, boolean isfabric) {
		super();
		this.brand = brand;
		this.price = price;
		this.id = id;
		this.size = size;
		this.isfabric = isfabric;
	}
	@Override
	public String toString() {
		return "Shirt [brand=" + brand + ", price=" + price + ", id=" + id + ", size=" + size + ", isfabric=" + isfabric
				+ "]";
	}

}
