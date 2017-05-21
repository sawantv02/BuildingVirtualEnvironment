package Q9;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Q9Main {

	public static void main(String args[]){
		Q9Frame pf=new Q9Frame();
		pf.setSize(800,800);
		pf.setLayout(new BorderLayout());
		pf.add("Center",new Q9Panel());
		pf.setVisible(true);
		pf.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
	}
}
