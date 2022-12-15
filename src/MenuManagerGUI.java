import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.BorderFactory;

/**
 * Class MenuManagerGUI
 * The MenuManagerGUI program creates a GUI
 * that allows the user to create menus of their choice,
 * generate random menus, and saves all to a file 
 * the user can also get details of their menu, 
 * or delete all the menus 
 * @author aditijunagade
 * created 12/07/2022 
 */

public class MenuManagerGUI {

	JFrame mainFrame;
	JFrame details; 

	JComboBox jcboEntree; 
	JComboBox jcboSide; 
	JComboBox jcboSalad;
	JComboBox jcboDessert; 

	JButton jbtCreateMenu; 
	JButton jbtRandMenu; 
	JButton jbtMinMenu; 
	JButton jbtMaxMenu; 
	JButton jbtDetails; 
	JButton jbtDeleteAll; 
	JButton jbtSave; 

	JPanel byoPanel;  
	JPanel genPanel;
	JPanel createdPanel;

	JLabel jlblByo;
	JLabel jlblGen; 
	JLabel jlblCreated; 
	JLabel jlblEntree; 
	JLabel jlblSide; 
	JLabel jlblSalad; 
	JLabel jlblDessert; 
	JLabel jlblEntree2; 
	JLabel jlblSide2; 
	JLabel jlblSalad2; 
	JLabel jlblDessert2; 
	JLabel jlblTotalCal; 
	JLabel jlblTotalPrice; 

	JTextArea txtArea; 
	JTextArea entTxt; 
	JTextArea sideTxt; 
	JTextArea saladTxt; 
	JTextArea dessertTxt; 

	JTextField totalCal; 
	JTextField totalPrice; 

	MenuManager menuManage; 

	ArrayList<Menu> menuList = new ArrayList<Menu> (); 

/**
 * method MenuManagerGUI
 * creates a GUI to create your own menus, create a random menu 
 * stores all generated menus in a file 
 * @author aditijunagade
 * created 12/07/2022  
 */
	public MenuManagerGUI(){


		menuManage = new MenuManager("data/dishes.txt");

		//set main frame Menu Manager's dimensions and properties 
		mainFrame = new JFrame ("Menu Manager"); 
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		mainFrame.setSize(800, 700); 
		mainFrame.setResizable(false); 


		//create BYO menu panel inside mainframe 
		jlblByo = new JLabel("Build Your Own Menu");

		//create each menu item label and combo box and populate combo boxes with arraylists of menu items 
		jlblEntree = new JLabel("Entree"); 
		jlblEntree.setSize(30, 50); 
		ArrayList<Entree> ent = menuManage.getEntrees(); 
		jcboEntree = new JComboBox(ent.toArray()); 
		Entree inEnt = (Entree) jcboEntree.getSelectedItem();

		JPanel enPan = new JPanel();
		enPan.setLayout(new BoxLayout(enPan, BoxLayout.LINE_AXIS));
		enPan.add(jlblEntree); 
		enPan.add(jcboEntree); 
		enPan.setBorder(new EmptyBorder(10, 10, 10, 10));

		jlblSide = new JLabel("Side"); 
		jlblSide.setSize(30, 50);
		ArrayList<Side> side = menuManage.getSides();
		jcboSide = new JComboBox(side.toArray()); 
		Side inSid = (Side) jcboSide.getSelectedItem(); 

		JPanel siPan = new JPanel();
		siPan.setLayout(new BoxLayout(siPan, BoxLayout.LINE_AXIS));
		siPan.add(jlblSide); 
		siPan.add(jcboSide); 
		siPan.setBorder(new EmptyBorder(10, 10, 10, 10));		

		jlblSalad = new JLabel("Salad"); 
		jlblSalad.setSize(30, 50); 
		ArrayList<Salad> salad = menuManage.getSalads(); 
		jcboSalad = new JComboBox(salad.toArray());
		Salad inSal = (Salad) jcboSalad.getSelectedItem();

		JPanel saPan = new JPanel();
		saPan.setLayout(new BoxLayout(saPan, BoxLayout.LINE_AXIS));
		saPan.add(jlblSalad); 
		saPan.add(jcboSalad); 
		saPan.setBorder(new EmptyBorder(10, 10, 10, 10));

		jlblDessert = new JLabel("Dessert"); 
		jlblDessert.setSize(30, 50); 
		ArrayList<Dessert> dessert = menuManage.getDesserts(); 
		jcboDessert = new JComboBox(dessert.toArray());	
		Dessert inDes = (Dessert) jcboDessert.getSelectedItem();

		JPanel desPan = new JPanel();
		desPan.setLayout(new BoxLayout(desPan, BoxLayout.LINE_AXIS));
		desPan.add(jlblDessert); 
		desPan.add(jcboDessert); 
		desPan.setBorder(new EmptyBorder(10, 10, 10, 10));

		//create button to create menu 
		jbtCreateMenu = new JButton("Create Menu with these dishes"); 
		jbtCreateMenu.setSize(150, 20); 
		jbtCreateMenu.addActionListener(new ActionListener(){ 
			@Override
			public void actionPerformed(ActionEvent arg0){
				String input = JOptionPane.showInputDialog("Enter a name for your menu"); 
				Menu newMenu = new Menu(input, inEnt, inSid, inSal, inDes);
				menuList.add(newMenu); 
				txtArea.setText(txtArea.getText() + '\n' +  input); 
			}
		});

		//add all above components to byo panel 
		byoPanel = new JPanel();
		byoPanel.setLayout(new BoxLayout(byoPanel, BoxLayout.PAGE_AXIS));
		byoPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
		byoPanel.add(jlblByo); 
		byoPanel.add(enPan);
		byoPanel.add(siPan);
		byoPanel.add(saPan);
		byoPanel.add(desPan);
		byoPanel.add(jbtCreateMenu); 

		byoPanel.setVisible(true); 
		byoPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));


		//create genMenu panel 
		jlblGen = new JLabel("Or generate a Menu");

		//create button to create randmenu 
		jbtRandMenu = new JButton("Generate a Random Menu"); 
		jbtRandMenu.setSize(70, 20); 
		jbtRandMenu.addActionListener(new ActionListener(){ 
			@Override
			public void actionPerformed(ActionEvent arg0){
				String input = JOptionPane.showInputDialog("Enter a name for your menu: "); 
				Menu menu = menuManage.randomMenu(input);
				menuList.add(menu); 
				txtArea.setText(txtArea.getText() + '\n' +  input); 
			}
		}); 

		JPanel pan = new JPanel(); 
		pan.setLayout(new BoxLayout(pan, BoxLayout.PAGE_AXIS)); 
		pan.setAlignmentX(Component.CENTER_ALIGNMENT);
		pan.add(jlblGen);
		pan.add(jbtRandMenu);
		pan.setBorder(new EmptyBorder(10, 10, 10, 10));


		//add above items to genpanel 
		genPanel = new JPanel(); 
		genPanel.setLayout(new BoxLayout(genPanel, BoxLayout.PAGE_AXIS));
		genPanel.add(pan); 

		//genPanel.setLocation(0, 600); 
		genPanel.setVisible(true); 
		genPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		//create createdmenus panel 
		jlblCreated = new JLabel("Created Menus", SwingConstants.CENTER); 

		//create textarea 
		txtArea = new JTextArea(20, 20); 
		//txtArea.setLocation(500, 20); 
		txtArea.setEditable(false); 

		//create details button  
		jbtDetails = new JButton("Details"); 
		jbtDetails.setSize(70, 20); 
		jbtDetails.addActionListener(new ActionListener(){ 
			@Override
			public void actionPerformed(ActionEvent arg0){
				String inMenu = JOptionPane.showInputDialog("Enter the name of the menu you want details for: "); 

				//create details popup frame 
				details = new JFrame("Menu: " + inMenu);
				details.setResizable(false);
				JPanel detailsPanel = new JPanel();
				detailsPanel.setLayout(new BoxLayout(detailsPanel, BoxLayout.PAGE_AXIS));
				details.setSize(500, 500);

				jlblEntree2 = new JLabel("Entree              "); 
				entTxt = new JTextArea(3, 10);
				entTxt.setEditable(false);
				entTxt.setLineWrap(true);

				JPanel enPan = new JPanel();
				enPan.setLayout(new BoxLayout(enPan, BoxLayout.LINE_AXIS));
				enPan.add(jlblEntree2); 
				enPan.add(entTxt); 
				enPan.setBorder(new EmptyBorder(10, 10, 10, 10));

				jlblSide2 = new JLabel("Side                 "); 
				sideTxt = new JTextArea(3, 10);
				sideTxt.setEditable(false);
				sideTxt.setLineWrap(true);

				JPanel siPan = new JPanel();
				siPan.setLayout(new BoxLayout(siPan, BoxLayout.LINE_AXIS));
				siPan.add(jlblSide2); 
				siPan.add(sideTxt); 
				siPan.setBorder(new EmptyBorder(10, 10, 10, 10));

				jlblSalad2 = new JLabel("Salad                "); 
				saladTxt = new JTextArea(3, 10);
				saladTxt.setEditable(false);
				saladTxt.setLineWrap(true);

				JPanel salPan = new JPanel();
				salPan.setLayout(new BoxLayout(salPan, BoxLayout.LINE_AXIS));
				salPan.add(jlblSalad2); 
				salPan.add(saladTxt); 
				salPan.setBorder(new EmptyBorder(10, 10, 10, 10));

				jlblDessert2 = new JLabel("Dessert            ");
				dessertTxt = new JTextArea(3,10);
				dessertTxt.setEditable(false);
				dessertTxt.setLineWrap(true);

				JPanel desPan = new JPanel();
				desPan.setLayout(new BoxLayout(desPan, BoxLayout.LINE_AXIS));
				desPan.add(jlblDessert2); 
				desPan.add(dessertTxt); 
				desPan.setBorder(new EmptyBorder(10, 10, 10, 10));

				jlblTotalCal = new JLabel("Total Calories: "); 
				totalCal = new JTextField();
				totalCal.setEditable(false);

				JPanel cal = new JPanel();
				cal.setLayout(new BoxLayout(cal, BoxLayout.LINE_AXIS));
				cal.add(jlblTotalCal); 
				cal.add(totalCal); 
				cal.setBorder(new EmptyBorder(10, 10, 10, 10));

				jlblTotalPrice = new JLabel("Total Price: $  "); 
				totalPrice = new JTextField(); 
				totalPrice.setEditable(false);

				JPanel prix = new JPanel();
				prix.setLayout(new BoxLayout(prix, BoxLayout.LINE_AXIS));
				prix.add(jlblTotalPrice); 
				prix.add(totalPrice); 
				prix.setBorder(new EmptyBorder(10, 10, 10, 10));

				for(Menu s : menuList) {
					if (s.getName().equals(inMenu)) { 
						entTxt.setText(s.getEntreeDesc() + '\n' + "Calories: " + s.getEntCals() + '\n' + "Price: $" + s.getEntPrice());
						sideTxt.setText(s.getSideDesc() + '\n' + "Calories: " + s.getSideCals() + '\n' + "Price: $" +s.getSidePrice());
						saladTxt.setText(s.getSaladDesc() + '\n' + "Calories: " + s.getSaladCals() + '\n' + "Price: $" + s.getSaladPrice()); 
						dessertTxt.setText(s.getDessertDesc() + '\n' + "Calories: " + s.getDesCals() + '\n' + "Price: $" + s.getDesPrice());
						String totalCals = s.totalCalories(); 
						totalCal.setText(totalCals); 
						double totalPrix = s.getEntPrice() + s.getSaladPrice() + s.getSidePrice() + s.getDesPrice(); 
						totalPrice.setText(String.valueOf(totalPrix)); 
					}	

					detailsPanel.add(enPan); 
					detailsPanel.add(siPan); 
					detailsPanel.add(salPan); 
					detailsPanel.add(desPan); 
					detailsPanel.add(cal);
					detailsPanel.add(prix); 
					details.add(detailsPanel);
					details.setVisible(true); 
				}
			}
		});

		//create delete all button
		jbtDeleteAll = new JButton("Delete All"); 
		jbtDeleteAll.setSize(70,20); 
		//		jbtDeleteAll.setLocation(520, 100); 
		jbtDeleteAll.addActionListener(new ActionListener(){ 
			@Override
			public void actionPerformed(ActionEvent arg0){
				txtArea.setText(""); 
			}
		} ); 

		//create save to file button 
		jbtSave = new JButton("Save to file"); 
		jbtSave.setSize(70,20); 
		jbtSave.addActionListener(new ActionListener(){ 
			@Override
			public void actionPerformed(ActionEvent arg0){
				FileWriter fw; 
				String menus = txtArea.getText(); 
				try {
					fw = new FileWriter ("data/menus.txt");
					fw.write(menus); 
					fw.close();  	
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} ); 

		JPanel butPanel = new JPanel(); 
		butPanel.setLayout(new BoxLayout(butPanel, BoxLayout.LINE_AXIS));  
		butPanel.add(jbtDetails); 
		butPanel.add(jbtDeleteAll); 
		butPanel.add(jbtSave); 

		//add all above components to created menu panel 
		createdPanel = new JPanel(); 
		createdPanel.setLayout(new BoxLayout(createdPanel, BoxLayout.PAGE_AXIS));
		createdPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		createdPanel.add(jlblCreated); 
		createdPanel.add(txtArea); 
		createdPanel.add(butPanel); 

		//		createdPanel.setLocation(500, 0); 
		createdPanel.setVisible(true);
		createdPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));


		JPanel westPanel = new JPanel();
		westPanel.setLayout(new GridLayout(2, 1));
		westPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		westPanel.add(byoPanel);
		westPanel.add(genPanel);

		mainFrame.setLayout(new GridLayout(1, 2));

		//add all panels to layout  
		mainFrame.add(westPanel, BorderLayout.WEST); 
		mainFrame.add(createdPanel, BorderLayout.EAST); 

		//make the main frame visible 
		mainFrame.setVisible(true); 
	}
/**
 * main method for class MenuManagerGUI
 * results in a GUI with multiple different functionalities 
 * @author aditijunagade
 * @param args
 * created 12/07/2022 
 */
	public static void main(String[] args) {
		MenuManagerGUI window = new MenuManagerGUI(); 
	}

}
