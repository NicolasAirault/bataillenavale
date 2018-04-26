package batailleNavale;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class PanelGauche extends JPanel{

	private GrilleJeu grille;
	private JLabel joueur1;
	private JButton finTour;
	
	public PanelGauche(){
		this.joueur1 = new JLabel("Joueur 1 ");
		this.finTour = new JButton("Fin du tour");
		this.grille = new GrilleJeu();
		
		this.joueur1.setHorizontalAlignment(SwingConstants.CENTER);
		
		GridLayout grid = new GridLayout(3,1);
		
		JPanel panelFinTour = new JPanel();
		panelFinTour.setLayout(grid);
		panelFinTour.add(new JLabel());
		panelFinTour.add(finTour);
		panelFinTour.add(new JLabel());
		
		JPanel titreJoueur1 = new JPanel();
		titreJoueur1.setLayout(grid);
		titreJoueur1.add(new JLabel());
		titreJoueur1.add(joueur1);
		titreJoueur1.add(new JLabel());
		
		this.setLayout(new BorderLayout());
		this.add(grille, BorderLayout.CENTER);
		this.add(titreJoueur1,BorderLayout.NORTH);
		this.add(panelFinTour,BorderLayout.SOUTH);
	}
}
