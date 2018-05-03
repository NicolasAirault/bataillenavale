package batailleNavale;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class CaseJeu extends JButton implements ActionListener, MouseListener{

	private byte val;
	private String hit;
	
	public CaseJeu(){
		this.setBackground(Color.WHITE);
		this.addMouseListener(this);
		this.val = 0;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(this.val == 1){
			this.setBackground(Color.RED);
			this.val= 2;
			this.hit = "Touche !";
		}else if(this.val == 0){
			this.setBackground(Color.WHITE);
			this.hit = "Plouf !";
		}
		this.setEnabled(false);
	}
	
	public int getEtatCase(){
		return this.val;
	}
	
	public String getHit(){
		return this.hit;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(this.val == 0){
			this.setBackground(Color.GREEN);
			this.val = 1;
		}else {
			this.setBackground(Color.WHITE);
			this.val = 0;
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
