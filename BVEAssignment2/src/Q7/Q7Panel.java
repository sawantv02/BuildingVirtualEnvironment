package Q7;

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

import Q1.Q1Panel;

public class Q7Panel extends JPanel implements ActionListener{

	Image flag;
	int tx,ty=400;
	int hx,hy=425;
	Color color;
	Timer timer;
	String tmove;
	String hmove;
	public Q7Panel(){
		timer=new Timer(1000, this);
		timer.start();
		try {
			flag = ImageIO.read(
					new File("C:\\Users\\vishakha\\Documents\\myCourses\\BuildingVirtualEnvironment\\Assignments\\BVEAssignment2\\flag.png"));
		} catch (IOException ex) {
			Logger.getLogger(Q1Panel.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
	boolean check=false;
	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		// TODO Auto-generated method stub
		color=Color.GREEN;
		
		g.setColor(color);
		g.fillRect(0,400,800,400);
		
		g.setColor(Color.BLACK);
		g.fillRect(tx,ty,25,25);
		
		g.setColor(Color.WHITE);
		g.fillRect(hx,hy,25,25);
		
		g.drawImage(flag,760,375,25,25,null);
		

		if((tx>=775 && tx<=800 )){
			System.out.println("Tortoise won!! yeyyy");
			check=true;
			timer.stop();
		}
		else if((hx>=775 && hx<=800 )){
			System.out.println("Hare won!!yeyy");
			check=true;
			timer.stop();
		}
		
		int t=(int)(Math.random()*10);
		System.out.println("--------------------t:"+t);
		if(t>=0 && t<=4)
			tmove="fast plod";
		else if(t>=5 && t<=6)
			tmove="slip";
		else if(t>=7 && t<=9)
			tmove="slow pod";
		System.out.println("tmove-"+tmove);
		int h=(int)(Math.random()*10);
		System.out.println("---------------------h:"+h);
		
		if(h>=0 && h<=1)
			hmove="sleep";
		else if(h>=2 && h<=3)
			hmove="big hop";
		else if(h==4)
			hmove="big slip";
		else if(h>=5 && h<=7)
			hmove="small hop";
		else if(h>=8 && h<=9)
			hmove="small slip";

		System.out.println("hmove-"+hmove);
		switch (hmove) {
		case "sleep":{
			hx=hx;
			hy=hy;
			break;
		}
		
		case "big hop":{
			if(hx>=0 && hx<=570)
				hx=hx+(25*9);
			hy=hy;
			break;	
		}
		case "big slip":{
			hy=hy;
			if(hx>=225 && hx<=800)
				hx=hx-(25*9);
			break;
			
		}
		case "small hop":{
			if(hx>=0 && hx<=770)
				hx=hx+25;
			hy=hy;
			break;
		}
		case "small slip":{
			hy=hy;
			if(hx>=50 && hx<=800)
				hx=hx-(25*2);
			break;
		}
		}
		
		switch(tmove){
		case "fast plod":{
			if(tx>=0 && tx<=720)
				tx=tx+(25*3);
			ty=ty;
			break;
		}
		
		case "slip":{
			ty=ty;
			if(tx>=150 && tx<=800)
				tx=tx-(25*6);
			break;
		}
		
		case "slow pod":{
			if(tx>=0 && tx<=770)
				tx=tx+25;
			ty=ty;
			break;
		}
		}
		
		

		if(tx==hx && hy==(ty+25))
			System.out.println("Ouch!!");
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

//		if(check==true){
//			timer.stop();
//		}
//		else
			repaint();

	}



}
