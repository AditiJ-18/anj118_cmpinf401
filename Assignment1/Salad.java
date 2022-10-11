/** 
 * Class Salad 
 * @author aditijunagade
 * created: 10/11/2022 
 */

public class Salad {

	private String name; 
	private String description; 
	private int calories; 

	public Salad(String name, String desc, int cal) { 
		this.name = name; 
		this.description = desc; 
		this.calories = cal; 
	}

	public int getSaladCals(){ 
		return calories; 
	}

	public String getSaladDesc() {
		return name + ". " + description; 
	}

}
