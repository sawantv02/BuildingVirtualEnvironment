package Q1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Q1Panel extends JPanel implements ActionListener,MouseListener{

	int x1,y1,x2,y2;
	Color color;
	Timer timer;
	public Q1Panel(){
		timer=new Timer(500, this);
		timer.start();
		addMouseListener(this);
	}
	

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		// TODO Auto-generated method stub
		x1=(int)(Math.random()*800);
		y1=(int)(Math.random()*600);
		x2=(int)(Math.random()*800);
		y2=(int)(Math.random()*600);
		color=new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
		g.setColor(color);
		g.drawLine(x1, y1, x2, y2);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		timer.stop();
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
