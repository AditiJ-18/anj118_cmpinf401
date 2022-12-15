/** 
 * Class Menu 
 * @author aditijunagade
 * created: 10/11/2022 
 */

public class Menu {

	private String name; 
	private Entree entree; 
	private Salad salad; 
	private Side side; 
	private Dessert dessert; 

	public Menu(String name) {  
		this.name = name; 
		this.entree = null; 
		this.salad = null; 
		this.side = null; 
		this.dessert = null; 
	}

	public Menu(String name, Entree entree, Side side) { 

		this.name = name; 
		this.entree = entree; 
		this.side = side; 
		this.salad = null; 
		this.dessert = null; 

		//call totalcals
		totalCalories(); 

		//call description 
		System.out.println(description());

	}

	public Menu(String name, Entree entree, Side side, Salad salad, Dessert dessert) { 

		this.name = name; 
		this.entree = entree; 
		this.side = side; 
		this.salad = salad; 
		this.dessert = dessert; 

		//call totalcals 
		totalCalories(); 

		//call description 
		System.out.println(description()); 
	}

	public String getName() {
		return this.name; 
	}
	
	public String getEntreeDesc() { 
		return entree.getDesc(); 
	}
	
	public String getSideDesc() {
		return side.getDesc(); 
	}
	
	public String getSaladDesc() {
		return salad.getDesc(); 
	}
	
	public String getDessertDesc() {
		return dessert.getDesc(); 
	}
	
	public double getEntPrice() {
		return entree.getPrice(); 
	}
	
	public double getSidePrice() {
		return side.getPrice(); 
	}
	
	public double getSaladPrice() {
		return salad.getPrice(); 
	}
	
	public double getDesPrice() {
		return dessert.getPrice(); 
	}
	
	public int getEntCals() {
		return entree.getCals(); 
	}
	
	public int getSideCals() {
		return side.getCals(); 
	}
	
	public int getSaladCals() {
		return salad.getCals(); 
	}
	
	public int getDesCals() {
		return dessert.getCals(); 
	}
	
	
	//sums cals of all parts of menu 
	//.get() all int cals and add them up and return 
	public String totalCalories() { 
		int entreeCals = 0; 
		int saladCals = 0; 
		int sideCals = 0; 
		int dessertCals = 0; 

		if (entree != null) { 
			entreeCals += entree.getCals();  
		} 

		if (salad != null) { 
			saladCals += salad.getCals();
		} 

		if (side != null) { 
			sideCals += side.getCals(); 
		}

		if (dessert != null) { 
			dessertCals += dessert.getCals(); 
		} 

		int totalCals = entreeCals + saladCals + sideCals + dessertCals; 
		return String.valueOf(totalCals);  

	}

	//shortens desc of menu in order: entree,side, salad, dessert; separate desc by lines and add in N/A where needed 
	// .get() all desc and add each to new line with \n  
	public String description() { 
		String entreedesc = "N/A"; 
		String saladdesc = "N/A"; 
		String sidedesc = "N/A"; 
		String dessertdesc = "N/A"; 

		if (entree != null) { 
			entreedesc = entree.getDesc(); 
		}

		if (salad != null) { 
			saladdesc = salad.getDesc(); 
		} 

		if (side != null) { 
			sidedesc = side.getDesc(); 
		}

		if (dessert != null) { 
			dessertdesc = dessert.getDesc(); 
		} 

		String shortDesc = "Entree: "  + entreedesc + "\n" + "Side: " + sidedesc + "\n" + "Salad: " + saladdesc + "\n" + "Dessert: " + dessertdesc; 
		return shortDesc; 
	}

	public String toString() {
		return name; 
	}

}
