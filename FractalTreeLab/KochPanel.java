import java.awt.*;
import java.util.*;
import javax.swing.JPanel;
import java.awt.geom.*;
public class KochPanel extends JPanel
{
   //Initializes the width of the panel
   private final int PANEL_WIDTH = 800;
   
   //Initializes the height of the panel
   private final int PANEL_HEIGHT = 800;
   
   //Initializes the array list of colors
   private ArrayList<Color> color = new ArrayList<Color>();
   
   //Initializes the random generator
   private Random rn = new Random();
   
   //Constructor for Koch Panel, sets background and dimensions
   public KochPanel ()
   {
      setBackground (Color.BLACK);
      setPreferredSize (new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
   }

   //  Draws the fractal recursively
    
   public void drawFractal (double dLength, int startX, int startY, double angle,
                            Graphics2D g2, int count)
   {    
        //Initializes all varabiable neccesary for drawing
        int endX, endY, endX1, endY1;
        
        //Creates the random generator of index's 0-7
        int rand = rn.nextInt(8);
        
        //Sets the color randomly
        g2.setColor(color.get(rand));
        
        //End case
        if(count==15)
        {
            return;
        }
       
        //calculates the end integers 
        endX = startX + (int) (Math.cos(Math.toRadians(angle)) * dLength );
        endY = startY + (int) (Math.sin(Math.toRadians(angle)) * dLength );
        
        //draws the line(s)
        g2.drawLine(startX, startY, endX, endY);
        
        //calls itself to draw two lines off the original line
        drawFractal(dLength*0.80, endX, endY, angle + 50, g2, count+1);
        drawFractal(dLength*0.60, endX, endY, angle - 35, g2, count+1);
   }

   //-----------------------------------------------------------------
   //  Performs the initial calls to the drawFractal method.
   //-----------------------------------------------------------------
   public void paintComponent(Graphics g)
   {
        //calls its parent class
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        
        //adds every color to the color array list
        color.add(Color.RED);
        color.add(Color.CYAN);
        color.add(Color.BLUE);
        color.add(Color.YELLOW);
        color.add(Color.GREEN);
        color.add(Color.MAGENTA);
        color.add(Color.ORANGE);
        color.add(Color.PINK);
        color.add(Color.WHITE);
        
        //Initial call to the fractal method
        drawFractal (100, 300, 250, 45, g2, 1);
      
   }

}
