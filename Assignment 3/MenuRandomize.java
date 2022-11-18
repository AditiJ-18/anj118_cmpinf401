/** 
 * Class MenuRandomize
 * @author aditijunagade
 * @created 10/31/2022
 */

import java.util.ArrayList;  
import java.util.Random;

public class MenuRandomize {

	private ArrayList<Entree> entrees = new ArrayList<Entree>(); 
	private ArrayList<Side> sides =  new ArrayList<Side>(); 
	private ArrayList<Salad> salads = new ArrayList<Salad>(); 
	private ArrayList<Dessert> desserts = new ArrayList<Dessert>(); 

	/** 
	 * Method MenuRandomize 
	 * @param entreeFile
	 * @param sideFile
	 * @param saladFile
	 * @param dessertFile
	 */

	public MenuRandomize(String dishesFile) {
		ArrayList<MenuItem> menuItems = FileManager.readItems(dishesFile);
		for(int i = 0; i < menuItems.size(); i++)
			if(menuItems.get(i) instanceof Entree) {
				entrees.add((Entree) menuItems.get(i));
			} else if(menuItems.get(i) instanceof Side) {
				sides.add((Side) menuItems.get(i));
			} else if(menuItems.get(i) instanceof Salad) { 
				salads.add((Salad) menuItems.get(i)); 
			} else if(menuItems.get(i) instanceof Dessert) {
				desserts.add((Dessert) menuItems.get(i)); 
			}
		// System.out.println(entrees.size() + sides.size() + salads.size() + desserts.size()); 
	}

	/** 
	 * Method randomMenu 
	 * @return menu 
	 */ 

	public Menu randomMenu() { 
		Random rand = new Random(); 
		int r1 = rand.nextInt(entrees.size() - 1); 
		Entree randEnt = entrees.get(r1); 

		int r2 = rand.nextInt(desserts.size() - 1); 
		Dessert randDes = desserts.get(r2); 

		int r3 = rand.nextInt(salads.size() - 1); 
		Salad randSalad = salads.get(r3);

		int r4 = rand.nextInt(sides.size() - 1); 
		Side randSide = sides.get(r4);

		Menu menu = new Menu("Your custom menu: "+  '\n' + "Entree: " + randEnt + '\n'+ "Side: " + randSide + '\n' + "Salad: " + randSalad + '\n' + "Dessert: " + randDes); 
		return menu;
	}
}