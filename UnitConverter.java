package anj118_lab3;

import javax.swing.JOptionPane;

public class UnitConverter {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Please enter a distance or weight amount with units."); 
		
		int c = input.indexOf(" "); 
		String d = input.substring(0,c); 
		double value = Double.parseDouble(d);
		String units = input.substring(c+1, input.length());
	
		String result = "";  
		
		if (units.equals("cm")){ 
			result = (value / 2.54) + " in"; 
		} else if (units.equals("in")) { 
			result = (value * 2.54) + " cm"; 
		} else if (units.equals("m")) { 
			result = (value / 0.9144) + " yd"; 
		} else if (units.equals("yd")) { 
			result = (value * 0.9144) + " m"; 
		} else if (units.equals("gm")) { 
			result = (value / 28.35) + " oz"; 
		} else if (units.equals("oz")) { 
			result = (value * 28.35) + " gm"; 
		} else if (units.equals("kg")) { 
			result = (value / 0.454) + " lb"; 
		} else if (units.equals("lb")) { 
			result = (value * 0.454) + " kg"; 
		}
		
		JOptionPane.showMessageDialog(null, input + " = " + result);
		
		} 
	} 
