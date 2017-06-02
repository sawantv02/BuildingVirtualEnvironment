package Q6;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.GeneralPath;
import java.awt.image.BandCombineOp;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ByteLookupTable;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.awt.image.LookupOp;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

import javax.swing.JColorChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Q6Panel extends JPanel implements ActionListener,Java2DImageFilter{

	JMenuBar menuBar;
	JMenu menu;
	JMenuItem menuItemInvert, menuItemSharpen, menuItemBlur, menuItemColor;
	Color color = Color.GREEN;
	
	BufferedImage displayImage;
	BufferedImage originalImage;
	Image image;
	
	String shape="";

	public Q6Panel() {
		image=Toolkit.getDefaultToolkit().createImage("C:\\Users\\vishakha\\Documents\\myCourses\\BuildingVirtualEnvironment\\Assignments\\BVEAssignment2\\neu.jpg");
		
		MediaTracker mediaTracker=new MediaTracker(this);
		mediaTracker.addImage(image,0);
		
		try{
			mediaTracker.waitForAll();
		}
		catch(InterruptedException ie){
			ie.printStackTrace();
		}
		
		originalImage=new BufferedImage(image.getWidth(null),image.getHeight(null),BufferedImage.TYPE_INT_RGB);
		displayImage=originalImage;
		
		Graphics2D graphics=displayImage.createGraphics();
		graphics.drawImage(image,null,null);
	}
	
	public void applyFilter(String shape){
		
		displayImage=processImage(originalImage,shape);
		repaint();	
	}
	
	public void displayOriginalImage(){
		displayImage=new BufferedImage(image.getWidth(null),image.getHeight(null),BufferedImage.TYPE_INT_RGB);
		Graphics2D graphics=displayImage.createGraphics();
		graphics.drawImage(originalImage,null,null);
		repaint();
	}

	public JMenuBar createMenuBar() {

		menuBar = new JMenuBar();

		menu = new JMenu("Shape");

		menuBar.add(menu);

		menuItemInvert = new JMenuItem("Invert Image", KeyEvent.VK_I);
		menuItemSharpen = new JMenuItem("Sharpen Image", KeyEvent.VK_S);
		menuItemBlur = new JMenuItem("Blur Image", KeyEvent.VK_B);
		menuItemColor = new JMenuItem("Color Image", KeyEvent.VK_C);

		menu.add(menuItemInvert);
		menu.add(menuItemSharpen);
		menu.add(menuItemBlur);
		menu.add(menuItemColor);


		menuItemInvert.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				shape = "invert";
				applyFilter(shape);
			}
		});
		menuItemSharpen.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				shape = "sharpen";
				applyFilter(shape);
			}
		});
		menuItemBlur.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				shape = "blur";
				applyFilter(shape);
			}
		});
		menuItemColor.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				shape = "color";
				applyFilter(shape);
			}
		});

		return menuBar;
	}

	@Override
	public void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
//		displayOriginalImage();
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(originalImage, 0, 0,null);
		g2d.drawImage(displayImage,900,0,null);
		

	}
	
	public Dimension getPreferredSize(){
		return new Dimension(displayImage.getWidth(),displayImage.getHeight());
	}
	
	public Dimension getMinimumSize(){
		return getPreferredSize();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public BufferedImage processImage(BufferedImage image, String shape) {
		// TODO Auto-generated method stub
				if (shape.equals("invert"))
				{
					System.out.println("Inverting Image");	
					byte[] invertArray = new byte[256];
					for(int counter=0;counter<256;counter++){
						invertArray[counter]=(byte)(255-counter);
					}
					
					BufferedImageOp invertFilter=new LookupOp(new ByteLookupTable(0,invertArray),null);
					
					return invertFilter.filter(image,null);

				}
				
				if(shape.equals("sharpen")){
					System.out.println("Sharpening Image");
					float[] sharpenMatrix={0.0f,-1.0f,0.0f,
										  -1.0f,5.0f,-1.0f,
										   0.0f,-1.0f,0.0f};
					BufferedImageOp sharpenFilter=new ConvolveOp(new Kernel(3,3,sharpenMatrix),
							ConvolveOp.EDGE_NO_OP,null);
					
					return sharpenFilter.filter(image,null);

				}
				
				if(shape.equals("blur")){
					System.out.println("Blurring Image");
					float[] blurMatrix={1.0f/9.0f,1.0f/9.0f,1.0f/9.0f,
										1.0f/9.0f,1.0f/9.0f,1.0f/9.0f,
										1.0f/9.0f,1.0f/9.0f,1.0f/9.0f};
					
					BufferedImageOp blurFilter=new ConvolveOp(new Kernel(3,3,blurMatrix));
					return blurFilter.filter(image,null);

				}
				
				if(shape.equals("color")){
					System.out.println("Color Image");
					float[][] colorMatrix={{1.0f,0.0f,0.0f},
										   {0.5f,1.0f,0.5f},
										   {0.2f,0.4f,0.6f}};
					
					BandCombineOp changeColors=new BandCombineOp(colorMatrix, null);
					Raster sourceRaster=image.getRaster();
					WritableRaster displayRaster=sourceRaster.createCompatibleWritableRaster();
					changeColors.filter(sourceRaster,displayRaster);
					
					return new BufferedImage(image.getColorModel(),displayRaster,true,null);
					
					}
					
					return null;
	}

}
