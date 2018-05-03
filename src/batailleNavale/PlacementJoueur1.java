package batailleNavale;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class PlacementJoueur1 extends JPanel implements ActionListener {

	private GrilleJeu grilleJoueur1;
	private JLabel joueur1;
	private JButton valider;
	private Fenetre fen;
	private Fenetre fenj2;

	public PlacementJoueur1(String nomJoueur1, Fenetre fen, Fenetre fenj2) {
		Font font = new Font("SansSerif", Font.BOLD, 36);
		this.fen = fen;
		this.fenj2 = fenj2;
		this.grilleJoueur1 = new GrilleJeu();
		this.joueur1 = new JLabel(nomJoueur1);
		this.joueur1.setFont(font);
		this.joueur1.setHorizontalAlignment(SwingConstants.CENTER);
		this.valider = new JButton("Valider");
		this.valider.addActionListener(this);

		this.setLayout(new BorderLayout());

		this.add(joueur1, BorderLayout.NORTH);
		this.add(grilleJoueur1, BorderLayout.CENTER);
		this.add(valider, BorderLayout.SOUTH);
	}

	public GrilleJeu getGrilleJoueur1() {
		return grilleJoueur1;
	}

	public void setGrilleJoueur1(GrilleJeu grilleJoueur1) {
		this.grilleJoueur1 = grilleJoueur1;
	}

	public JLabel getJoueur1() {
		return joueur1;
	}

	public void setJoueur1(JLabel joueur1) {
		this.joueur1 = joueur1;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int i = 0;
		int j = 0;
		boolean set = false;
		boolean verif = false;
		while(!verif){
			if(this.grilleJoueur1.getCases()[i][j].getBackground() == Color.GREEN){
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
			this.fenj2.setVisible(true);
		}else{
			new JOptionPane();
			JOptionPane.showMessageDialog(null,
					"Vous devez positionner AU MOINS 1 bateau !","IMPORTANT", JOptionPane.INFORMATION_MESSAGE);
		}
		
	}
}
