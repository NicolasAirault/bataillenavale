package batailleNavale;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class Menu extends JMenuBar {
	private JMenu jeu;
	private JMenuItem quitter;
	private JMenuItem regles;

	public Menu() {
		this.jeu = new JMenu("Jeu de Bataille Navale");
		this.quitter = new JMenuItem("Quitter la partie");
		this.quitter.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});
		this.regles = new JMenuItem("Règles");
		this.regles.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new JOptionPane();
				JOptionPane.showMessageDialog(null,
						"Vous disposez d'une grille 10x10. \n" + "Vous devez couler les navires de votre adversaire. \n"
								+ "Pour ce faire, vous disposez vous aussi de navires que vous devez placer \n"
								+ "sur votre grille. \n"
								+ "Une fois les deux flottes posées, un joueur après l'autre devra décider d'une case \n"
								+ "de la grille adverse sur laquelle il souhaite tirer.\n"
								+ "Lorsque toute la flotte d'un des deux joueurs a coulé, c'est la fin de la partie.",
						"Regles du jeu", JOptionPane.INFORMATION_MESSAGE);
			}

		});

		this.jeu.add(regles);
		this.jeu.addSeparator();
		this.jeu.add(quitter);
		this.add(jeu);
	}
}
