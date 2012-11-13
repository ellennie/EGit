/**
 * @author Er Nie
 *
 */

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JComboBox;
import java.awt.Checkbox;
import java.awt.EventQueue;
import java.awt.Rectangle;
import java.awt.TextField;


public class Maps {
	public int width=100;
	public int height=100;
	public int boundW=100;
	public int boundH=100;

	private JFrame frame;
	ImageIcon image1 = new ImageIcon("/Users/NIEER/Downloads/Folders/LINDHOLMEN.jpg");	
	ImageIcon image2 = new ImageIcon("/Users/NIEER/Downloads/Folders/R.png");
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Maps window = new Maps();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
		
			
	public Maps() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JLabel Res = new JLabel(image2);
		JLabel label = new JLabel(image1);
		label.setBounds(0, 30, 640, 480);
		Res.setBounds(boundW,boundH,width,height);
		frame.getContentPane().add(Res);
		frame.getContentPane().add(label);
		
		
		JRadioButton rdbtnResturant = new JRadioButton("Restaurant 1");
		rdbtnResturant.setBounds(657, 25, 121, 23);
		frame.getContentPane().add(rdbtnResturant);
		
		JRadioButton rdbtnResturant_1 = new JRadioButton("Restaurant 2");
		rdbtnResturant_1.setBounds(657, 58, 121, 23);
		frame.getContentPane().add(rdbtnResturant_1);
		
		JRadioButton rdbtnResturant_2 = new JRadioButton("Restaurant 3");
		rdbtnResturant_2.setBounds(657, 94, 121, 23);
		frame.getContentPane().add(rdbtnResturant_2);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 784, 21);
		frame.getContentPane().add(menuBar);
		
		JMenu mnMenu = new JMenu("Menu 1");
		menuBar.add(mnMenu);
		
		JMenu mnMenu_1 = new JMenu("Menu 2");
		menuBar.add(mnMenu_1);
		
		JMenu mnMenu_2 = new JMenu("Menu 3");
		menuBar.add(mnMenu_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(657, 132, 91, 21);
		frame.getContentPane().add(comboBox);
		
		
		Checkbox checkbox = new Checkbox("Restaurant 4");
		checkbox.setBounds(657, 171, 101, 23);
		frame.getContentPane().add(checkbox);
		
		Checkbox checkbox_1 = new Checkbox("Restaurant 5");
		checkbox_1.setBounds(657, 200, 101, 23);
		frame.getContentPane().add(checkbox_1);
		
		TextField textField = new TextField();
		textField.setBounds(0, 508, 640, 54);
		frame.getContentPane().add(textField);
		textField.setEditable(false);
		textField.setText("The information of restaurant");
		
		
		// if you just wanna use the information from database
		// just use textField.getText(database information);
	}
}

/**
 * @author Er Nie
 *
 */
