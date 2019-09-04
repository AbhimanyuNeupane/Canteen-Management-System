import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.*; 
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.text.JTextComponent;


public class FormPanel extends JPanel{
	private JLabel idLabel;
	private JLabel foodLabel;
	private JTextField idField;
	private JTextField foodField;
	private JButton okBtnButton;
	
	
	public FormPanel() {
		Dimension dim = getPreferredSize();
		dim.width = 500;
		setPreferredSize(dim);
		
		idLabel = new JLabel("ID : ");
		foodLabel = new JLabel("Food : ");
		idField = new JTextField(8);
		foodField = new JTextField(15);
		okBtnButton = new JButton("OK");
		
		
		
		Border innerBorder = BorderFactory.createTitledBorder("Registeration");
		Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
		
		setLayout(new GridBagLayout());
	
		
		
		setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		
	
		//First Row//
		//gc.weightx = 1;
		gc.weighty = 0;
		
		gc.gridx = 0;
		gc.gridy = 0;
		
		//gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(0, 0, 0, 5);
		add(idLabel, gc);
		
		gc.gridx = 1;
		gc.gridy = 0;
		gc.insets = new Insets(0, 0, 0, 0);
		gc.anchor = GridBagConstraints.LINE_START;
		add(idField, gc);
		
		//second row//
		
		//gc.weightx = 1;
		//gc.weighty = 0;
		
		gc.gridx = 0;
		gc.gridy = 1;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(0, 0, 0, 5);
		add(foodLabel, gc);
		
		gc.gridx = 1;
		gc.gridy = 1;
		gc.insets = new Insets(0, 0, 0, 0);
		gc.anchor = GridBagConstraints.LINE_START;
		add(foodField, gc);
		
		//Third Row//
		
		gc.weightx = 1;
		gc.weighty = 2.0;
		
		gc.gridx = 1;
		gc.gridy = 2;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		add(okBtnButton, gc);
		
			
	}

 }
