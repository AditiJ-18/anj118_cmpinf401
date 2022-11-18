/**
 * Class FileManager
 * @author aditijunagade
 * @created 10/031/2022 
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {

	public static ArrayList<MenuItem> readItems (String fileName){
		ArrayList<MenuItem> itemList = new ArrayList<MenuItem> (); 
	
		try {
			BufferedReader br = new BufferedReader(new FileReader("data/dishes.txt"));
			String line = null; 
			while((line = br.readLine()) != null) { 
				String[] item = line.split("@@");
				
				//for testing if reading and splitting correctly 
				/*System.out.println(item.length); 
				for(int i = 0; i < item.length; i++) {
					System.out.println(item[i]); 
				} */ 
				
			
				if (item[1].equals("entree")){ 
					//Entree entr = new Entree(item[0], item[2], Integer.parseInt(item[3]), Double.parseDouble(item[4]));
					itemList.add(new Entree(item[0], item[2], Integer.parseInt(item[3]), Double.parseDouble(item[4])));  
				} else if (item[1].equals("side")) { 
					Side side = new Side(item[0], item[2], Integer.parseInt(item[3]), Double.parseDouble(item[4])); 
					//System.out.println(side); 
					itemList.add(side); 
				} else if (item[1].equals("salad")) {
					Salad salad = new Salad(item[0], item[2], Integer.parseInt(item[3]), Double.parseDouble(item[4])); 
					//System.out.println(salad); 
					itemList.add(salad); 
				} else if (item[1].equals("dessert")) {
					Dessert dessert = new Dessert(item[0], item[2], Integer.parseInt(item[3]), Double.parseDouble(item[4]));
					//System.out.println(dessert); 
					itemList.add(dessert); 
				}		
			}
			br.close();

		} catch (IOException e) { 
			System.out.println(e.getMessage());
		}
		//System.out.println(itemList.size()); 
		return itemList; 
	}

	public static void writeMenus(String fileName, ArrayList<Menu> menus) {
		FileWriter fw;
		try {
			fw = new FileWriter ("data/menus.txt");
			for (int i = 0; i < menus.size(); i++) { 
				fw.write((menus.get(i)).toString()); 
				fw.close(); 
			} 	
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
} 