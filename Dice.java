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
	
	public static void RollDice(int a, Random r) {

		//roll 1 
		int [] roll1 = new int[a]; 
		for (int i = 0; i < a; i++){ 
			roll1[i] = r.nextInt(6)+1; 
		}
	
		//roll 2 
		for (int i = 0; i < a; i++) { 
			roll1[i] += r.nextInt(6)+1; 
		}

		//c2, c3, etc are counters 
		int c2 = 0; 
		int c3 = 0; 
		int c4 = 0; 
		int c5 = 0; 
		int c6 = 0; 
		int c7 = 0; 
		int c8 = 0; 
		int c9 = 0; 
		int c10 = 0; 
		int c11 = 0; 
		int c12 = 0; 
		
		// for loop to count how many times each sum occurs 
		for(int i = 0; i < roll1.length; i++) { 
			if(roll1[i] == 2) { 
				c2 ++; 
			} else if (roll1[i] == 3) { 
				c3 ++; 
			} else if (roll1[i] == 4) { 
				c4 ++; 
			} else if (roll1[i] == 5) { 
				c5 ++; 
			} else if (roll1[i] == 6) { 
				c6 ++; 
			} else if (roll1[i] == 7) { 
				c7 ++; 
			} else if (roll1[i] == 8) { 
				c8 ++; 
			} else if (roll1[i] == 9) { 
				c9 ++; 
			} else if (roll1[i] == 10) { 
				c10 ++; 
			} else if (roll1[i] == 11) { 
				c11 ++; 
			} else if (roll1[i] == 12) { 
				c12 ++; 
			}
		}
		
		//prob calculates the probability 
		String prob2 = c2 + "/" + a; 
		String prob3 = c3 + "/" + a; 
		String prob4 = c4 + "/" + a;
		String prob5 = c5 + "/" + a; 
		String prob6 = c6 + "/" + a;  
		String prob7 = c7 + "/" + a; 
		String prob8 = c8 + "/" + a; 
		String prob9 = c9 + "/" + a; 
		String prob10 = c10 + "/" + a;
		String prob11 = c11 + "/" + a; 
		String prob12 = c12 + "/" + a;  

		//print out all answers 
		System.out.println("2: counts= " + c2 + " probability: " + prob2); 
		System.out.println("3: counts= " + c3 + " probability: " + prob3); 
		System.out.println("4: counts= " + c4 + " probability: " + prob4); 
		System.out.println("5: counts= " + c5 + " probability: " + prob5); 
		System.out.println("6: counts= " + c6 + " probability: " + prob6); 
		System.out.println("7: counts= " + c7 + " probability: " + prob7); 
		System.out.println("8: counts= " + c8 + " probability: " + prob8); 
		System.out.println("9: counts= " + c9 + " probability: " + prob9); 
		System.out.println("10: counts= " + c10 + " probability: " + prob10); 
		System.out.println("11: counts= " + c11 + " probability: " + prob11); 
		System.out.println("12: counts= " + c12 + " probability: " + prob12); 
		
	}	
	
	
} 