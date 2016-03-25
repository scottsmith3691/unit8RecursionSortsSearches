//********************************************************************
//  KochPanel.java       Author: Lewis/Loftus/Cocking
//
//  Represents a drawing surface on which to paint a Koch Snowflake.
//********************************************************************

import java.awt.*;
import java.util.*;
import javax.swing.JPanel;
import java.awt.geom.*;
public class KochPanel extends JPanel
{
   private final int PANEL_WIDTH = 800;
   private final int PANEL_HEIGHT = 800;
   private ArrayList<Color> color = new ArrayList<Color>();
   
   private Random rn = new Random();
   //-----------------------------------------------------------------
   //  Sets the initial fractal order to the value specified.
   //-----------------------------------------------------------------
   public KochPanel ()
   {
      setBackground (Color.BLACK);
      setPreferredSize (new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
   }

   //-----------------------------------------------------------------
   //  Draws the fractal recursively. Base case is an order of 1 for
   //  which a simple straight line is drawn. Otherwise three
   //  intermediate points are computed, and each line segment is
   //  drawn as a fractal.
   //-----------------------------------------------------------------
    
   public void drawFractal (double dLength, int startX, int startY, double angle,
                            Graphics2D g2, int count)
   {    
        int endX, endY, endX1, endY1;
        int rand = rn.nextInt(8);
        g2.setColor(color.get(rand));
        if(count==15)
        {
            return;
        }
       
        
        endX = startX + (int) (Math.cos(Math.toRadians(angle)) * dLength );
       endY = startY + (int) (Math.sin(Math.toRadians(angle)) * dLength );
      
      g2.drawLine(startX, startY, endX, endY);
      
      drawFractal(dLength*0.80, endX, endY, angle + 50, g2, count+1);
      drawFractal(dLength*0.60, endX, endY, angle - 35, g2, count+1);
   }

   //-----------------------------------------------------------------
   //  Performs the initial calls to the drawFractal method.
   //-----------------------------------------------------------------
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      Graphics2D g2 = (Graphics2D) g;
      
        color.add(Color.RED);
        color.add(Color.CYAN);
        color.add(Color.BLUE);
        color.add(Color.YELLOW);
        color.add(Color.GREEN);
        color.add(Color.MAGENTA);
        color.add(Color.ORANGE);
        color.add(Color.PINK);
        color.add(Color.WHITE);
      
      drawFractal (100, 300, 250, 45, g2, 1);
      
   }

}
