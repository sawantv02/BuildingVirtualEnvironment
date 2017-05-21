package Q10;

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

public class Q10MazePanel extends JPanel{
Image brick;
Image triangle;
    
    int x = 0;
    int y = 0;
    int width = 50;
    int height = 50;
    int [][] maze = {
    	{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},	
    	{1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1},	
    	{1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1},
		{1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1},
		{1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1},
		{1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1},
		{1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1},
		{1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1},
		{1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1},
		{1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1},
		{1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1},
		{1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
		{1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
		{1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1},
		{1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1},
		{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
	      };
    
    public Q10MazePanel()
    {
        try {
            triangle=ImageIO.read(new File("C:\\Users\\vishakha\\Documents\\myCourses\\BuildingVirtualEnvironment\\triangle.png"));
        	brick = ImageIO.read(new File("C:\\Users\\vishakha\\Documents\\myCourses\\BuildingVirtualEnvironment\\brick.png"));
        } catch (IOException ex) {
            Logger.getLogger(Q10MazePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public void paint(Graphics g) {
        //System.out.println(maze.length);
		GeneralPath gp=new GeneralPath();
		Graphics2D g2d = (Graphics2D) g;
        boolean first=false;
        for (int row = 0; row < maze.length; row++)
        {
            for (int col = 0; col < maze[row].length; col++)
            {
                if (maze[row][col] == 1)
                {
                    g.drawImage(brick, x, y, 50,50, this);
                    x += width;
                }
                else if (maze[row][col] == 0) {

                	if(first==false){
                		first=true;
                        g.drawImage(triangle, x, y, 50,50,Color.WHITE,this);
                        x += width;

                	}else{
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
