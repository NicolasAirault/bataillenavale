package batailleNavale;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Fenetre extends JFrame {
	
	public Fenetre(){
		this.setTitle("Bataille Navale");
		this.setSize(1800,900);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
	}
}
