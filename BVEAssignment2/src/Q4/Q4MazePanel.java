package Q4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.GeneralPath;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Q4MazePanel extends JPanel{
Image brick;
Image triangle;
    
    int x = 0;
    int y = 0;
    int width = 50;
    int height = 50;
//    int [][] maze = {
//    	{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},	
//    	{1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1},	
//    	{1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1},
//		{1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1},
//		{1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1},
//		{1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1},
//		{1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1},
//		{1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1},
//		{1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1},
//		{1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1},
//		{1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1},
//		{1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
//		{1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
//		{1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1},
//		{1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1},
//		{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
//	      };
    int [][] createmaze=new int[15][15];
    
    
    public Q4MazePanel()
    {
        try {
            triangle=ImageIO.read(new File("C:\\Users\\vishakha\\Documents\\myCourses\\BuildingVirtualEnvironment\\triangle.png"));
        	brick = ImageIO.read(new File("C:\\Users\\vishakha\\Documents\\myCourses\\BuildingVirtualEnvironment\\brick.png"));
        } catch (IOException ex) {
            Logger.getLogger(Q4MazePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int[][] createMaze(int maze[][]){
    	
    	for(int i=0;i<maze.length;i++){
    		for(int j=0;j<maze.length;j++){
    			if(i==0 || i==(maze.length-1))
    				maze[i][j]=1;
    			else if(j==0 || j==(maze.length-1))
    				maze[i][j]=1;
    			else{
    				int random=(int)(Math.random()*2);
    				maze[i][j]=random;
    			}
    			
    			
    		}
    		
    	}
    	return maze;
    }
    @Override
    public void paint(Graphics g) {
        //System.out.println(maze.length);
		GeneralPath gp=new GeneralPath();
		Graphics2D g2d = (Graphics2D) g;
		int [][] maze=createMaze(createmaze);
        boolean first=false;
        for (int row = 0; row < maze.length; row++)
        {
            for (int col = 0; col < maze[row].length; col++)
            {
            	if(row==1 && col==1){
                    g.drawImage(triangle, x, y, 50,50,Color.WHITE,this);
                    x += width;
            	}
            	else if(row==(maze.length-2) && col==(maze.length-2)){
            		g.setColor(Color.GREEN);
            		g.fillRect(x,y,50,50);
            		x+=width;
            	}
            	else if (maze[row][col] == 1)
                {
                    g.drawImage(brick, x, y, 50,50, this);
                    x += width;
                }
                else if (maze[row][col] == 0) {

//                	if(first==false){
//                		first=true;
//                        g.drawImage(triangle, x, y, 50,50,Color.WHITE,this);
//                        x += width;
//
//                	}else
                	{
                        g.setColor(Color.WHITE);
                        g.fillRect(x, y, width, height);
                        x += width;
                	}

                	
                }
            }
            
            //reset x to the beginning
            x = 0;
            
            //start a new row by increasing y
            y += height;
        }
    }
}