import javax.swing.JOptionPane;

public class DecomposingMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = JOptionPane.showInputDialog("Please enter a number from 1-9999 that represents an amount of money.");
		int r = Integer.parseInt(input); 
		int grand = r / 1000; 
		int b = r % 1000; 
		int ben = b / 100; 
		int s = b % 100;
		int saw = s / 10; 
		int buck = s % 10; 
		String grands = grand + " grands"; 
		String bens = ben + " Benjamins";
		String saws = saw + " sawbucks"; 
		String bucks = buck + " bucks"; 
		JOptionPane.showMessageDialog(null, grands + '\n' + bens + '\n' + saws + '\n' + bucks); 
		System.exit(0);
	}

}
