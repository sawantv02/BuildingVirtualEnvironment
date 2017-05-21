package Q4;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Q4Main {

	public static void main(String args[]){
		Q4Frame pf=new Q4Frame();
		pf.setSize(800,600);
		pf.setLayout(new BorderLayout());
		pf.add("Center",new Q4Panel());
		pf.setVisible(true);
		pf.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
	}
}
