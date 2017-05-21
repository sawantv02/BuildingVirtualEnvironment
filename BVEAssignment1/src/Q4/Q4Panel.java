package Q4;

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

public class Q4Panel extends JPanel{

	public Q4Panel(){

	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		// TODO Auto-generated method stub
		GeneralPath gp=new GeneralPath();
		Graphics2D g2d = (Graphics2D) g;
		int x,y,l;
		x=100;
		y=100;
		l=100;
		gp.moveTo(x,y);
		gp.lineTo(x+l,y);
		gp.lineTo(x+l,y+l);
		gp.lineTo(x,y+l);
		gp.closePath();
		gp.moveTo(x,y);
		gp.lineTo(x+(l/Math.sqrt(2)),y+(l/Math.sqrt(2)));
		gp.lineTo(x+l+(l/Math.sqrt(2)),y+(l/Math.sqrt(2)));
		gp.lineTo(x+l,y);
		gp.closePath();
		gp.moveTo(x+(l/Math.sqrt(2)),y+(l/Math.sqrt(2)));
		gp.lineTo(x+(l/Math.sqrt(2)),y+l+(l/Math.sqrt(2)));
		gp.lineTo(x,y+l);
		gp.moveTo(x+(l/Math.sqrt(2)),y+l+(l/Math.sqrt(2)));
		gp.lineTo(x+l+(l/Math.sqrt(2)),y+l+(l/Math.sqrt(2)));
		gp.lineTo(x+l+(l/Math.sqrt(2)),y+(l/Math.sqrt(2)));
		gp.moveTo(x+l,y+l);
		gp.lineTo(x+l+(l/Math.sqrt(2)),y+l+(l/Math.sqrt(2)));
		
		
		g2d.setPaint(Color.RED);
		g2d.draw(gp);
	}

	
	

}
