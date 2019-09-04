import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
//import javax.swing.JMenu;
//import javax.swing.JTextArea;
//import javax.swing.JMenuBar;
//import javax.swing.JMenuItem;


public class MainFrame extends JFrame {
	
	private JTextArea textArea;
	private TextPanel textPanel;
	private Toolbar toolbar;
	private FormPanel formPanel;
	
	public MainFrame() {
		super("Canteen Management System"); 
		
		setLayout(new BorderLayout());
		
		toolbar = new Toolbar();
		textPanel = new TextPanel();
		formPanel = new FormPanel();
 
		toolbar.setTextPanel(textPanel);
	
	
		add(formPanel, BorderLayout.WEST);
		add(toolbar, BorderLayout.NORTH);
		add(textPanel, BorderLayout.CENTER);	
		
		setSize(900, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	/*private JMenuBar createMenuBar() {
		
		JMenuBar menuBar = new JMenuBar();
		
		JMenu fileJMenu = new JMenu("File");
		
		JMenu editJMenu = new JMenu("Edit");
		
		JMenu searJMenu = new JMenu("Search");
		
		JMenu iteamMenu = new JMenu("Iteam");
		
		
		menuBar.add(fileJMenu);
		menuBar.add(editJMenu);
		menuBar.add(searJMenu);
		menuBar.add(iteamMenu);
		
		
		
		return menuBar;
	}*/

}
