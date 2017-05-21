package Q6;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.GeneralPath;

import javax.swing.JColorChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Q6Panel extends JPanel implements ActionListener, MouseListener {

	JMenuBar menuBar;
	JMenu menu, colormenu;
	JMenuItem menuItemC, menuItemO, menuItemR, menuItemL, menuItemColor;
	Color color = Color.GREEN;
	String shape="";
	int x1 = 0, y1 = 0, x2 = 0, y2 = 0;

	public Q6Panel() {
		addMouseListener(this);
	}

	public JMenuBar createMenuBar() {

		menuBar = new JMenuBar();

		menu = new JMenu("Shape");
		colormenu = new JMenu("Color");

		menuBar.add(menu);
		menuBar.add(colormenu);

		menuItemC = new JMenuItem("Circle", KeyEvent.VK_C);
		menuItemO = new JMenuItem("Oval", KeyEvent.VK_O);
		menuItemR = new JMenuItem("Rectangle", KeyEvent.VK_R);
		menuItemL = new JMenuItem("Line", KeyEvent.VK_L);
		menuItemColor = new JMenuItem("Choose color");

		menu.add(menuItemC);
		menu.add(menuItemO);
		menu.add(menuItemR);
		menu.add(menuItemL);
		colormenu.add(menuItemColor);

		menuItemC.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				shape = "circle";
			}
		});
		menuItemL.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				shape = "line";
				System.out.println("in line");
			}
		});
		menuItemO.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				shape = "oval";
			}
		});
		menuItemR.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				shape = "rectangle";
			}
		});
		menuItemColor.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("in colormenu");
				color = JColorChooser.showDialog(Q6Panel.this, "Choose a color", color);
			}
		});

		return menuBar;
	}

	@Override
	public void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		System.out.println(x1+" "+y1+" "+x2+" "+y2);
		g.setColor(color);
		if (shape.equals("line"))
		{
			System.out.println("drawing line");	
			g.drawLine(x1, y1, x2, y2);

		}
		
		if(shape.equals("rectangle")){
			System.out.println("drawing rectangle");
			g.drawRect(x1, y1, x2-x1, y2-y1);
		}
		
		if(shape.equals("circle")){
			System.out.println("drawing circle");
			g.drawArc(x1, y1, x2-x1, y2-y1, 0, 360);
		}
		
		if(shape.equals("oval")){
			System.out.println("drawing oval");
			g.drawOval(x1, y1, x2-x1, y2-y1);
		}


	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("in mouse pressed");
		x1 = e.getX();
		y1 = e.getY();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouse released");
		x2 = e.getX();
		y2 = e.getY();
		repaint();
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
