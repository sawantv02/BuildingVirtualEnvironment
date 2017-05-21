package Q2;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Q2Main {

	public static void main(String args[]){
		Q2Frame pf=new Q2Frame();
		pf.setSize(800,600);
		pf.setLayout(new BorderLayout());
		pf.add("Center",new Q2Panel());
		pf.setVisible(true);
		pf.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
	}
}
