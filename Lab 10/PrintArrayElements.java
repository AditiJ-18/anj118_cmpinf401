import java.util.ArrayList;
import java.util.Scanner;

public class PrintArrayElements {

	public static void main(String[] args) {
		
		Scanner kbd = new Scanner(System.in);
		
		// get user command line input 
		System.out.println("Please enter an array of ints separated by spaces: "); 
		String arrStr = kbd.nextLine(); 
		
		System.out.println("Please enter an int for an index: "); 
		int index = kbd.nextInt(); 
		
		//process ints into arraylist 
		String arr[] = arrStr.split(" "); 
		ArrayList<Integer> aList = new ArrayList<Integer>(); 
		for(String s : arr) {
			int num = Integer.parseInt(s); 
			aList.add(num); 
		} 
	
		//add arraylist to array 
		int a[] = new int[aList.size()]; 
		for (int num : aList) { 
			//int in = aList.indexOf(num); 
			a[aList.indexOf(num)] = num; 
		}
		
		//int a[] = aList.toArray(new int[0]); 
	
		printArrayElements(a, index); 
		kbd.close(); 
		System.exit(0);
		
		//tester code 
		/* int a[] = {1,2,3,4,5,6,7,8,9}; 
		printArrayElements(a, 0); */ 
		
	}

	public static void printArrayElements(int a[], int index) {

		//base case
		if (index < 0) {
			System.exit(0); 
		}

		//alternate case && index < a.length
		if (index >= 0 && index < a.length) {
			System.out.println(a[index]); 
			printArrayElements(a, index + 1); 
		}
	}
} 