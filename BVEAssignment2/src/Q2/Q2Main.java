package Q2;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Q2Main {

	public static void main(String args[]){
		Q2Frame pf=new Q2Frame();
		pf.setSize(800,800);
		Q2Panel panel=new Q2Panel();
		pf.setLayout(new BorderLayout());
		pf.add("Center",panel);
		pf.setVisible(true);
		pf.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
	}
}
