package Q5;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Q5Panel extends JPanel implements ActionListener,MouseListener{
	
	int count=0;
	Timer timer;
	Image[] arr=new Image[8];
	public Q5Panel(){
		
		try {
			arr[0] = ImageIO.read(new File("C:\\Users\\vishakha\\Documents\\myCourses\\BuildingVirtualEnvironment\\Assignments\\BVEAssignment2\\gangnam_style_images\\1.png"));
			arr[1] = ImageIO.read(new File("C:\\Users\\vishakha\\Documents\\myCourses\\BuildingVirtualEnvironment\\Assignments\\BVEAssignment2\\gangnam_style_images\\2.png"));
			arr[2] = ImageIO.read(new File("C:\\Users\\vishakha\\Documents\\myCourses\\BuildingVirtualEnvironment\\Assignments\\BVEAssignment2\\gangnam_style_images\\3.png"));
			arr[3] = ImageIO.read(new File("C:\\Users\\vishakha\\Documents\\myCourses\\BuildingVirtualEnvironment\\Assignments\\BVEAssignment2\\gangnam_style_images\\4.png"));
			arr[4] = ImageIO.read(new File("C:\\Users\\vishakha\\Documents\\myCourses\\BuildingVirtualEnvironment\\Assignments\\BVEAssignment2\\gangnam_style_images\\5.png"));
			arr[5] = ImageIO.read(new File("C:\\Users\\vishakha\\Documents\\myCourses\\BuildingVirtualEnvironment\\Assignments\\BVEAssignment2\\gangnam_style_images\\7.png"));
			arr[6] = ImageIO.read(new File("C:\\Users\\vishakha\\Documents\\myCourses\\BuildingVirtualEnvironment\\Assignments\\BVEAssignment2\\gangnam_style_images\\8.png"));
			arr[7] = ImageIO.read(new File("C:\\Users\\vishakha\\Documents\\myCourses\\BuildingVirtualEnvironment\\Assignments\\BVEAssignment2\\gangnam_style_images\\9.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			Logger.getLogger(Q5Panel.class.getName()).log(Level.SEVERE, null, e);
		}
		timer=new Timer(150, this);
		timer.start();
		addMouseListener(this);
	}
	

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		// TODO Auto-generated method stub
		
		g.drawImage(arr[count], 50,50,500,500,this);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		count=(count+1)%8;
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		timer.stop();
		
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
