package batailleNavale;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class MainPanel extends JPanel {

	private PanelGauche panelgauche;
	private PanelCentre panelcentre;
	private PanelDroit paneldroit;
	private JTextArea zoneInfo;
	private JScrollPane scrollBar;
	private JLabel titreJeu;

	public MainPanel() {
		Font font = new Font("SansSerif", Font.BOLD, 36);
		this.panelcentre = new PanelCentre();
		this.panelgauche = new PanelGauche(this, panelcentre);
		this.paneldroit = new PanelDroit(this, panelcentre);
		this.zoneInfo = new JTextArea();
		this.titreJeu = new JLabel("Bataille Navale");
		this.titreJeu.setFont(font);
		
		this.titreJeu.setHorizontalAlignment(SwingConstants.CENTER);
		
		GridLayout grid = new GridLayout(3,1);
		JPanel paneTitre = new JPanel();
		paneTitre.setLayout(grid);
		paneTitre.add(new JLabel());
		paneTitre.add(titreJeu);
		paneTitre.add(new JLabel());
		
		this.scrollBar = new JScrollPane(zoneInfo);

		this.scrollBar.setPreferredSize(new Dimension(1600, 100));

		this.setLayout(new BorderLayout());

		this.add(panelgauche, BorderLayout.WEST);
		this.add(panelcentre, BorderLayout.CENTER);
		this.add(paneldroit, BorderLayout.EAST);
		this.add(scrollBar, BorderLayout.SOUTH);
		this.add(paneTitre, BorderLayout.NORTH);
	}

	public PanelGauche getPanelgauche() {
		return panelgauche;
	}

	public void setPanelgauche(PanelGauche panelgauche) {
		this.panelgauche = panelgauche;
	}

	public PanelDroit getPaneldroit() {
		return paneldroit;
	}

	public void setPaneldroit(PanelDroit paneldroit) {
		this.paneldroit = paneldroit;
	}

	public JTextArea getZoneInfo() {
		return zoneInfo;
	}

	public void setZoneInfo(JTextArea zoneInfo) {
		this.zoneInfo = zoneInfo;
	}

	public JScrollPane getScrollBar() {
		return scrollBar;
	}

	public void setScrollBar(JScrollPane scrollBar) {
		this.scrollBar = scrollBar;
	}

}