package Q5;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Q5Main {

	public static void main(String args[]){
		Q5Frame pf=new Q5Frame();
		pf.setSize(900,800);
		pf.setLayout(new BorderLayout());
		Q5Panel panel1=new Q5Panel();
//		panel1.setPreferredSize(new Dimension(800, 600));
//		Q5TextPanel panel2=new Q5TextPanel();
//		panel2.setPreferredSize(new Dimension(800, 200));
//		pf.add(BorderLayout.NORTH,panel2);
		pf.add(BorderLayout.CENTER,panel1);

		pf.setVisible(true);
		pf.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
	}
}
