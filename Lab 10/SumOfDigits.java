import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in); 
		System.out.println("Please enter an int: ");
		int x = kbd.nextInt(); 
		System.out.println(sumOfDigits(x));  
		kbd.close(); 
		System.exit(0); 
	}

	public static int sumOfDigits(int x) { 
		int sum = 0; 

		//make the number positive if negative 
		if (x < 0) { 
			x *= -1; 
		}

		//base case 
		if(x >= 0 && x < 10) {
			sum += x; 
			return sum; 
		}

		//alternate case 
		sum += (x % 10); 
		return sum + sumOfDigits(x/10); 	
	} 
}
