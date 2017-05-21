package Q3;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Q3Main {

	public static void main(String args[]){
		Q3Frame pf=new Q3Frame();
		pf.setSize(800,600);
		pf.setLayout(new BorderLayout());
		pf.add("Center",new Q3Panel());
		pf.setVisible(true);
		pf.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
	}
}
