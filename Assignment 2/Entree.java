
/** 
 * Class Entree  
 * @author aditijunagade
 * created: 10/11/2022 
 */

public class Entree{

	private String name;
	private String description; 
	private int calories; 

	public Entree(String name, String desc, int cal) {
		this.name = name;
		this.description = desc;
		this.calories = cal;
	}

	public String getEntreeName() {
		return name; 
	}
	
	public int getEntreeCals() { 
		return calories;
	}

	public String getEntreeDesc() { 
		return description; 
	}

}
