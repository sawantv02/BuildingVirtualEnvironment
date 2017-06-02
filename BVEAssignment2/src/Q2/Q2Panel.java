package Q2;

import java.awt.Color;
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
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.JColorChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.Timer;

import Q1.Q1Panel;

public class Q2Panel extends JPanel implements KeyListener {
	Image brick;
	Image triangle;

	String move;
	int x = 0;
	int y = 0;
	int width = 50;
	int height = 50;
	int walkx = width;
	int walky = height;

	int clickx = 0;
	int clicky = 0;

	int[][] maze = { { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1 },
			{ 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1 }, { 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1 },
			{ 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1 }, { 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1 },
			{ 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1 }, { 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1 },
			{ 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1 }, { 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1 },
			{ 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1 }, { 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 },
			{ 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 }, { 1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1 },
			{ 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 } };

	public Q2Panel() {
		
		setFocusable(true);
		requestFocusInWindow();
		addKeyListener(this);
		try {
			triangle = ImageIO.read(
					new File("C:\\Users\\vishakha\\Documents\\myCourses\\BuildingVirtualEnvironment\\triangle.png"));
			brick = ImageIO
					.read(new File("C:\\Users\\vishakha\\Documents\\myCourses\\BuildingVirtualEnvironment\\brick.png"));
		} catch (IOException ex) {
			Logger.getLogger(Q1Panel.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);

		// reset the maze coords
		x = 0;
		y = 0;
		GeneralPath gp = new GeneralPath();
		Graphics2D g2d = (Graphics2D) g;
		boolean first = false;
		for (int row = 0; row < maze.length; row++) {
			for (int col = 0; col < maze[row].length; col++) {
				if (maze[row][col] == 1) {
					g.drawImage(brick, x, y, 50, 50, this);
					x += width;
				} else if (maze[row][col] == 0) {

					if (first == false) {
						first = true;
						g.drawImage(triangle, x, y, 50, 50, Color.WHITE, this);
						x += width;

					} else {
						g.setColor(Color.WHITE);
						g.fillRect(x, y, width, height);
						x += width;
					}

				}
			}

			// reset x to the beginning
			x = 0;

			// start a new row by increasing y
			y += height;
		}

		System.out.println("clickx:" + move);

 
			if (move=="down") {
				// user clicked below the robot
				// move robot one cell down
				walky += height;
			}
			
			if(move=="up"){
				walky-=height;
			}

			if (move=="right") {
				walkx += width;
			}
			
			if(move=="left"){
				walkx-=width;
			}

		g.setColor(Color.RED);
		g.fillOval(walkx, walky, width, height);
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
			break;
		}
		case 40: {
			move = "down";
			break;
		}
		case 37: {
			move = "left";
			break;
		}
		case 39: {
			move = "right";
			break;
		}
		}

		repaint();

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}


}
