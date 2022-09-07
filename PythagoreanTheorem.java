import javax.swing.JOptionPane;

public class PythagoreanTheorem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOne; 
		int numTwo; 
		String message = "Please enter the length of one side of a triangle."; 
		String inputOne = JOptionPane.showInputDialog(message); 
		numOne = Integer.parseInt(inputOne); 
		String inputTwo = JOptionPane.showInputDialog("Enter the length of the other side."); 
		numTwo = Integer.parseInt(inputTwo); 
		double hypotenuse; 
		double squareOne = Math.pow(numOne, 2); 
		double squareTwo = Math.pow(numTwo, 2); 
		double addedNums = squareOne + squareTwo;
		hypotenuse = Math.sqrt(addedNums); 
		hypotenuse = hypotenuse * 100; 
		int r = (int) Math.round(hypotenuse); 
		hypotenuse = r/100.0; 
		JOptionPane.showMessageDialog(null,"The hypotenuse is " + hypotenuse);
		System.exit(0); 		
	}

}
