
/** 
 * Class Side 
 * @author aditijunagade
 * created: 10/11/2022 
 */

public class Side {

	private String name; 
	private String description; 
	private int calories; 

	public Side(String name, String desc, int cal) { 
		this.name = name; 
		this.description = desc; 
		this.calories = cal; 
	}

	public String getSideName() { 
		return name; 
	}
	
	public int getSideCals() { 
		return calories; 
	}

	public String getSideDesc() { 
		return description; 
	} 
}
