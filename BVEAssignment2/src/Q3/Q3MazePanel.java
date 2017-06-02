package Q3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.GeneralPath;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Q3MazePanel extends JPanel implements ActionListener {
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

	int posi = 1;
	int posj = 1;

	Timer timer;
	int[][] maze = { { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1 },
			{ 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1 }, { 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1 },
			{ 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1 }, { 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1 },
			{ 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1 }, { 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1 },
			{ 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1 }, { 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1 },
			{ 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1 }, { 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 },
			{ 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 }, { 1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1 },
			{ 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 } };

	public Q3MazePanel() {
		timer = new Timer(1000, this);
		timer.start();
		try {
			triangle = ImageIO.read(
					new File("C:\\Users\\vishakha\\Documents\\myCourses\\BuildingVirtualEnvironment\\triangle.png"));
			brick = ImageIO
					.read(new File("C:\\Users\\vishakha\\Documents\\myCourses\\BuildingVirtualEnvironment\\brick.png"));
		} catch (IOException ex) {
			Logger.getLogger(Q3MazePanel.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public String solveTheMaze(int[][] maze, int i, int j) {
		String var = null;
		if (j >= 1 && i >= 0) {
			System.out.println(maze[i + 1][j]);
			if (maze[i][j - 1] == 1 && maze[i + 1][j] == 0) {
				var = "down";
			} else if (maze[i + 1][j] == 1 && maze[i][j + 1] == 0) {
				var = "right";
			} else if (maze[i][j + 1] == 0 || maze[i + 1][j] == 0) {
				var = "down";
			} else if ((maze[i - 1][j] == 0 && maze[i][j + 1] == 1)) {
				var = "up";
			}
			System.out.println(var);
		}

		return var;

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

		String check = solveTheMaze(maze, posi, posj);
		if (check.equals("down")) {
			posi += 1;
			walky += height;
		}
		if (check.equals("right")) {
			posj += 1;
			walkx += width;
		}
		if (check.equals("up")) {
			posi -= 1;
			walky -= height;
		}


		g.setColor(Color.RED);
		g.fillOval(walkx, walky, width, height);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
	}
}
