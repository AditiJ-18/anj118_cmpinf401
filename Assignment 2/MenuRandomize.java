/** 
 * Class MenuRandomize
 * @author aditijunagade
 * @created 10/31/2022
 */

import java.util.ArrayList;
import java.util.Random;

import Assignment1.Dessert;
import Assignment1.Entree;
import Assignment1.Menu;
import Assignment1.Salad;
import Assignment1.Side;

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
		int entr = (int) Math.random() * entrees.size() - 1;
	    Entree randEnt = entrees.get(entr);

	    int dess= (int) Math.random() * desserts.size() - 1;
	    Dessert randDes = desserts.get(dess); 

	    int sal = (int) Math.random() * salads.size() - 1;
	    Salad randSalad = salads.get(sal);
	  
	    int sidez = (int) Math.random() * sides.size() - 1;
	    Side randSide = sides.get(sidez);

	    Menu menu = new Menu("Your menu", randEnt, randSide, randSalad, randDes); 
	    return menu;
	}
}

