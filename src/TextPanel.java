import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
//import javax.swing.JTextPane;

public class TextPanel extends JPanel {
	private JTextArea textArea;
	
	public TextPanel() {
		textArea = new JTextArea();
		setLayout(new BorderLayout());
		
		
		add(new JScrollPane(textArea), BorderLayout.SOUTH);
		
		
	}
	
	public void appendText(String text) {
		textArea.append(text);
		
	}
	

}
