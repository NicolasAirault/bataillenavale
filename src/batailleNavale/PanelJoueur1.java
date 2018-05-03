package batailleNavale;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class PanelGauche extends JPanel implements ActionListener {

	private GrilleJeu grille;
	private JLabel joueur1;
	private JButton finTour;
	private MainPanel mainpanel;
	private PanelCentre panelcentre;

	public PanelGauche(MainPanel mainpanel, PanelCentre panelcentre) {
		Font font = new Font("SansSerif", Font.BOLD, 18);
		this.joueur1 = new JLabel("Joueur 1 ");
		this.joueur1.setFont(font);
		this.finTour = new JButton("Fin du tour");
		this.mainpanel = mainpanel;
		this.panelcentre = panelcentre;

		this.finTour.addActionListener(this);
		this.grille = new GrilleJeu();

		this.joueur1.setHorizontalAlignment(SwingConstants.CENTER);

		GridLayout grid = new GridLayout(3, 1);

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
		this.setPreferredSize(new Dimension(600,900));
		this.add(grille, BorderLayout.CENTER);
		this.add(titreJoueur1, BorderLayout.NORTH);
		this.add(panelFinTour, BorderLayout.SOUTH);
	}

	public GrilleJeu getGrille() {
		return grille;
	}

	public void setGrille(GrilleJeu grille) {
		this.grille = grille;
	}

	public JLabel getJoueur1() {
		return joueur1;
	}

	public void setJoueur1(JLabel joueur1) {
		this.joueur1 = joueur1;
	}

	public JButton getFinTour() {
		return finTour;
	}

	public void setFinTour(JButton finTour) {
		this.finTour = finTour;
	}

	public MainPanel getMainpanel() {
		return mainpanel;
	}

	public void setMainpanel(MainPanel mainpanel) {
		this.mainpanel = mainpanel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		grille.setVisible(false);
		this.mainpanel.getPaneldroit().getGrille().setVisible(true);
		this.panelcentre.getTourJoueur2().setVisible(true);
		this.panelcentre.getTourJoueur1().setVisible(false);
	}
}
