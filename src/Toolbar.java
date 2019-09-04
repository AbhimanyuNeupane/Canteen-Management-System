import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;


public class Toolbar extends JPanel implements ActionListener {
	private JButton fileButton;
	private JButton editButton;
	private JButton searchButton;
	
	private TextPanel textPanel;
	
	
	public Toolbar() {
		fileButton = new JButton("New");
		editButton = new JButton("Edit");
		searchButton = new JButton("Search");
		
		
		fileButton.addActionListener(this);
		editButton.addActionListener(this);
		searchButton.addActionListener(this);
		
		 
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(fileButton);
		add(editButton);
		add(searchButton);
	}
	public void setTextPanel(TextPanel textPanel) {
		this.textPanel = textPanel;
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clicked = (JButton)e.getSource();
		
		if(clicked == fileButton) {
			textPanel.appendText("filebutton\n");
		}
		else if(clicked == editButton) {
			textPanel.appendText("editbutton\n");
		}
		
		
		
		
	}
	
 }
