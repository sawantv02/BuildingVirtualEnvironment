package Q1;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Q1Main {

	public static void main(String args[]){
		Q1Frame pf=new Q1Frame();
		pf.setSize(800,800);
		pf.setLayout(new BorderLayout());
		pf.add("Center",new Q1Panel());
		pf.setVisible(true);
		pf.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
	}
}
