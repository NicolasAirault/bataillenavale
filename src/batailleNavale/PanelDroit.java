package batailleNavale;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class PanelDroit extends JPanel{
	
	private GrilleJeu grille;
	private JLabel joueur2;
	private JButton finTour;
	
	public PanelDroit(){
		
		this.joueur2 = new JLabel("Joueur 2");
		this.finTour = new JButton("Fin du tour");
		this.grille = new GrilleJeu();
		
		this.joueur2.setHorizontalAlignment(SwingConstants.CENTER);
		
		GridLayout grid = new GridLayout(3,1);
		
		JPanel panelFinTour = new JPanel();
		panelFinTour.setLayout(grid);
		panelFinTour.add(new JLabel());
		panelFinTour.add(finTour);
		panelFinTour.add(new JLabel());
		
		JPanel titreJoueur2 = new JPanel();
		titreJoueur2.setLayout(grid);
		titreJoueur2.add(new JLabel());
		titreJoueur2.add(joueur2);
		titreJoueur2.add(new JLabel());
		
		this.setLayout(new BorderLayout());
		this.add(grille, BorderLayout.CENTER);
		this.add(titreJoueur2, BorderLayout.NORTH);
		this.add(panelFinTour, BorderLayout.SOUTH);
	}

}
