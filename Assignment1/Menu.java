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

	//sums cals of all parts of menu 
	//.get() all int cals and add them up and return 
	public String totalCalories() { 
		int entreeCals = 0; 
		int saladCals = 0; 
		int sideCals = 0; 
		int dessertCals = 0; 

		if (entree != null) { 
			entreeCals += entree.getEntreeCals();  
		} 

		if (salad != null) { 
			saladCals += salad.getSaladCals();
		} 

		if (side != null) { 
			sideCals += side.getSideCals(); 
		}

		if (dessert != null) { 
			dessertCals += dessert.getDessertCals(); 
		} 

		int totalCals = entreeCals + saladCals + sideCals + dessertCals; 
		return "Total calories: " + totalCals; 

	}

	//shortens desc of menu in order: entree,side, salad, dessert; separate desc by lines and add in N/A where needed 
	// .get() all desc and add each to new line with \n  
	public String description() { 
		String entreedesc = "N/A"; 
		String saladdesc = "N/A"; 
		String sidedesc = "N/A"; 
		String dessertdesc = "N/A"; 

		if (entree != null) { 
			entreedesc = entree.getEntreeDesc(); 
		}

		if (salad != null) { 
			saladdesc = salad.getSaladDesc(); 
		} 

		if (side != null) { 
			sidedesc = side.getSideDesc(); 
		}

		if (dessert != null) { 
			dessertdesc = dessert.getDessertDesc(); 
		} 

		String shortDesc = "Entree: "  + entreedesc + "\n" + "Side: " + sidedesc + "\n" + "Salad: " + saladdesc + "\n" + "Dessert: " + dessertdesc; 
		return shortDesc; 
	}

}
