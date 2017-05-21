package Q8;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.GeneralPath;

import javax.swing.JColorChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Q8Panel extends JPanel{

	public Q8Panel() {
	}

	@Override
	public void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		int xPoints[]={140,100,100,110,110,100,100,160,160,200,240};
		int yPoints[]={100,100,150,150,250,250,300,300,220,300,300};
		g.setColor(Color.RED);
		g.fillPolygon(xPoints, yPoints, 11);
		
		int x1points[]={140,160,220,220,280,280,270,270,280,280,240};
		int y1points[]={100,100,220,100,100,150,150,250,250,300,300};
		g.setColor(Color.BLACK);
		g.fillPolygon(x1points, y1points, 11);
		
		g.setColor(Color.WHITE);
		g.setFont(new Font("ariel",Font.BOLD, 29));
		g.drawString("Northeastern",100,340);
		

	}

	
}
