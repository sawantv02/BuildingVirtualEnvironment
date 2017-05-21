package Q6;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Q6Main {

	public static void main(String args[]){
		Q6Frame pf=new Q6Frame();
		pf.setSize(800,600);
		Q6Panel panel=new Q6Panel();
		pf.setJMenuBar(panel.createMenuBar());
		pf.setLayout(new BorderLayout());
		pf.add("Center",panel);
		pf.setVisible(true);
		pf.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
	}
}
