public class MenuItem {

	private String name; 
	private String description; 
	private int calories; 
	private double price; 

	public MenuItem(String name, String desc, int cal, double price) {
		this.name = name; 
		this.description = desc; 
		this.calories = cal; 
		this.price = price; 
	}

	public String getName() {
		return name; 
	}

	public String getDesc() {
		return description; 
	}

	public int getCals() {
		return calories;
	}

	public double getPrice() {
		return price; 
	}

	public void setName(String name) {
		this.name = name; 
	}

	public void setDesc(String desc) {
		this.description = desc; 
	}

	public void setCals(int cals) {
		this.calories = cals; 
	}

	public void setPrice(double price) {
		this.price = price; 
	}

	public String toString() {
		return name; 
	}

}