package Q8;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Q8Main {

	public static void main(String args[]){
		Q8Frame pf=new Q8Frame();
		pf.setSize(800,600);
		Q8Panel panel=new Q8Panel();
		pf.setLayout(new BorderLayout());
		pf.add("Center",panel);
		pf.setVisible(true);
		pf.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
	}
}
