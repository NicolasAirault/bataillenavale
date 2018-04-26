package batailleNavale;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class PanelCentre extends JPanel {

	private JLabel tourJoueur1;
	private JLabel tourJoueur2;

	public PanelCentre() {
		Font font = new Font("SansSerif", Font.BOLD, 24);
		JLabel labelTitre = new JLabel("Au tour de : ");

		labelTitre.setFont(font);
		labelTitre.setHorizontalAlignment(SwingConstants.CENTER);
		this.tourJoueur1 = new JLabel("<-----");
		this.tourJoueur1.setHorizontalAlignment(SwingConstants.CENTER);
		this.tourJoueur1.setFont(font);
		this.tourJoueur2 = new JLabel("----->");
		this.tourJoueur2.setHorizontalAlignment(SwingConstants.CENTER);
		this.tourJoueur2.setFont(font);

		this.setLayout(new GridLayout(4, 1));
		this.setPreferredSize(new Dimension(600,900));

		this.add(labelTitre);
		this.add(tourJoueur1);
		this.add(tourJoueur2);

	}

	public JLabel getTourJoueur1() {
		return tourJoueur1;
	}

	public void setTourJoueur1(JLabel tourJoueur1) {
		this.tourJoueur1 = tourJoueur1;
	}

	public JLabel getTourJoueur2() {
		return tourJoueur2;
	}

	public void setTourJoueur2(JLabel tourJoueur2) {
		this.tourJoueur2 = tourJoueur2;
	}

}
