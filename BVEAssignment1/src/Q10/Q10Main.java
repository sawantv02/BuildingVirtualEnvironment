package Q10;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Q10Main {

	public static void main(String args[]){
		Q10Frame pf=new Q10Frame();
		pf.setSize(1000,1000);
		Q10MazePanel panel=new Q10MazePanel();
		pf.setLayout(new BorderLayout());
		pf.add("Center",panel);
		pf.setVisible(true);
		pf.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
	}
}
