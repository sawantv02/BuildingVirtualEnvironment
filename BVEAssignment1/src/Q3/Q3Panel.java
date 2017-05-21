package Q3;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Q3Panel extends JPanel implements ActionListener{

	int x1,y1,size;
	Color color;
	Timer timer;
	static int count=0;
	public Q3Panel(){
		timer=new Timer(500, this);
		timer.start();
	}
	

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		// TODO Auto-generated method stub
		System.out.println(count);
		if(count>100)
			timer.stop();
		else{
		x1=(int)(Math.random()*400);
		y1=(int)(Math.random()*400);
		size=(int)(Math.random()*100);
		color=new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
		g.setColor(color);
		g.setFont(new Font("Arial",Font.ITALIC,size));
		g.drawString("VS", x1, y1);
		count++;
		}
		
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			repaint();
	}

	
	

}
