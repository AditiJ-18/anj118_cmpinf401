/** 
 * Class Dessert 
 * @author aditijunagade
 * created: 10/11/2022 
 */

public class Dessert {

	private String name; 
	private String description; 
	private int calories; 

	public Dessert(String name, String desc, int cal) { 
		this.name = name; 
		this.description = desc; 
		this.calories = cal; 
	}

	public String getDessertName() {
		return name; 
	}
	
	public int getDessertCals() {
		return calories; 
	}

	public String getDessertDesc() { 
		return description; 
	}

}
