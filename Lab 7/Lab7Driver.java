import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lab7Driver {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		
		System.out.println("How many items will be entered?"); 
		int a = kbd.nextInt(); 
		
		double [] arr = new double[a]; 
		
		Random rand = new Random();
		for(int i = 0; i < a; i++) { 
			arr[i] = rand.nextDouble(); 
		}
		
		System.out.println("Array: " + Arrays.toString(arr)); 
		System.out.println("Maximum: " + Lab7.max(arr)); 
		System.out.println("Minimum: " + Lab7.min(arr)); 
		System.out.println("Sum: " + Lab7.sum(arr)); 
		System.out.println("Average: " + Lab7.ave(arr)); 
		
	}

}