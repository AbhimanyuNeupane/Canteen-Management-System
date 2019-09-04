import javax.swing.SwingUtilities;
public class App {
	public static void main(String[] arg) {
		
		SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					 new MainFrame();
					
			}
		});
		
	}

}
