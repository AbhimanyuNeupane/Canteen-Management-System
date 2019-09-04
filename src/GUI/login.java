package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Window;
import java.awt.Cursor;
import javax.swing.SwingConstants;
import Database.Database;
import models.Customer;
import java.beans.PropertyChangeListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.beans.PropertyChangeEvent;

public class login extends JFrame{

	/**
	 * 
	 */
	
	private JFrame frame;
	private JTextField textUsername;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setResizable(false);
		frame.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
			}
		});
		frame.getContentPane().setBackground(new Color(204, 255, 102));
		frame.setBounds(100, 100, 621, 361);
		// frame.setBounds(null,null,null,null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel Canteen = new JLabel("Canteen Management System");
		Canteen.setBounds(117, 0, 388, 48);

		Canteen.setHorizontalAlignment(SwingConstants.CENTER);
		Canteen.setFont(new Font("Arial Black", Font.BOLD, 16));
		Canteen.setForeground(new Color(0, 0, 0));
		frame.getContentPane().add(Canteen);

		JLabel Username = new JLabel("Username");
		Username.setBounds(136, 91, 99, 20);
		Username.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		frame.getContentPane().add(Username);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(136, 142, 99, 20);
		lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		frame.getContentPane().add(lblPassword);

		textUsername = new JTextField();
		textUsername.setBounds(264, 92, 178, 20);
		frame.getContentPane().add(textUsername);
		textUsername.setColumns(10);

		txtPassword = new JPasswordField();
		txtPassword.setBounds(264, 143, 178, 20);
		frame.getContentPane().add(txtPassword);

		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnNewButton.setBounds(416, 212, 89, 23);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBackground(SystemColor.white);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = textUsername.getText();
				String password = txtPassword.getText();
				String user = "root";
				String pass = "";

				Database dbDatabase = new Database();
				if (dbDatabase.loginCheck(username, password)) {
					//JOptionPane.showMessageDialog(null, "Login Successfull");
					new Welcomescreen();
					frame.dispose();
				
				}else {
					JOptionPane.showMessageDialog(null, "Invalid Username and Password", "Try Again",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		frame.getContentPane().add(btnNewButton);

		JButton btnExit = new JButton("Exit");
		btnExit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnExit.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnExit.setBounds(173, 212, 89, 23);
		btnExit.setBackground(SystemColor.white);
		btnExit.addActionListener(new ActionListener() {
			private JFrame LoginSystem;

			public void actionPerformed(ActionEvent e) {
				LoginSystem = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(LoginSystem, "Are Sure to Exit", "Login System",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		frame.getContentPane().add(btnExit);

		JSeparator separator = new JSeparator();
		separator.setBounds(115, 182, 421, 2);
		separator.setBackground(Color.RED);
		frame.getContentPane().add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 62, 605, 2);
		separator_1.setBackground(Color.RED);
		frame.getContentPane().add(separator_1);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 265, 595, 2);
		separator_2.setBackground(Color.RED);
		frame.getContentPane().add(separator_2);

		JLabel ButtomLevel = new JLabel("Copyright \u00A9 2019 Canteen Management System");
		ButtomLevel.setHorizontalAlignment(SwingConstants.CENTER);
		ButtomLevel.setFont(new Font("Arial", Font.ITALIC, 14));
		ButtomLevel.setBounds(30, 278, 565, 33);
		frame.getContentPane().add(ButtomLevel);

	}
}
