/**
 * Class FileManager
 * @author aditijunagade
 * @created 10/031/2022 
 */

import java.io.BufferedReader;   
import java.io.File; 
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import Assignment1.Dessert;
import Assignment1.Entree;
import Assignment1.Salad;
import Assignment1.Side;

public class FileManager {

	/** 
	 * Method readEntrees 
	 * @param fileName
	 * @return an arrylist of entrees 
	 * found out how to create a file and .mkdirs from GeeksForGeeks
	 */

	public static ArrayList<Entree> readEntrees(String fileName) { 
		ArrayList<Entree> entree = new ArrayList <Entree>();  

		try {
			BufferedReader br = new BufferedReader(new FileReader("data/entrees.txt"));

			String line = ""; 
			for (int i = 0; i < 5; i++) { 

				line = br.readLine(); 
				if (line != null) { 
					String arr[] = line.split("@@"); 
					int cals = Integer.parseInt(arr[2]); 
					Entree entr = new Entree(arr[0], arr[1], cals); 
					entree.add(entr); 	
				} else { 
					return null; 
				}
			}

			/* while ((line = br.readLine()) != null) {

				String[] arr = line.split("@@");

				int cals = Integer.parseInt(arr[2]) ;

				Entree entr = new Entree(arr[0], arr[1], cals);

				entree.add(entr) ;*/ 

			br.close();
			// } 

		} catch (IOException e) { 
			System.out.println(e.getMessage());
			return null; 
		} catch (NullPointerException e2) {
			System.out.println(e2.getMessage());
		}

		return entree;  
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

			String line = ""; 
			for (int i = 0; i < 5; i++) { 

				line = br.readLine(); 
				if (line != null) { 
					String arr[] = line.split("@@"); 
					int cals = Integer.parseInt(arr[2]); 
					Side side1 = new Side(arr[0], arr[1], cals); 
					sides.add(side1); 	
				} else { 
					return null; 
				}
			} br.close(); 

		} catch (IOException e) { 
			System.out.println(e.getMessage());
			return null; 
		} catch (NullPointerException e2) {
			System.out.println(e2.getMessage());
		}

		return sides;  
	}



	/*File side = new File("data/sides.txt"); 
		if(!side.getParentFile().exists()) { 
			side.getParentFile().mkdirs(); 
		}

		if(!side.exists()) { 
			try {
				side.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}

		try { 
			BufferedReader br = new BufferedReader(new FileReader(side)); 

			String line = ""; 
			while ((line = br.readLine()) != null) {

				String[] arr = line.split("@@"); 

				int cals = Integer.parseInt(arr[2]); 

				Side side1 = new Side(arr[0], arr[1], cals); 
				sides.add(side1); 
			}

			br.close(); 

		} catch (IOException e) { 
			System.out.println(e.getMessage()); 
		} catch (NullPointerException e2) {
			System. out.println(e2.getMessage());
		}

		return sides; 	

	}*/ 

	/** 
	 * Method readSalads  
	 * @param fileName
	 * @return arraylist of salads  
	 */

	public static ArrayList<Salad> readSalads(String fileName) { 
		ArrayList<Salad> salads = new ArrayList <Salad>(); 


		try {
			BufferedReader br = new BufferedReader(new FileReader("data/salads.txt"));

			String line = ""; 
			for (int i = 0; i < 5; i++) { 

				line = br.readLine(); 
				if (line != null) { 
					String arr[] = line.split("@@"); 
					int cals = Integer.parseInt(arr[2]); 
					Salad sal = new Salad(arr[0], arr[1], cals); 
					salads.add(sal); 	
				} else { 
					return null; 
				}
			} br.close(); 

		} catch (IOException e) { 
			System.out.println(e.getMessage());
			return null; 
		} catch (NullPointerException e2) {
			System.out.println(e2.getMessage());
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

			String line = ""; 
			for (int i = 0; i < 5; i++) { 

				line = br.readLine(); 
				if (line != null) { 
					String arr[] = line.split("@@"); 
					int cals = Integer.parseInt(arr[2]); 
					Dessert des = new Dessert(arr[0], arr[1], cals); 
					desserts.add(des); 	
				} else { 
					return null; 
				}
			} br.close(); 

		} catch (IOException e) { 
			System.out.println(e.getMessage());
			return null; 
		} catch (NullPointerException e2) {
			System.out.println(e2.getMessage());
		}

		return desserts;  
	}
} 