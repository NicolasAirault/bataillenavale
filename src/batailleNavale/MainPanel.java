package batailleNavale;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class MainPanel extends JPanel implements ActionListener {

	private PlacementJoueur1 setJ1;
	private PlacementJoueur2 setJ2;
	private JLabel joueurActuel;
	private JLabel titre;
	private JButton valider;
	private GrilleJeu grilleJoueurActuel;
	private JTextArea historiqueCoups;
	private JScrollPane scrollText;
	private JPanel panelEntete;
	private JPanel panelGrille;
	private Fenetre fen;
	private boolean brouillardSet = false;

	public MainPanel(PlacementJoueur1 setj1, PlacementJoueur2 setj2, Fenetre fen) {
		Font font = new Font("SansSerif", Font.BOLD, 28);
		Font font2 = new Font("SansSerif", Font.BOLD, 40);
		this.fen = fen;
		this.setLayout(new BorderLayout());
		this.setJ1 = setj1;
		this.setJ2 = setj2;
		this.historiqueCoups = new JTextArea();
		this.scrollText = new JScrollPane(historiqueCoups);
		this.scrollText.setPreferredSize(new Dimension(200,720));

		this.joueurActuel = this.setJ1.getJoueur1();
		this.joueurActuel.setFont(font);
		this.joueurActuel.setHorizontalAlignment(SwingConstants.CENTER);
		this.titre = new JLabel("Bataille Navale");
		this.titre.setFont(font2);
		this.titre.setHorizontalAlignment(SwingConstants.CENTER);
		this.grilleJoueurActuel = this.setJ2.getGrilleJoueur2();

		setBrouillardDeGuerre(grilleJoueurActuel);

		this.valider = new JButton("Fin du tour");
		this.valider.addActionListener(this);

		this.panelEntete = new JPanel();
		panelEntete.setLayout(new GridLayout(2, 1));
		this.panelGrille = new JPanel();

		panelGrille.setLayout(new GridLayout(1, 1));
	
		panelGrille.add(grilleJoueurActuel);
	

		panelGrille.setPreferredSize(new Dimension(300, 150));
		panelGrille.setSize(300, 150);

		panelEntete.add(titre);
		panelEntete.add(joueurActuel);
		
		JPanel panelValide = new JPanel();
		panelValide.setLayout(new FlowLayout());
		panelValide.add(valider);

		this.add(panelEntete, BorderLayout.NORTH);
		this.add(panelGrille, BorderLayout.CENTER);
		this.add(panelValide, BorderLayout.SOUTH);
		this.add(scrollText, BorderLayout.EAST);
	}

	public PlacementJoueur1 getSetJ1() {
		return setJ1;
	}

	public void setSetJ1(PlacementJoueur1 setJ1) {
		this.setJ1 = setJ1;
	}

	public PlacementJoueur2 getSetJ2() {
		return setJ2;
	}

	public void setSetJ2(PlacementJoueur2 setJ2) {
		this.setJ2 = setJ2;
	}

	public JLabel getJoueurActuel() {
		return joueurActuel;
	}

	public void setJoueurActuel(JLabel joueurActuel) {
		this.joueurActuel = joueurActuel;
	}

	public JButton getValider() {
		return valider;
	}

	public void setValider(JButton valider) {
		this.valider = valider;
	}

	public GrilleJeu getGrilleJoueurActuel() {
		return grilleJoueurActuel;
	}

	public void setGrilleJoueurActuel(GrilleJeu grilleJoueurActuel) {
		this.grilleJoueurActuel = grilleJoueurActuel;
	}

	public JTextArea getHistoriqueCoups() {
		return historiqueCoups;
	}

	public void setHistoriqueCoups(JTextArea historiqueCoups) {
		this.historiqueCoups = historiqueCoups;
	}

	public JScrollPane getScrollText() {
		return scrollText;
	}

	public void setScrollText(JScrollPane scrollText) {
		this.scrollText = scrollText;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		boolean suivant = true;
		int i = 0;
		int j = 0;
		int compteurCasesMortes = 0;
		while (suivant) {
			if (this.getGrilleJoueurActuel().getCases()[i][j].getEtatCase() == 0
					|| this.getGrilleJoueurActuel().getCases()[i][j].getEtatCase() == 2) {
				compteurCasesMortes++;
				System.out.println(i + " " + j + " : " + compteurCasesMortes);
			}
			if (i == 9 && j == 9) {
				suivant = false;
			}
			if (j == 9) {
				i++;
				j = 0;
			}else{
				j++;
			}
			
			if (compteurCasesMortes == 100) {
				Object[] erreurMess = { "Parfait !", "Arreter" };
				new JOptionPane();
				int res = JOptionPane.showOptionDialog(this.grilleJoueurActuel,
						"Fin de partie, le joueur " + this.getJoueurActuel().getText() + " a gagne !", "Erreur",
						JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE, null, erreurMess, e);
				if (res == JOptionPane.NO_OPTION) {
					System.exit(0);
				} else {
					System.exit(0);
				}
			}
		}
		if (this.joueurActuel == this.setJ1.getJoueur1()) {
			this.setJoueurActuel(this.getSetJ2().getJoueur2());
			this.setGrilleJoueurActuel(this.getSetJ1().getGrilleJoueur1());
			if (!brouillardSet) {
				setBrouillardDeGuerre(this.getGrilleJoueurActuel());
				brouillardSet = true;
			}
		} else {
			this.setJoueurActuel(this.getSetJ1().getJoueur1());
			this.setGrilleJoueurActuel(this.getSetJ2().getGrilleJoueur2());
		}

	}

	public void setBrouillardDeGuerre(GrilleJeu grilleJoueurActuel) {
		for (int i = 0; i < GrilleJeu.NOMBRE_CASE_JEU; i++) {
			for (int j = 0; j < GrilleJeu.NOMBRE_CASE_JEU; j++) {
				grilleJoueurActuel.getCases()[i][j].setBackground(Color.GRAY);
				grilleJoueurActuel.getCases()[i][j].removeMouseListener(grilleJoueurActuel.getCases()[i][j]);
				grilleJoueurActuel.getCases()[i][j].addActionListener(grilleJoueurActuel.getCases()[i][j]);
			}
		}
	}
}
