package batailleNavale;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class PanelSetUp extends JPanel implements ActionListener {

	private JLabel titre;
	private JLabel joueur1;
	private JLabel joueur2;
	private JTextField saisieJoueur1;
	private JTextField saisieJoueur2;
	private JButton valider;

	private Fenetre fen;

	public PanelSetUp(Fenetre fen) {
		this.fen = fen;
		this.titre = new JLabel("Veuillez saisir le nom pour chaque joueurs :");
		this.joueur1 = new JLabel("Joueur 1 :");
		this.joueur2 = new JLabel("Joueur 2 :");
		this.saisieJoueur1 = new JTextField();
		this.saisieJoueur2 = new JTextField();
		this.valider = new JButton("Valider");

		this.titre.setHorizontalAlignment(SwingConstants.CENTER);
		this.valider.addActionListener(this);

		GridLayout grid = new GridLayout(2, 2);
		JPanel pane = new JPanel();
		pane.setLayout(grid);

		pane.add(joueur1);
		pane.add(saisieJoueur1);
		pane.add(joueur2);
		pane.add(saisieJoueur2);

		this.setLayout(new BorderLayout());
		this.add(pane, BorderLayout.CENTER);
		this.add(titre, BorderLayout.NORTH);
		this.add(valider, BorderLayout.SOUTH);
	}

	public JTextField getSaisieJoueur1() {
		return saisieJoueur1;
	}

	public void setSaisieJoueur1(JTextField saisieJoueur1) {
		this.saisieJoueur1 = saisieJoueur1;
	}

	public JTextField getSaisieJoueur2() {
		return saisieJoueur2;
	}

	public void setSaisieJoueur2(JTextField saisieJoueur2) {
		this.saisieJoueur2 = saisieJoueur2;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if("".equals(this.getSaisieJoueur1().getText()) || "".equals(this.getSaisieJoueur2().getText())){
			new JOptionPane();
			JOptionPane.showMessageDialog(null,
					"Vous devez obligatoirement saisir un nom pour le joueur 1 et pour le joueur 2 !","IMPORTANT", JOptionPane.INFORMATION_MESSAGE);
		}else{
			this.fen.setVisible(false);
			
			Fenetre fenJ2 = new Fenetre("Bataille Navale", 800,800,JFrame.DISPOSE_ON_CLOSE,false);
			Fenetre fenJ1 = new Fenetre("Bataille Navale", 800, 800, JFrame.DISPOSE_ON_CLOSE, false);
			
			PlacementJoueur1 setJoueur1 = new PlacementJoueur1(this.getSaisieJoueur1().getText(), fenJ1, fenJ2);
			PlacementJoueur2 setJoueur2 = new PlacementJoueur2(this.getSaisieJoueur2().getText(),fenJ2, setJoueur1);
			
			fenJ2.getContentPane().add(setJoueur2);
			fenJ1.getContentPane().add(setJoueur1);
			fenJ1.setVisible(true);
		}
		
		

	}
}
