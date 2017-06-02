package Q5;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Q5Main {

	public static void main(String args[]){
		Q5Frame pf=new Q5Frame();
		pf.setSize(800,600);
		pf.setLayout(new BorderLayout());
		pf.add("Center",new Q5Panel());
		pf.setVisible(true);
		pf.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
	}
}
