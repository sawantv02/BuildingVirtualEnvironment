package Q3;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Q3Main {

	public static void main(String args[]){
		Q3Frame pf=new Q3Frame();
		pf.setSize(1000,1000);
		Q3MazePanel panel=new Q3MazePanel();
		pf.setLayout(new BorderLayout());
		pf.add("Center",panel);
		pf.setVisible(true);
		pf.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
	}
}
