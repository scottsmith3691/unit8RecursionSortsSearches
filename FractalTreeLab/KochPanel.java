//********************************************************************
//  KochPanel.java       Author: Lewis/Loftus/Cocking
//
//  Represents a drawing surface on which to paint a Koch Snowflake.
//********************************************************************

import java.awt.*;
import javax.swing.JPanel;

public class KochPanel extends JPanel
{
   private final int PANEL_WIDTH = 800;
   private final int PANEL_HEIGHT = 800;

   private final double SQ = Math.sqrt(3.0) / 3;

   private final int TOPX = 300, TOPY = 300;
   private final int BOTTOMX = 300, BOTTOMY = 100;
   

   private int current; //current order

   //-----------------------------------------------------------------
   //  Sets the initial fractal order to the value specified.
   //-----------------------------------------------------------------
   public KochPanel ()
   {
      
      setBackground (Color.WHITE);
      setPreferredSize (new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
   }

   //-----------------------------------------------------------------
   //  Draws the fractal recursively. Base case is an order of 1 for
   //  which a simple straight line is drawn. Otherwise three
   //  intermediate points are computed, and each line segment is
   //  drawn as a fractal.
   //-----------------------------------------------------------------
   public void drawFractal (double dLength, int startX, int startY, double angle,
                            Graphics g2)
   {
        double dLen, ang;
        int sX, sY;
        if(dLength > 100)
        {
            g2.drawLine(startX, startY, startX, startY-(int)dLength);
        }
        System.out.println(dLength);
        
        dLen = dLength-dLength*.08333;
        ang = angle + 5;
        
        sX = startX + (int) Math.sin(ang)*(int)dLen;
        sY = startY + (int) Math.cos(ang)*(int)dLen;
        
        g2.drawLine (startX, startY, sX, sY);

        drawFractal (dLen, sX, sY, ang, g2);
        
      
   }

   //-----------------------------------------------------------------
   //  Performs the initial calls to the drawFractal method.
   //-----------------------------------------------------------------
   public void paintComponent (Graphics g2)
   {
      super.paintComponent (g2);

      g2.setColor (Color.BLUE);
      g2.drawLine (BOTTOMX, BOTTOMY, TOPX, TOPY);
      
      drawFractal (100, BOTTOMX, BOTTOMY, 45, g2);
      
   }

}
