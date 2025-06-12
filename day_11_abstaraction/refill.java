package day_11_abstaraction;


interface cap{
	public String material(String material);
	public boolean ishole(boolean ishole);
}
interface pen{
	public String brand(String brand);
	public int price(int a);
}
public class refill implements cap,pen {
	public String material(String material) {
		return material;
	}
	public boolean ishole(boolean ishole) {
		return ishole;
	}

	public String brand(String brand) {
		return brand;
	}
	public int price(int price) {
		return price;
	}

}
