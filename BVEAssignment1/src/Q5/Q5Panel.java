package Q5;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Arc2D;
import java.awt.geom.GeneralPath;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

public class Q5Panel extends JPanel implements ActionListener{
	protected JTextField tf1;
	protected JTextField tf2;
	protected JTextField tf3;
	protected JTextField tf4;
	protected JButton button;

	
	double ang1=0,ang2=0,ang3=0,ang4=0;
	

	public Q5Panel() {
		tf1 = new JTextField(10);
		tf2 = new JTextField(10);
		tf3 = new JTextField(10);
		tf4 = new JTextField(10);


		button = new JButton("Create pi chart");

		add(tf1);
		add(tf2);
		add(tf3);
		add(tf4);
		add(button);
		button.addActionListener(this);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		System.out.println("In Paint");
		// TODO Auto-generated method stub
		
		if(ang1>0){
		this.ang1 = ((ang1*360)/100);
		this.ang2 = ((ang2*360)/100);
		this.ang3 = ((ang3*360)/100);
		this.ang4 = ((ang4*360)/100);
		System.out.println(ang1+" "+ang2+" "+ang3+" "+ang4);
		
		Graphics2D g2d = (Graphics2D) g;
		g2d.setPaint(Color.RED);
		Arc2D.Double arc1 = new Arc2D.Double(Arc2D.PIE);
		arc1.setFrame(400, 400, 300, 300);
		arc1.setAngleStart(0);
		arc1.setAngleExtent(ang1);
		g2d.fill(arc1);
		
		g2d.setPaint(Color.GREEN);
		Arc2D.Double arc2 = new Arc2D.Double(Arc2D.PIE);
		arc2.setFrame(400, 400, 300, 300);
		arc2.setAngleStart(ang1);
		arc2.setAngleExtent(ang2);
		g2d.fill(arc2);
		
		g2d.setPaint(Color.YELLOW);
		Arc2D.Double arc3 = new Arc2D.Double(Arc2D.PIE);
		arc3.setFrame(400, 400, 300, 300);
		arc3.setAngleStart(ang1+ang2);
		arc3.setAngleExtent(ang3);
		g2d.fill(arc3);
		
		g2d.setPaint(Color.GRAY);
		Arc2D.Double arc4 = new Arc2D.Double(Arc2D.PIE);
		arc4.setFrame(400, 400, 300, 300);
		arc4.setAngleStart(ang1+ang2+ang3);
		arc4.setAngleExtent(ang4);
		g2d.fill(arc4);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		ang1=Double.parseDouble(tf1.getText());
		ang2=Double.parseDouble(tf2.getText());
		ang3=Double.parseDouble(tf3.getText());
		ang4=Double.parseDouble(tf4.getText());
		validate();
		repaint();
		
	}

}
