package Q7;

import java.awt.Color;
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

public class Q7Panel extends JPanel implements MouseListener, KeyListener {

	int x1,y1,x2,y2;
	String move = "";

	public Q7Panel() {
		
		setFocusable(true);
		requestFocusInWindow();
		addMouseListener(this);
		addKeyListener(this);
	}

	@Override
	public void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		System.out.println(x1 + " " + y1 + " " + x2 + " " + y2);
		if(x2>=0 && y2>=0)
			g.drawLine(x1, y1, x2,y2);
		

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("in key pressed");
		int keycode = e.getKeyCode();
		System.out.println(keycode);
		switch (keycode) {
		case 38: {
			move = "up";
			x2=x1;
			y2-=1;
			break;
		}
		case 40: {
			move = "down";
			x2=x1;
			y2+=1;
			break;
		}
		case 37: {
			move = "left";
			x2-=1;
			y2=y1;
			break;
		}
		case 39: {
			move = "right";
			x2 += 1;
			y2=y1;
			break;
		}
		}

		repaint();

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		x1 = e.getX();
		y1 = e.getY();
		x2=x1;
		y2=y1;
		repaint();

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
