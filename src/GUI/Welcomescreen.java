package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

//import com.sun.tools.sjavac.comp.dependencies.PublicApiCollector;

//import com.sun.tools.classfile.Opcode.Set;

import Database.Database;
import models.Customer;
import models.Orders1;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import java.awt.FlowLayout;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.CompoundBorder;
import javax.swing.JRadioButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.geom.Area;

import javax.swing.JTabbedPane;
import javax.swing.JSplitPane;
import javax.swing.border.EtchedBorder;

public class Welcomescreen {

	private static final String Image = null;
	private JFrame frame;
	private JTextField jblqty;
	private JTextField jblmoney;
	private JTextField jblmomo;
	private JTextField jblchowmin;
	private JTextField jblburger;
	private JTextField jblsausage;
	private JTextField jblpizza;
	Customer c;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcomescreen window = new Welcomescreen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Welcomescreen() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setVisible(true);
		frame.getContentPane().setForeground(new Color(0, 0, 139));
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 12));
		frame.setBounds(50, 50,881,566);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 857, 75);
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(new LineBorder(new Color(255, 255, 255), 5, true));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel headline = new JLabel("Welcome To Canteen Management System");
		headline.setBounds(110, 11, 637, 51);
		headline.setForeground(Color.DARK_GRAY);
		headline.setHorizontalAlignment(SwingConstants.CENTER);
		headline.setFont(new Font("Times New Roman", Font.BOLD, 25));
		panel.add(headline);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(152, 166, 162, 22);
		textArea.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char ch = e.getKeyChar();
				if(Character.isLetter(ch) ||Character.isWhitespace(ch)|| Character.isISOControl(ch)) {
					textArea.setEditable(true);
				} 
				else
				{
					textArea.setEditable(false);
				}
				
			}
		});
		frame.getContentPane().add(textArea);
		
		JButton search = new JButton("Add Customer");
		search.setBounds(356, 169, 133, 20);
		search.setFont(new Font("Tahoma", Font.BOLD, 12));
		search.setForeground(new Color(0, 0, 0));
		search.setBackground(new Color(255, 0, 0));
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Database dbDatabase = new Database();
				c = new Customer(textArea.getText());
				dbDatabase.addCustomer(c);	
				
			}
		});
		frame.getContentPane().add(search);
		
		JLabel name = new JLabel("Customer Name:");
		name.setBounds(32, 172, 106, 14);
		name.setFont(new Font("Tahoma", Font.BOLD, 12));
		frame.getContentPane().add(name);
		
		
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 213, 813, 14);
		separator.setForeground(Color.ORANGE);
		frame.getContentPane().add(separator);
		
		JLayeredPane Panel = new JLayeredPane();
		Panel.setBounds(10, 222, 505, 169);
		Panel.setBorder(new CompoundBorder(new LineBorder(new Color(227, 227, 227), 5), null));
		frame.getContentPane().add(Panel);
		Panel.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(190, 24, 108, 22);
		comboBox.setForeground(new Color(0, 0, 0));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Drinks", "CocaCola", "Fanta", "Pepsi", "RealJuice", "AppleJuice"}));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		Panel.add(comboBox);
		
		jblqty = new JTextField();
		jblqty.setBounds(335, 25, 87, 22);
		jblqty.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char ch = e.getKeyChar();
				if(Character.isLetter(ch)) {
					jblqty.setEditable(false);
				} 
				else
				{
					jblqty.setEditable(true);
				}
			}
		});
		Panel.add(jblqty);
		jblqty.setColumns(10);
		
		JLabel lblAmount = new JLabel("Money Recieved");
		lblAmount.setBounds(200, 64, 125, 17);
		lblAmount.setFont(new Font("Tahoma", Font.BOLD, 15));
		Panel.add(lblAmount);
		
		jblmoney = new JTextField();
		jblmoney.setBounds(335, 63, 96, 23);
		jblmoney.setColumns(10);
		Panel.add(jblmoney);
		
		JLabel lblReturn = new JLabel("Return");
		lblReturn.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblReturn.setBounds(270, 93, 55, 17);
		Panel.add(lblReturn);
		
		JLabel jblret = new JLabel("");
		jblret.setBounds(335, 92, 96, 22);
		jblret.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0), 3, true), null));
		Panel.add(jblret);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTotal.setBounds(270, 133, 55, 17);
		Panel.add(lblTotal);
		
		JLabel jbltotal = new JLabel("");
		jbltotal.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0), 3, true), null));
		jbltotal.setBounds(335, 132, 96, 22);
		Panel.add(jbltotal);
		
		JLabel lblMomo = new JLabel("Momo");
		
				
		lblMomo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMomo.setBounds(10, 24, 72, 17);
		Panel.add(lblMomo);
		
		jblmomo = new JTextField();
		jblmomo.setColumns(10);
		jblmomo.setBounds(92, 21, 87, 23);
		Panel.add(jblmomo);
		
		JLabel lblChowmin = new JLabel("Chowmin");
		lblChowmin.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblChowmin.setBounds(10, 51, 72, 17);
		Panel.add(lblChowmin);
		
		jblchowmin = new JTextField();
		lblChowmin.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				char ch = e.getKeyChar();
				if(Character.isLetter(ch)) {
					jblchowmin.setEditable(false);
				}
				else {
					jblchowmin.setEditable(true);
				}
			}
		});
		jblchowmin.setColumns(10);
		jblchowmin.setBounds(92, 50, 87, 23);
		Panel.add(jblchowmin);
		
		JLabel lblQuantity = new JLabel("Burger");
		lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblQuantity.setBounds(10, 80, 72, 17);
		Panel.add(lblQuantity);
		
		jblburger = new JTextField();
		jblburger.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				char ch = e.getKeyChar();
				if(Character.isLetter(ch)) {
					jblburger.setEditable(false);
				}
				else {
					jblburger.setEditable(true);
				}
			}
		});
		jblburger.setColumns(10);
		jblburger.setBounds(92, 79, 87, 23);
		Panel.add(jblburger);
		
		
		JLabel lblSausage = new JLabel("Sausage");
		lblSausage.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSausage.setBounds(10, 109, 72, 17);
		Panel.add(lblSausage);
		
		jblsausage = new JTextField();
		jblsausage.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				char ch = e.getKeyChar();
				if(Character.isLetter(ch)) {
					jblsausage.setEditable(false);
				}
				else {
					jblsausage.setEditable(true);
				}
			}
		});
		jblsausage.setColumns(10);
		jblsausage.setBounds(92, 108, 87, 23);
		Panel.add(jblsausage);
		
		
		
		JLabel lblPizza = new JLabel("Pizza");
		lblPizza.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPizza.setBounds(10, 137, 55, 17);
		Panel.add(lblPizza);
		
		jblpizza = new JTextField();
		jblpizza.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				char ch = e.getKeyChar();
				if(Character.isLetter(ch)) {
					jblpizza.setEditable(false);
				}
				else {
					jblpizza.setEditable(true);
				}
			}
		});
		jblpizza.setColumns(10);
		jblpizza.setBounds(92, 137, 87, 23);
		Panel.add(jblpizza);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Qty.");
		lblNewLabel_1.setBounds(432, 23, 42, 22);
		Panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.GRAY);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(20, 402, 495, 43);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Total");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int momoPrice = 100;
				int burgerPrice = 100;
				int sausagePrice = 30;
				int chowmeinPrice = 80;
				int pizzaPrice = 230;
				int CocaColaPrice = 50;
				int Fantaprice=50;
				int Pepsiprice=50;
				int Realprice=35;
				int AppleJuiceprice=35;
			
				int sum = 0;
				int momo = 0,burger = 0,sausage = 0,chowmein =0,CocaCola=0,Fanta=0,Pepsi=0;
				int RealJuice= 0,AppleJuice=0;
				int pizza=0;
				
				if(!jblmomo.getText().equals("")) {				
				momo = Integer.parseInt(jblmomo.getText());	
				sum += momo * momoPrice;
				}
				
				
				
				if(!jblchowmin.getText().equals("")) {				
					chowmein = Integer.parseInt(jblchowmin.getText());
					sum += chowmein*chowmeinPrice;
				}

				if(!jblsausage.getText().equals("")) {				
					sausage = Integer.parseInt(jblsausage.getText());
					sum += sausagePrice*sausage;
				}

				if(!jblpizza.getText().equals("")) {				
					pizza = Integer.parseInt(jblpizza.getText());
					sum += pizza*pizzaPrice;
				}
				
				
					if(comboBox.getSelectedItem()=="CocaCola") {
						int quan = Integer.parseInt(jblqty.getText());
						sum += quan * CocaColaPrice;
					}
					if(comboBox.getSelectedItem()=="Fanta") {
						int quan = Integer.parseInt(jblqty.getText());
						sum += quan * Fantaprice;
					}
					
					if(comboBox.getSelectedItem()=="RealJuice") {
						int quan = Integer.parseInt(jblqty.getText());
						sum += quan * Realprice;
					}
					
					if(comboBox.getSelectedItem()=="AppleJuice") {
						int quan = Integer.parseInt(jblqty.getText());
						sum += quan * AppleJuiceprice;
					}
					
					if(comboBox.getSelectedItem()=="Pepsi") {
						int quan = Integer.parseInt(jblqty.getText());
						sum += quan * Pepsiprice;
					}
				jbltotal.setText(sum+"");
				
		
			 //
				
				String tx = jblmoney.getText();
				
				
				if(tx.equals("")) {
					
					}else {
						jblret.setText((Integer.parseInt(jblmoney.getText())-sum)+"");
					}
				
				
				}
			
			
			

		});
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(32, 11, 89, 23);
		panel_1.add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jblmomo.setText(null);
				jblburger.setText(null);
				jblpizza.setText(null);
				jblchowmin.setText(null);
				jblsausage.setText(null);
			comboBox.setSelectedItem("Select Drinks");
			jblqty.setText(null);
			jblmoney.setText(null);
			jblret.setText(null);
			jbltotal.setText(null);
			
		
				
				
			}
		});
		btnReset.setBackground(Color.GREEN);
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnReset.setBounds(221, 11, 89, 23);
		panel_1.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBackground(Color.GREEN);
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnExit.setBounds(385, 11, 89, 23);
		panel_1.add(btnExit);
		
		JPanel receiptpanel = new JPanel();
		receiptpanel.setToolTipText("");
		receiptpanel.setBounds(525, 222, 340, 304);
		receiptpanel.setBorder(new CompoundBorder(new LineBorder(new Color(227, 227, 227), 5), null));
		
		frame.getContentPane().add(receiptpanel);
		receiptpanel.setLayout(null);
		
		JTextArea textreceipt = new JTextArea();
		textreceipt.setEditable(false);
		textreceipt.setBounds(10, 11, 320, 282);
		receiptpanel.add(textreceipt);
		
				
		JButton btnok = new JButton("OK");
		btnok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = "";
				if(!jblmomo.getText().equals("")) {
					s+="momo, ";
				}
				if(!jblchowmin.getText().equals("")) {
					s+="chowmin, ";
				}
				if(!jblburger.getText().equals("")) {
					s+="burger, ";
				}
				if(!jblsausage.getText().equals("")) {
					s+="sausage, ";
				}
				if(!jblpizza.getText().equals("")) {
					s+="pizza ";
				}
				
				String aString = comboBox.getSelectedItem().toString();
				s+=aString;
				
				Database dbDatabase = new Database();
				Orders1 o = new Orders1();
				int total = Integer.parseInt(jbltotal.getText());
				//System.out.println(c.getId());
				int mon = Integer.parseInt(jblmoney.getText());
				int ret = Integer.parseInt(jblret.getText());
				o = new Orders1 (s,total,mon,ret,c);	
				dbDatabase.addOrder1(o);
				JOptionPane.showMessageDialog(null, "Data Saved");
				
				
				
				
			}
		});
		btnok.setBackground(new Color(153, 255, 204));
		btnok.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnok.setBounds(49, 466, 89, 23);
		frame.getContentPane().add(btnok);
		
		JButton btnNewButton_1 = new JButton("Generate Receipt");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textreceipt.setText("*********************************************************\n");
				textreceipt.setText(textreceipt.getText()+ "            >>>Canteen Management System<<<          \n"); 
				textreceipt.setText(textreceipt.getText() + "*********************************************************\n");
				
				textreceipt.setText(textreceipt.getText()+"Custmoer Name: " + textArea.getText());//+"\t\t ID: "+textId.getText());
				textreceipt.setText(textreceipt.getText()+"\nTotal: " +jbltotal.getText()+"\t\t\t Return: "+jblret.getText());
				textreceipt.setText(textreceipt.getText()+"\nMoney Received: " +jblmoney.getText());
				
			}
			
		});
		
		btnNewButton_1.setBackground(new Color(0, 255, 204));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(230, 468, 206, 23);
		frame.getContentPane().add(btnNewButton_1);
	
//		JButton btnSearchButton = new JButton("Search");
//		btnSearchButton.setFont(new Font("Tahoma",Font.BOLD,12));
//		btnSearchButton.setBackground(Color.RED);
//		btnSearchButton.setBounds(644,169,133,20);
//		frame.getContentPane().add(btnSearchButton);
//		btnSearchButton.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				Database dbDatabase = new Database();
//				Orders1 o = new Orders1();
//				int total = Integer.parseInt(jbltotal.getText());
//				//System.out.println(c.getId());
//				int mon = Integer.parseInt(jblmoney.getText());
//				int ret = Integer.parseInt(jblret.getText());
//				o = new Orders1 (s,total,mon,ret,c);	
//				dbDatabase.addOrder1(o);
//				
//				
//			}
//		});
			
		
		
		
		
		
		
	
	}
}