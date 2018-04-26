package batailleNavale;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class MainPanel extends JPanel {

	private PanelGauche panelgauche;
	private PanelDroit paneldroit;
	private JTextArea zoneInfo;
	private JScrollPane scrollBar;
	
	public MainPanel(){
		this.panelgauche = new PanelGauche();
		this.paneldroit = new PanelDroit();
		this.zoneInfo = new JTextArea();
		
		this.scrollBar = new JScrollPane(zoneInfo);
		
		this.scrollBar.setPreferredSize(new Dimension(1600,100));
		
		this.setLayout(new BorderLayout());
		
		this.add(panelgauche, BorderLayout.WEST);
		this.add(new JLabel(),BorderLayout.CENTER);
		this.add(paneldroit, BorderLayout.EAST);
		this.add(scrollBar, BorderLayout.SOUTH);
	}
}