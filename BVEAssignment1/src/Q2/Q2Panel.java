package Q2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.GeneralPath;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Q2Panel extends JPanel implements ActionListener,MouseListener{

	int x,y;
	Color color;
	Timer timer;
	public Q2Panel(){
		timer=new Timer(500, this);
		timer.start();
		addMouseListener(this);
	}
	

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		// TODO Auto-generated method stub
		Graphics2D g2d = (Graphics2D) g;
		GeneralPath gp=new GeneralPath();
		
		x=(int)(Math.random()*500);
		y=(int)(Math.random()*500);
				
		gp.moveTo(x,y);
		gp.lineTo(x+50, y-80);
		gp.lineTo(x+100, y);
		gp.closePath();
		
		Color color=new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
		g2d.setPaint(color);
		g2d.fill(gp);
				
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
