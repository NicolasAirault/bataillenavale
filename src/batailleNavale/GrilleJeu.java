package batailleNavale;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GrilleJeu extends JPanel implements ActionListener{
	
	private JButton caseJeu;

	public GrilleJeu(){
		this.setLayout(new GridLayout(10,10));
		this.caseJeu = new JButton();
		this.caseJeu.addActionListener(this);
		
		for(int i=0 ; i < 10; i++){
			for(int j = 0; j < 10; j++){
				this.add(new JButton());
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
}
