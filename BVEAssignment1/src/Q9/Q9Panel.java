package Q9;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Q9Panel extends JPanel implements ActionListener {

	int deltax = 10;
	int deltay = 10;
	int currentx = 10;
	int currenty = 10;
	Timer timer;
	double angle = Math.PI / 36;

	public Q9Panel() {
		timer = new Timer(250, this);
		timer.start();
	}

	@Override
	public void paintComponent(Graphics g) {
//		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		int deltax = 10;
		int deltay = 10;
//		 for(int i=0;i<50;i++)
		{
			g2d.drawRect(400, 400, currentx, currenty);
			g2d.rotate(angle,400,400);


			currentx += deltax;
			currenty += deltay;
		}
		// for(int i=0;i<10;i++){
		// g.drawLine(400,400,currentx,currenty);
		// currentx+=deltax;
		// currenty+=deltay;
		// }

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
	}

}
