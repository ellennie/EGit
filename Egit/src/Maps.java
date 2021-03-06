
/*
 * These codes are used for Map System
 * Author Er Nie, Vivien Fazakas beautified and mark below. 
 */


import javax.swing.ImageIcon;
import javax.swing.JLabel;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JComboBox;
import javax.swing.JTextPane;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Maps {

	String Menu;
	String Information="Test"; //add first info here
	String Information1;//="test1"; //add info of Kepten in ENG here;
	String Information2;//="test2"; //add info of kepten in SWE here;
	String Information3; //add info of Mimolett in Eng here;
	String Information4; //add info of Mimolett in SWE here;
	String Information5; //add info of Bistro in Eng here;
	String Information6; //add info of Bistro in SWE here;
	String Information7; //add info of Tingbergets in Eng here;
	String Information8; //add info of Tingbergets in SWE here;
	String Information9; //add info of Chalmers in Eng here;
	String Information10; //add info of Chalmers in SWE here;
	String Information11; //add info of Göta Älv in Eng here;
	String Information12; //add info of Göta Älv in SWE here;
	String Information13; //add info of Äran in Eng here;
	String Information14; //add info of Äran in SWE here;
	String Information15; //add info of Cristina in Eng here;
	String Information16; //add info of Cristina in SWE here;
	String Information17; //add info of Älvstranden in Eng here;
	String Information18; //add info of Älvstranden in SWE here;
	String Information19; //add info of Bekir in Eng here;
	String Information20; //add info of Bekir in SWE here;
	String Information21;//="test21"; //add info of Pressbyrån in Eng here;
	String Information22;//="test22"; //add info of Pressbyrån in SWE here;
	String Language;
	private JFrame frame;
	String Refresh="Refresh";
	String[] restaurant = {Refresh,"Kepten Nemo`s Pizzeria","Mimolett HB",
			"Bistro Kajkanten","Tingbergets Pizzeria Grillbar","Chalmers Studentkårs Restaurang",
			"Restaurang Göta Älv","Äran Restaurang","Cristina Taspinar",
			"Restaurang Älvstranden","Bekir Erdal","Pressbyrån","ALL"};
	//get pic
	ImageIcon image1 = new ImageIcon("/Users/NIEER/Desktop/CODE/LINDHOLMEN.jpg");	
	ImageIcon image2 = new ImageIcon("/Users/NIEER/Desktop/CODE/R.png");
	ImageIcon image3 = new ImageIcon("/Users/NIEER/Desktop/CODE/uk.gif");
	ImageIcon image4 = new ImageIcon("/Users/NIEER/Desktop/CODE/se.gif");
	
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
		// build a frame with lindholmen`s map
		frame = new JFrame();
		frame.setBounds(100, 100, 935, 675);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		//The label of restaurant marks
		final JLabel Res1 = new JLabel(image2);
		final JLabel Res2 = new JLabel(image2);
		final JLabel Res3 = new JLabel(image2);
		final JLabel Res4 = new JLabel(image2);
		final JLabel Res5 = new JLabel(image2);
		final JLabel Res6 = new JLabel(image2);
		final JLabel Res7 = new JLabel(image2);
		final JLabel Res8 = new JLabel(image2);
		final JLabel Res9 = new JLabel(image2);
		final JLabel Res10 = new JLabel(image2);
		final JLabel Res11 = new JLabel(image2);
		JLabel label = new JLabel(image1);
		label.setBounds(0, 125, 640, 480);
		Res1.setBounds(0,100,365,125);
		frame.getContentPane().add(Res1);
		Res1.setVisible(false);
		Res2.setBounds(0,100,750,65);
		frame.getContentPane().add(Res2);
		Res2.setVisible(false);
		Res3.setBounds(0,100,880,430);
		frame.getContentPane().add(Res3);
		Res3.setVisible(false);
		Res4.setBounds(0,100,700,355);
		frame.getContentPane().add(Res4);
		Res4.setVisible(false);
		Res5.setBounds(0,100,1025,295);
		frame.getContentPane().add(Res5);
		Res5.setVisible(false);
		Res6.setBounds(0,100,1135,490);
		frame.getContentPane().add(Res6);
		Res6.setVisible(false);
		Res7.setBounds(0,100,695,695);
		frame.getContentPane().add(Res7);
		Res7.setVisible(false);
		Res8.setBounds(0,100,570,675);
		frame.getContentPane().add(Res8);
		Res8.setVisible(false);
		Res9.setBounds(0,100,580,840);
		frame.getContentPane().add(Res9);
		Res9.setVisible(false);
		Res10.setBounds(0,100,305,565);
		frame.getContentPane().add(Res10);
		Res10.setVisible(false);
		Res11.setBounds(0,100,755,145);
		frame.getContentPane().add(Res11);
		Res11.setVisible(false);
		frame.getContentPane().add(label);
		
		//to show the Information here
		final JTextPane textField = new JTextPane();
		textField.setBackground(new Color(245, 245, 220));
		textField.setForeground(new Color(255, 165, 0));
		textField.setBounds(700, 260, 225, 375);
		textField.setFont(new Font("Bauhaus 93", Font.PLAIN, 25));//Vivien merged with fonts
		frame.getContentPane().add(textField);
		textField.setEditable(false);
		textField.setText(Information);
		
		final JButton btnLanguageUK = new JButton(image3);
		btnLanguageUK.setBounds(705, 170, 125, 25);
		frame.getContentPane().add(btnLanguageUK);
		btnLanguageUK.setVisible(false);
		
		final JButton btnLanguageSE = new JButton(image4);
		btnLanguageSE.setBounds(705, 170, 125, 25);
		frame.getContentPane().add(btnLanguageSE);
		btnLanguageSE.setVisible(true);
		
		// This code below belongs to Vivien Fazakas
		JLabel lblNewLabel = new JLabel("Feed me");
		lblNewLabel.setForeground(new Color(255, 165, 0));
		lblNewLabel.setFont(new Font("Bauhaus 93", Font.PLAIN, 75));
		lblNewLabel.setBounds(200, 10, 365, 120);
		frame.add(lblNewLabel);
		
		JLabel lblNewLabel1 = new JLabel("Info");
		lblNewLabel1.setForeground(new Color(255, 165, 0));
		lblNewLabel1.setFont(new Font("Bauhaus 93", Font.PLAIN, 60));
		lblNewLabel1.setBounds(700, 10, 300, 120);
		frame.add(lblNewLabel1);
		//Vivien Fazakas ends
		
		JComboBox comboBox = new JComboBox(restaurant);
		comboBox.setBounds(705, 123, 160, 21);
		frame.getContentPane().add(comboBox);
		comboBox.setSelectedIndex(0);
		comboBox.addItemListener(new ItemListener(){

			@Override
			public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange()==ItemEvent.SELECTED){
			if(e.getItem().equals("Kepten Nemo`s Pizzeria")){
				Res1.setVisible(true);
				Res2.setVisible(false);
				Res3.setVisible(false);
				Res4.setVisible(false);
				Res5.setVisible(false);
				Res6.setVisible(false);
				Res7.setVisible(false);
				Res8.setVisible(false);
				Res9.setVisible(false);
				Res10.setVisible(false);
				Res11.setVisible(false);
				if(true==btnLanguageUK.isVisible()){
					textField.setText(null);
					textField.setText(Information1);
					}
					else if(false==btnLanguageUK.isVisible()){
						textField.setText(null);
						textField.setText(Information2);
					}
			}
			else if(e.getItem().equals("Mimolett HB")){
				Res2.setVisible(true);
				Res1.setVisible(false);
				Res3.setVisible(false);
				Res4.setVisible(false);
				Res5.setVisible(false);
				Res6.setVisible(false);
				Res7.setVisible(false);
				Res8.setVisible(false);
				Res9.setVisible(false);
				Res10.setVisible(false);
				Res11.setVisible(false);
				if(true==btnLanguageUK.isVisible()){
				textField.setText(null);
				textField.setText(Information3);
				}
				else if(false==btnLanguageUK.isVisible()){
					textField.setText(null);
					textField.setText(Information4);
				}
			}
			else if(e.getItem().equals("Bistro Kajkanten")){
				Res3.setVisible(true);
				Res1.setVisible(false);
				Res2.setVisible(false);
				Res4.setVisible(false);
				Res5.setVisible(false);
				Res6.setVisible(false);
				Res7.setVisible(false);
				Res8.setVisible(false);
				Res9.setVisible(false);
				Res10.setVisible(false);
				Res11.setVisible(false);
				if(true==btnLanguageUK.isVisible()){
					textField.setText(null);
					textField.setText(Information5);
					}
					else if(false==btnLanguageUK.isVisible()){
						textField.setText(null);
						textField.setText(Information6);
					}
				
			}			
			else if(e.getItem().equals("Tingbergets Pizzeria Grillbar")){
				Res4.setVisible(true);
				Res1.setVisible(false);
				Res2.setVisible(false);
				Res3.setVisible(false);
				Res5.setVisible(false);
				Res6.setVisible(false);
				Res7.setVisible(false);
				Res8.setVisible(false);
				Res9.setVisible(false);
				Res10.setVisible(false);
				Res11.setVisible(false);
				if(true==btnLanguageUK.isVisible()){
					textField.setText(null);
					textField.setText(Information7);
					}
					else if(false==btnLanguageUK.isVisible()){
						textField.setText(null);
						textField.setText(Information8);
					}
				
			}			
			else if(e.getItem().equals("Chalmers Studentkårs Restaurang")){
				Res5.setVisible(true);
				Res1.setVisible(false);
				Res2.setVisible(false);
				Res3.setVisible(false);
				Res4.setVisible(false);
				Res6.setVisible(false);
				Res7.setVisible(false);
				Res8.setVisible(false);
				Res9.setVisible(false);
				Res10.setVisible(false);
				Res11.setVisible(false);
				if(true==btnLanguageUK.isVisible()){
					textField.setText(null);
					textField.setText(Information9);
					}
					else if(false==btnLanguageUK.isVisible()){
						textField.setText(null);
						textField.setText(Information10);
					}
				
			}			
			else if(e.getItem().equals("Restaurang Göta Älv")){
				Res6.setVisible(true);
				Res1.setVisible(false);
				Res2.setVisible(false);
				Res3.setVisible(false);
				Res4.setVisible(false);
				Res5.setVisible(false);
				Res7.setVisible(false);
				Res8.setVisible(false);
				Res9.setVisible(false);
				Res10.setVisible(false);
				Res11.setVisible(false);
				if(true==btnLanguageUK.isVisible()){
					textField.setText(null);
					textField.setText(Information11);
					}
					else if(false==btnLanguageUK.isVisible()){
						textField.setText(null);
						textField.setText(Information12);
					}
				
			}			
			else if(e.getItem().equals("Äran Restaurang")){
				Res7.setVisible(true);
				Res1.setVisible(false);
				Res2.setVisible(false);
				Res3.setVisible(false);
				Res4.setVisible(false);
				Res5.setVisible(false);
				Res6.setVisible(false);
				Res8.setVisible(false);
				Res9.setVisible(false);
				Res10.setVisible(false);
				Res11.setVisible(false);
				if(true==btnLanguageUK.isVisible()){
					textField.setText(null);
					textField.setText(Information13);
					}
					else if(false==btnLanguageUK.isVisible()){
						textField.setText(null);
						textField.setText(Information14);
					}
				
			}			
			else if(e.getItem().equals("Cristina Taspinar")){
				Res8.setVisible(true);
				Res1.setVisible(false);
				Res2.setVisible(false);
				Res3.setVisible(false);
				Res4.setVisible(false);
				Res5.setVisible(false);
				Res6.setVisible(false);
				Res7.setVisible(false);
				Res9.setVisible(false);
				Res10.setVisible(false);
				Res11.setVisible(false);
				if(true==btnLanguageUK.isVisible()){
					textField.setText(null);
					textField.setText(Information15);
					}
					else if(false==btnLanguageUK.isVisible()){
						textField.setText(null);
						textField.setText(Information16);
					}
				
			}			
			else if(e.getItem().equals("Restaurang Älvstranden")){
				Res9.setVisible(true);
				Res1.setVisible(false);
				Res2.setVisible(false);
				Res3.setVisible(false);
				Res4.setVisible(false);
				Res5.setVisible(false);
				Res6.setVisible(false);
				Res7.setVisible(false);
				Res8.setVisible(false);
				Res10.setVisible(false);
				Res11.setVisible(false);
				if(true==btnLanguageUK.isVisible()){
					textField.setText(null);
					textField.setText(Information17);
					}
					else if(false==btnLanguageUK.isVisible()){
						textField.setText(null);
						textField.setText(Information18);
					}
				
			}			
			else if(e.getItem().equals("Bekir Erdal")){
				Res10.setVisible(true);
				Res1.setVisible(false);
				Res2.setVisible(false);
				Res3.setVisible(false);
				Res4.setVisible(false);
				Res5.setVisible(false);
				Res6.setVisible(false);
				Res7.setVisible(false);
				Res8.setVisible(false);
				Res9.setVisible(false);
				Res11.setVisible(false);
				if(true==btnLanguageUK.isVisible()){
					textField.setText(null);
					textField.setText(Information19);
					}
					else if(false==btnLanguageUK.isVisible()){
						textField.setText(null);
						textField.setText(Information20);
					}
				
			}			
			else if(e.getItem().equals("Pressbyrån")){
				Res11.setVisible(true);
				Res1.setVisible(false);
				Res2.setVisible(false);
				Res3.setVisible(false);
				Res4.setVisible(false);
				Res5.setVisible(false);
				Res6.setVisible(false);
				Res7.setVisible(false);
				Res8.setVisible(false);
				Res9.setVisible(false);
				Res10.setVisible(false);
				if(true==btnLanguageUK.isVisible()){
					textField.setText(null);
					textField.setText(Information21);
					}
					else if(false==btnLanguageUK.isVisible()){
						textField.setText(null);
						textField.setText(Information22);
					}
				
			}	
			else if(e.getItem().equals("ALL")){
				Res11.setVisible(true);
				Res1.setVisible(true);
				Res2.setVisible(true);
				Res3.setVisible(true);
				Res4.setVisible(true);
				Res5.setVisible(true);
				Res6.setVisible(true);
				Res7.setVisible(true);
				Res8.setVisible(true);
				Res9.setVisible(true);
				Res10.setVisible(true);
				
			}
		}
			else{
				Res1.setVisible(false);
				Res2.setVisible(false);
				Res3.setVisible(false);
				Res4.setVisible(false);
				Res5.setVisible(false);
				Res6.setVisible(false);
				Res7.setVisible(false);
				Res8.setVisible(false);
				Res9.setVisible(false);
				Res10.setVisible(false);
				Res11.setVisible(false);
				textField.setText(Information);
			}
		}
		});
		
		JLabel lblClickRefreshIf = new JLabel("Refresh if changed language");
		lblClickRefreshIf.setBounds(705, 215, 175, 15);
		lblClickRefreshIf.setForeground(new Color(255, 175, 0));
		lblClickRefreshIf.setFont(new Font("Bauhaus 93", Font.PLAIN, 13)); //Vivien merged with fonts
		frame.getContentPane().add(lblClickRefreshIf);
		lblClickRefreshIf.setVisible(true);
		
		JLabel lblClickRefreshIf1 = new JLabel("Refresh if changed language in SE");
		lblClickRefreshIf1.setBounds(705, 215, 175, 15);
		lblClickRefreshIf1.setForeground(new Color(255, 175, 0));
		lblClickRefreshIf1.setFont(new Font("Bauhaus 93", Font.PLAIN, 13));//Vivien merged with fonts
		frame.getContentPane().add(lblClickRefreshIf1);
		lblClickRefreshIf1.setVisible(false);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 905, 21);
		frame.getContentPane().add(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
	
		JMenuItem exitAction = new JMenuItem("Exit");
		mnMenu.add(exitAction);
		
		JPanel panel = new JPanel();
		panel.setBounds(650, 30, 164, 203);
		frame.getContentPane().add(panel);
		exitAction.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent arg0)
			 {
				 System.exit(0);
			 }
		});
		btnLanguageSE.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				btnLanguageSE.setVisible(false);
				btnLanguageUK.setVisible(true);


			}			
		});
		btnLanguageUK.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				btnLanguageSE.setVisible(true);
				btnLanguageUK.setVisible(false);

			}			
		});

	}
}


/*
 * These codes are used for Map System
 * Author Er Nie, Vivien Fazakas beautified and mark above.
 */



