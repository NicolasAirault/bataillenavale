package batailleNavale;

public class TestBatailleNavale {

	public static void main(String[] args){
		Fenetre fenetre = new Fenetre();
		Menu menubar = new Menu();
		fenetre.setJMenuBar(menubar);
		
		MainPanel panel = new MainPanel();
		fenetre.getContentPane().add(panel);
		
		fenetre.setVisible(true);
	}
}
