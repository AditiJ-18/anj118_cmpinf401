import java.util.Random;
import java.util.Scanner;

public class Dice {
	
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in); 
		Random rand = new Random(); 
		
		System.out.println("Please enter how many times you want to roll the dice."); 
		int a = kbd.nextInt();
		
		Dice.RollDice(a, rand); 
		
		System.out.println("Would you like to roll again? Please type 'yes' or 'no'."); 
		String response = kbd.next();  
		
		if (response.equals("yes")){ 
			System.out.println("Please enter how many times you want to roll the dice.");  
			a = kbd.nextInt(); 
			Dice.RollDice(a, rand); 
			System.out.println("Would you like to roll again? Please type 'yes' or 'no'."); 
			response = kbd.next(); 
			while (response.equals("yes")) { 
				System.out.println("Please enter how many times you want to roll the dice.");  
				a = kbd.nextInt(); 
				Dice.RollDice(a, rand); 
				System.out.println("Would you like to roll again? Please type 'yes' or 'no'."); 
				response = kbd.next(); 
			}
		} else { 
			kbd.close(); 
			System.exit(0); 
		}
	}
	
	public static void RollDice(int a, Random rand) {

		// value is the random number that is generated/rolled 
		int value = 0;
		
		// counter is counting how many times a value is rolled 
		int counter2 = 0; 
		int counter3 = 0; 
		int counter4 = 0; 
		int counter5 = 0; 
		int counter6 = 0; 
		int counter7 = 0; 
		int counter8 = 0; 
		int counter9 = 0; 
		int counter10 = 0; 
		int counter11 = 0; 
		int counter12 = 0; 
		
		// for loop to randomly generate a number between 2-12 and then increment any counters when a number is selected 
		for (int i = 0; i < a; i++) { 
			value = rand.nextInt(11) + 2; 
			if (value == 2) { 
				counter2 ++; 
			} else if (value == 3) { 
				counter3 ++;
			} else if (value == 4) { 
				counter4 ++; 
			} else if (value == 5) { 
				counter5 ++; 
			} else if (value == 6) { 
				counter6 ++; 
			} else if (value == 7) { 
				counter7 ++; 
			} else if (value == 8) { 
				counter8 ++;
			} else if (value == 9) { 
				counter9 ++; 
			} else if (value == 10) { 
				counter10 ++; 
			} else if (value == 11) { 
				counter11 ++; 
			} else if (value == 12) { 
				counter12 ++; 	
			} 
			
		} 
		
		// prob is how many times number was randomly rolled out of 'a' rolls 
		String prob2 = counter2 + "/" + a; 
		String prob3 = counter3 + "/" + a; 
		String prob4 = counter4 + "/" + a;
		String prob5 = counter5 + "/" + a; 
		String prob6 = counter6 + "/" + a;  
		String prob7 = counter7 + "/" + a; 
		String prob8 = counter8 + "/" + a; 
		String prob9 = counter9 + "/" + a; 
		String prob10 = counter10 + "/" + a;
		String prob11 = counter11 + "/" + a; 
		String prob12 = counter12 + "/" + a;  
		
		// print out all answers 
		System.out.println("2: counts= " + counter2 + " probability: " + prob2); 
		System.out.println("3: counts= " + counter3 + " probability: " + prob3); 
		System.out.println("4: counts= " + counter4 + " probability: " + prob4); 
		System.out.println("5: counts= " + counter5 + " probability: " + prob5); 
		System.out.println("6: counts= " + counter6 + " probability: " + prob6); 
		System.out.println("7: counts= " + counter7 + " probability: " + prob7); 
		System.out.println("8: counts= " + counter8 + " probability: " + prob8); 
		System.out.println("9: counts= " + counter9 + " probability: " + prob9); 
		System.out.println("10: counts= " + counter10 + " probability: " + prob10); 
		System.out.println("11: counts= " + counter11 + " probability: " + prob11); 
		System.out.println("12: counts= " + counter12 + " probability: " + prob12); 
	}	 
} 