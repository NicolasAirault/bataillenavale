package batailleNavale;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Fenetre extends JFrame {
	
	
	public Fenetre(){
		this.setTitle("Bataille Navale");
		this.setSize(600,250);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setJMenuBar(new Menu());
	}
	
	public Fenetre(String title, int width, int height, int closeOperation, boolean resize){
		this.setTitle(title);
		this.setSize(width, height);
		this.setDefaultCloseOperation(closeOperation);
		this.setResizable(resize);
		this.setJMenuBar(new Menu());
	}
}
