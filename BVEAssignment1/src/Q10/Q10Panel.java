package Q10;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
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

public class Q10Panel extends JPanel{

	public Q10Panel() {
	}

	@Override
	public void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		GeneralPath gp=new GeneralPath();
		Graphics2D g2d = (Graphics2D) g;
		g.setColor(Color.GRAY);
		
		//outer maze border
		g.fillRect(100,100,390,30);
		g.fillRect(100,100,30,450);
		g.fillRect(460,100,30,450);
		g.fillRect(100,540,390,30);
		
		gp.moveTo(130,130);
		gp.lineTo(130,160);
		gp.lineTo(145,145);
		gp.closePath();
		
		g2d.setPaint(Color.BLUE);
		g2d.fill(gp);
		
		g.setColor(Color.GRAY);
		g.fillRect(160,130,30,50);
		g.fillRect(220,130,30,50);
		g.fillRect(280,130,30,170);
		g.fillRect(340,130,30,80);
		
		g.fillRect(130,210,120,30);
		g.fillRect(340,210,90,30);
		g.fillRect(400,160,30,80);
		
		g.fillRect(280,270,150,30);
		g.fillRect(400,300,30,60);
		g.fillRect(340,300,30,60);
		
		g.fillRect(220,240,30,60);
		g.fillRect(130,330,180,30);
		g.fillRect(160,270,90,30);
		
		g.fillRect(160,330,30,90);
		g.fillRect(160,420,60,30);
		g.fillRect(130,480,60,30);
		
		g.setColor(Color.GREEN);
		g.fillRect(130,510,30,30);
		
		g.setColor(Color.GRAY);
		g.fillRect(220,480,30,90);
		
		g.fillRect(220,330,30,60);
		g.fillRect(280,330,30,90);
		g.fillRect(250,420,60,30);
		
		g.fillRect(310,390,120,30);
		g.fillRect(340,450,120,30);
		g.fillRect(340,480,30,30);
		g.fillRect(400,480,30,30);
		
		g.fillRect(250,480,60,30);


	}

	
}
