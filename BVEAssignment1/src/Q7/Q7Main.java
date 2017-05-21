package Q7;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Q7Main {

	public static void main(String args[]){
		Q7Frame pf=new Q7Frame();
		pf.setSize(800,600);
		Q7Panel panel=new Q7Panel();
		pf.setLayout(new BorderLayout());
		pf.add("Center",panel);
		pf.setVisible(true);
		pf.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
	}
}
