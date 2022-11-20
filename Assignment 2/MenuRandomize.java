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

	public MenuRandomize(String entreeFile, String sideFile, String saladFile, String dessertFile) {
		entrees.addAll(FileManager.readEntrees(entreeFile)); 
		sides.addAll(FileManager.readSides(sideFile)); 
		salads.addAll(FileManager.readSalads(saladFile)); 
		desserts.addAll(FileManager.readDesserts(dessertFile)); 
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

		Menu menu = new Menu(null, randEnt, randSide, randSalad, randDes); 
		return menu;
	}
}