
/** 
 * Class MenuTest 
 * @author aditijunagade
 * created: 10/11/2022 
 */

public class MenuTest {

	public static void main(String[] args) {

		Entree entree1 = new Entree("Spaghetti", "The usual spaghetti with marinara", 500); 

		Entree entree2 = new Entree("Chicken alfredo", "Fettucini alfredo with grilled chicken", 900); 

		Side side1 = new Side("French fries", "Crispy fresh french fries", 200); 

		Salad salad1 = new Salad("Italian salad", "Your typical italian salad", 400); 

		Salad salad2 = new Salad("Ceasar salad", "Typical ceasear salad with croutons", 500); 

		Dessert dessert1 = new Dessert("Brownies", "Warm brownies with vanilla ice cream", 1000); 

		//fill with entree and salad 
		Menu menu1 = new Menu("Basic Menu: ", entree1, null, salad1, null); 

		//fill with other entree, side, salad, dessert 
		Menu menu2 = new Menu("Advanced Menu: ", entree2, side1, salad2, dessert1); 

		System.out.println(menu1); 

		System.out.println(menu2); 
	}

}
