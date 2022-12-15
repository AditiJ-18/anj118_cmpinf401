/**
 * Class MenuManager
 * @author aditijunagade
 * @created 10/031/2022 
 */

import java.util.ArrayList;
import java.util.Random;

public class MenuManager {

	private ArrayList<Entree> entrees = new ArrayList<>(); 
	private ArrayList<Side> sides = new ArrayList<>(); 
	private ArrayList<Salad> salads = new ArrayList<>(); 
	private ArrayList<Dessert> desserts = new ArrayList<>(); 

/** 
 * Method MenuManager 
 * @param dishesFile containing all dishes 
 */
	public MenuManager(String dishesFile) {
		ArrayList<MenuItem> itemList = FileManager.readItems(dishesFile); 
		

		for (int i = 0; i < itemList.size() ; i++) {
			if (itemList.get(i) instanceof Entree) { 
				entrees.add((Entree) itemList.get(i)); 
			} else if (itemList.get(i) instanceof Side) { 
				sides.add((Side) itemList.get(i)); 
			} else if (itemList.get(i) instanceof Salad) { 
				salads.add((Salad) itemList.get(i)); 
			} else if (itemList.get(i) instanceof Dessert) { 
				desserts.add((Dessert) itemList.get(i)); 
			} 
		}
	}
	
//methods to get all arraylists from above 
	
	public ArrayList<Entree> getEntrees(){
		return entrees; 
	}

	public ArrayList<Side> getSides(){
		return sides; 
	}
	
	public ArrayList<Salad> getSalads(){
		return salads; 
	}
	
	public ArrayList<Dessert> getDesserts(){
		return desserts; 
	}

/** 
 * Method randomMenu 
 * @param String name to give menu 
 * @return Menu consisting of random items with name passed into param 
 */
	
	public Menu randomMenu(String name) {
		Random rand = new Random(); 

		int r1 = rand.nextInt(4); 
		Entree randEnt = entrees.get(r1); 

		int r2 = rand.nextInt(3); 
		Dessert randDes = desserts.get(r2); 

		int r3 = rand.nextInt(4); 
		Salad randSalad = salads.get(r3);

		int r4 = rand.nextInt(3); 
		Side randSide = sides.get(r4);

		Menu menu = new Menu(name, randEnt, randSide, randSalad, randDes); 
		return menu;
	}

/** 
 * Method minCaloriesMenu 
 * @param String name to give menu 
 * @return Menu made of least cal items 
 * EXTRA CREDIT 
 */
	
	public Menu minCaloriesMenu(String name) {
		Entree minEnt = entrees.get(0); 
		for(int i = 1; i < entrees.size(); i++) { 
			if(entrees.get(i).getCals() < minEnt.getCals()) { 
				minEnt = entrees.get(i); 
			}
		}
		Side minSide = sides.get(0); 
		for(int i = 1; i < sides.size(); i++) {
			if(sides.get(i).getCals() < minSide.getCals()) {
				minSide = sides.get(i); 
			}
		}
		Salad minSalad = salads.get(0); 
		for(int i = 1; i < salads.size(); i++) { 
			if(salads.get(i).getCals() < minSalad.getCals()) { 
				minSalad = salads.get(i); 
			}
		}
		Dessert minDes = desserts.get(0); 
		for(int i = 1; i < desserts.size(); i++) { 
			if(desserts.get(i).getCals() < minDes.getCals()) { 
				minDes = desserts.get(i); 
			}
		}

		Menu minMenu = new Menu("Lowest Calorie Menu", minEnt, minSide, minSalad, minDes); 
		return minMenu; 
	}
	
/**
 * Method maxCaloriesMenu 
 * @param String name to give menu 
 * @return Menu made of most cal items 
 * EXTRA CREDIT 
 */
	
	public Menu maxCaloriesMenu(String name) {
		Entree maxEnt = entrees.get(0); 
		for(int i = 1; i < entrees.size(); i++) { 
			if(entrees.get(i).getCals() > maxEnt.getCals()) { 
				maxEnt = entrees.get(i); 
			}
		}
		Side maxSide = sides.get(0); 
		for(int i = 1; i < sides.size(); i++) {
			if(sides.get(i).getCals() > maxSide.getCals()) {
				maxSide = sides.get(i); 
			}
		}
		Salad maxSalad = salads.get(0); 
		for(int i = 1; i < salads.size(); i++) { 
			if(salads.get(i).getCals() > maxSalad.getCals()) { 
				maxSalad = salads.get(i); 
			}
		}
		Dessert maxDes = desserts.get(0); 
		for(int i = 1; i < desserts.size(); i++) { 
			if(desserts.get(i).getCals() > maxDes.getCals()) { 
				maxDes = desserts.get(i); 
			}
		}

		Menu maxMenu = new Menu("Higest Calorie Menu", maxEnt, maxSide, maxSalad, maxDes); 
		return maxMenu; 
	}

}