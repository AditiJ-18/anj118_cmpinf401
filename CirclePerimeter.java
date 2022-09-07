import javax.swing.JOptionPane;

public class CirclePerimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = JOptionPane.showInputDialog("Please enter the radius of a circle");
		int r = Integer.parseInt(input); 
		double perimeter = 2 * Math.PI * r; 
		perimeter *= 100; 
		int p = (int) Math.round(perimeter); 
		perimeter = p/100.0; 
		double rSquared = Math.pow(r, 2); 
		perimeter = r / 100.0; 
		double area = Math.PI * rSquared; 
		area *= 100;
		int a = (int) Math.round(area); 
		area = a/1000.0; 
		JOptionPane.showMessageDialog(null,"The circle with radius " + r + " has an area of " + area + " and a perimeter of " + perimeter); 
		System.exit(0);
	}

}
