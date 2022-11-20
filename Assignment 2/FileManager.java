/**
 * Class FileManager
 * @author aditijunagade
 * @created 10/031/2022 
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {

	/** 
	 * Method readEntrees 
	 * @param fileName
	 * @return an arrylist of entrees 
	 * */ 

	public static ArrayList<Entree> readEntrees(String fileName) { 
		ArrayList<Entree> entrees = new ArrayList <Entree>();  

		try {
			BufferedReader br = new BufferedReader(new FileReader("data/entrees.txt"));
			String line = null; 
			while((line = br.readLine()) != null) { 
				String[] item = line.split("@@");
				entrees.add(new Entree(item[0], item[1], Integer.parseInt(item[2]))); 
			} 
		} catch (IOException e) { 
			System.out.println(e.getMessage());
		} 
		
		//for testing 
		/*for(int i = 0; i < entrees.size(); i++) {
			System.out.println(entrees.get(i)); 
		} */ 
		
		return entrees; 
	} 
		
	/** 
	 * Method readSides  
	 * @param fileName
	 * @return arraylist of sides 
	 */

	public static ArrayList<Side> readSides(String fileName) { 
		ArrayList<Side> sides = new ArrayList <Side>(); 

		try {
			BufferedReader br = new BufferedReader(new FileReader("data/sides.txt"));
			String line = null; 
			while((line = br.readLine()) != null) { 
				String[] item = line.split("@@");
				sides.add(new Side(item[0], item[1], Integer.parseInt(item[2]))); 
			} 
		} catch (IOException e) { 
			System.out.println(e.getMessage());
		} 
		return sides; 
	}

	/** 
	 * Method readSalads  
	 * @param fileName
	 * @return arraylist of salads  
	 */

	public static ArrayList<Salad> readSalads(String fileName) { 
		ArrayList<Salad> salads = new ArrayList <Salad>(); 
		try {
			BufferedReader br = new BufferedReader(new FileReader("data/salads.txt"));
			String line = null; 
			while((line = br.readLine()) != null) { 
				String[] item = line.split("@@");
				salads.add(new Salad(item[0], item[1], Integer.parseInt(item[2]))); 
			} 
		} catch (IOException e) { 
			System.out.println(e.getMessage());
		} 
		return salads; 
	}

	/** 
	 * Method readDesserts  
	 * @param fileName
	 * @return arraylist of desserts  
	 */

	public static ArrayList<Dessert> readDesserts(String fileName) { 
		ArrayList<Dessert> desserts = new ArrayList <Dessert>(); 

		try {
			BufferedReader br = new BufferedReader(new FileReader("data/desserts.txt"));
			String line = null; 
			while((line = br.readLine()) != null) { 
				String[] item = line.split("@@");
				desserts.add(new Dessert(item[0], item[1], Integer.parseInt(item[2]))); 
			} 
		} catch (IOException e) { 
			System.out.println(e.getMessage());
		} 
		return desserts; 
	}
} 