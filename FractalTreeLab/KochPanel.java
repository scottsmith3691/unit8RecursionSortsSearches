//********************************************************************
//  KochPanel.java       Author: Lewis/Loftus/Cocking
//
//  Represents a drawing surface on which to paint a Koch Snowflake.
//********************************************************************

import java.awt.*;
import javax.swing.JPanel;
import java.awt.geom.*;
public class KochPanel extends JPanel
{
   private final int PANEL_WIDTH = 800;
   private final int PANEL_HEIGHT = 800;

   

   private final int TOPX = 300, TOPY = 300;
   private final int BOTTOMX = 300, BOTTOMY = 100;
   

   private int current; //current order

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
                            Graphics2D g2, boolean isLeft)
   {
        double dLen, ang;
        int sX, sY;
        boolean direction = isLeft;
        boolean opp = false;
        g2.setColor (Color.WHITE);
        if(angle>110)
        {
            return;
        }
        //System.out.println(dLength);
        
        dLen = dLength-dLength*.2333;
        ang = angle + 5;
        sX = startX + (int) (Math.sin(ang)*dLen);
        sY = startY + (int) (Math.cos(ang)*dLen);
        if(direction == true)
        {
           //sX = startX + (int) (Math.sin(ang)*dLen);
           //sY = startY + (int) (Math.cos(ang)*dLen);
           g2.draw(new Line2D.Double(startX, startY, sX, sY));
           drawFractal (dLen, sX, sY, ang, g2, direction);
        }       
        if(opp = false)
        {
           
            g2.draw(new Line2D.Double(startX, startY, sX, sY));
            drawFractal (dLen, sX, sY, ang, g2, opp);
        }
        //drawFractal (dLen, sX, sY, ang, g2);
      
   }

   //-----------------------------------------------------------------
   //  Performs the initial calls to the drawFractal method.
   //-----------------------------------------------------------------
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      Graphics2D g2 = (Graphics2D) g;
      g2.setColor (Color.WHITE);
      g2.draw(new Line2D.Double(300, 300, 300, 200));
      
      drawFractal (100, 300, 300, 45, g2, true);
      
   }

}
