package batailleNavale;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class CaseJeu extends JButton implements ActionListener {

	public CaseJeu(){
		this.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==this){
			this.setEnabled(false);
		}
		
	}

}
