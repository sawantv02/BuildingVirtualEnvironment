package Q1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.GeneralPath;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Q1Panel extends JPanel implements MouseListener {
	Image brick;
	Image triangle;

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

	public Q1Panel() {
		addMouseListener(this);
		try {
			triangle = ImageIO.read(
					new File("C:\\Users\\vishakha\\Documents\\myCourses\\BuildingVirtualEnvironment\\triangle.png"));
			brick = ImageIO
					.read(new File("C:\\Users\\vishakha\\Documents\\myCourses\\BuildingVirtualEnvironment\\brick.png"));
		} catch (IOException ex) {
			Logger.getLogger(Q1Panel.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public void solveTheMaze(int[][] maze, int posi, int posj) {

	}

	@Override
	public void paint(Graphics g) {
		// System.out.println(maze.length);
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

		System.out.println("clickx:" + clickx + ",clicky:" + clicky);
		System.out.println("walkx:" + walkx + ",walky:" + walky);
		if (clickx >= (walkx) && clickx < (walkx + width)) {
			if (clicky >= (walky + height) && clicky <= (walky + 2 * height)) {
				// user clicked below the robot
				// move robot one cell down
				walky += height;
			}
			
			if(clicky<(walky) && clicky <=(walky)){
				walky-=height;
			}
		}
			

		if (clicky >= (walky) && clicky < (walky + height)) {

			if (clickx >= (walkx + width) && clickx <= (walkx + 2 * width)) {
				walkx += width;
			}
			
			if(clickx<walkx && clickx<=(walkx)){
				walkx-=width;
			}
		}
		

		g.setColor(Color.RED);
		g.fillOval(walkx, walky, width, height);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		clickx = e.getX();
		clicky = e.getY();
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
