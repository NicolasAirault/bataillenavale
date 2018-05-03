package batailleNavale;

public class TestBatailleNavale {

	public static void main(String[] args){
		Fenetre fenetre = new Fenetre();
		
		PanelSetUp pane = new PanelSetUp(fenetre);
		fenetre.getContentPane().add(pane);
		
		fenetre.setVisible(true);
	}
}
