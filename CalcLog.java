package anj118_lab4;

import javax.swing.JOptionPane;

public class CalcLog {

	public static void main(String[] args) {
	
		String loginput = JOptionPane.showInputDialog("Please enter the value of the log."); 
		int X = Integer.parseInt(loginput); 
		while (X < 0){ 
			String error = JOptionPane.showInputDialog("Please enter a value for the log that is greater than 0."); 
			X = Integer.parseInt(error); 
			
		}
		
		String baseinput = JOptionPane.showInputDialog("Please enter the value of the base.");
		int b = Integer.parseInt(baseinput); 
		while (b < 1){ 
			String error2 = JOptionPane.showInputDialog("Please enter a value for the base that is greater than 1."); 
			b = Integer.parseInt(error2); 
		}
		
		int Y = 0; 
		int x2 = X; 
		for (int i = 0; x2 >= b;i++) { 
			x2 /= b; 
			Y++; 
		} 
		
		JOptionPane.showMessageDialog(null, "The log of " + X + " with base " + b + " is " + Y);
	}
}
 