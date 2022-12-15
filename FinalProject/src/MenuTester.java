import java.util.ArrayList;

/**
 * Class MenuTester  
 * @author aditijunagade
 * @created 10/31/2022 
 */

public class MenuTester{
	public static void main(String[] args){
		MenuRandomize randMenu = new MenuRandomize("data/dishes.txt"); 
		Menu myMenu = randMenu.randomMenu(); 
		System.out.println(myMenu); 
	}
} 