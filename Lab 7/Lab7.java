public class Lab7 {

	//return maximum of array 
	public static double max(double[] data) { 
		double max = data[0];  
		for (int i = 1; i < data.length; i++) { 
			if(data[i] > max) { 
				max = data[i]; 
			}
		}
		return max; 
	}
	
	//return minimum of array 
	public static double min(double[] data) { 
		double min = data[0]; 
		for (int i = 1; i < data.length; i++) { 
			if(data[i] < min) { 
				min = data[i]; 
			}
		}
		return min; 
	}
	
	//return sum of items of array 
	public static double sum(double[] data) { 
		double sum = 0.0; 
		for (int i = 0; i < data.length; i++) { 
			sum += data[i]; 
			}
		return sum; 
	}
	
	//call the sum method and return the average 
	public static double ave(double[] data) { 
		double ave = 0.0; 
		ave = sum(data) / data.length; 
		return ave; 
	}
	
}
