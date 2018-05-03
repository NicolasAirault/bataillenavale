package batailleNavale;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class PlacementJoueur2 extends JPanel implements ActionListener {

	private GrilleJeu grilleJoueur2;
	private JLabel joueur2;
	private JButton valider;
	private Fenetre fen;
	private PlacementJoueur1 setj1;

	public PlacementJoueur2(String nomJoueur2, Fenetre fen, PlacementJoueur1 setj1) {
		Font font = new Font("SansSerif", Font.BOLD, 36);
		this.fen = fen;
		this.grilleJoueur2 = new GrilleJeu();
		this.setj1 = setj1;
		this.joueur2 = new JLabel(nomJoueur2);
		this.joueur2.setFont(font);
		this.joueur2.setHorizontalAlignment(SwingConstants.CENTER);
		this.valider = new JButton("Valider");
		this.valider.addActionListener(this);

		this.setLayout(new BorderLayout());

		this.add(joueur2, BorderLayout.NORTH);
		this.add(grilleJoueur2, BorderLayout.CENTER);
		this.add(valider, BorderLayout.SOUTH);
	}

	public GrilleJeu getGrilleJoueur2() {
		return grilleJoueur2;
	}

	public void setGrilleJoueur2(GrilleJeu grilleJoueur2) {
		this.grilleJoueur2 = grilleJoueur2;
	}

	public JLabel getJoueur2() {
		return joueur2;
	}

	public void setJoueur2(JLabel joueur2) {
		this.joueur2 = joueur2;
	}

	public PlacementJoueur1 getSetj1() {
		return setj1;
	}

	public void setSetj1(PlacementJoueur1 setj1) {
		this.setj1 = setj1;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int i = 0;
		int j = 0;
		boolean set = false;
		boolean verif = false;
		while(!verif){
			if(this.grilleJoueur2.getCases()[i][j].getBackground() == Color.GREEN){
				set = true;
				verif = true;
			}
			if(i==9 && j==9){
				verif = true;
			}
			if(j==9){
				i++;
				j=0;
			}
			j++;
		}
		if(set){
			this.fen.setVisible(false);
			Fenetre newfen = new Fenetre("Bataille Navale", 1280, 720, JFrame.DISPOSE_ON_CLOSE, false);
			MainPanel main = new MainPanel(this.getSetj1(),this, newfen);
			newfen.getContentPane().add(main);
			newfen.setVisible(true);
		}else{
			new JOptionPane();
			JOptionPane.showMessageDialog(null,
					"Vous devez positionner AU MOINS 1 bateau !","IMPORTANT", JOptionPane.INFORMATION_MESSAGE);
		}
		
	}
}