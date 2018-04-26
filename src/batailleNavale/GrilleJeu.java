package batailleNavale;

import java.awt.GridLayout;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GrilleJeu extends JPanel {

	private CaseJeu[] caseJeu;
	private static final int NOMBRE_CASE_JEU = 100;
	
	public GrilleJeu(){
		this.setLayout(new GridLayout(10,10));
		this.caseJeu = new CaseJeu[NOMBRE_CASE_JEU];
		
		for(int i=0 ; i < NOMBRE_CASE_JEU; i++){
			caseJeu[i] = new CaseJeu();
			this.add(caseJeu[i]);
		}
	}
}
