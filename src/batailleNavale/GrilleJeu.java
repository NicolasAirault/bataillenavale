package batailleNavale;

import java.awt.GridLayout;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GrilleJeu extends JPanel {

	public static final int NOMBRE_CASE_JEU = 10;
	private CaseJeu[][] cases;
	
	public GrilleJeu(){
		this.setLayout(new GridLayout(10,10));
		this.cases = new CaseJeu[NOMBRE_CASE_JEU][NOMBRE_CASE_JEU];
		for(int i = 0; i < NOMBRE_CASE_JEU; i++){
			for(int j = 0 ; j < NOMBRE_CASE_JEU; j++){
				this.cases[i][j] = new CaseJeu();
				this.add(this.cases[i][j]);
			}
		}
	}
	
	public CaseJeu[][] getCases(){
		return this.cases;
	}
}
