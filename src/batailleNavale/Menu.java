package batailleNavale;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class Menu extends JMenuBar {
	private JMenu jeu;
	private JMenu aide;
	
	private JMenuItem start;
	private JMenuItem quitter;
	private JMenuItem regles;
	
	public Menu(){
		
		this.jeu = new JMenu("Jeu");
		this.aide = new JMenu("?");
		this.start = new JMenuItem("Commencer une partie");
		this.quitter = new JMenuItem("Quitter la partie");
		this.regles = new JMenuItem("Règles");
		
		
		
		this.jeu.add(start);
		this.jeu.addSeparator();
		this.jeu.add(quitter);
		this.aide.add(regles);
		
		this.add(jeu);
		this.add(aide);
		
	}
}
