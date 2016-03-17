//********************************************************************
//  KochSnowflakeViewer.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of recursion.
//  @gcschmit (19 July 2014): converted from an applet to an application
//********************************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KochFractalViewer 
{
    private final int WIDTH = 800;
    private final int HEIGHT = 800;

    private final int MIN = 1, MAX = 12;

    private JButton increase, decrease;
    private JLabel titleLabel, orderLabel;
    private KochPanel drawing;
    private JPanel panel, tools;
    private JFrame frame;

    //-----------------------------------------------------------------
    //  Sets up the components for the applet.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        KochFractalViewer viewer = new KochFractalViewer();
    }

    public KochFractalViewer()
    {
        tools = new JPanel ();
        tools.setLayout (new BoxLayout(tools, BoxLayout.X_AXIS));
        tools.setBackground (Color.yellow);
        tools.setOpaque (true);

        titleLabel = new JLabel ("The Koch Fractal");
        titleLabel.setForeground (Color.black);


        tools.add (titleLabel);
        tools.add (Box.createHorizontalStrut (20));
      

        drawing = new KochPanel ();

        panel = new JPanel();
        panel.add (tools);
        panel.add (drawing);

        frame = new JFrame();
        frame.setTitle("Knoch Fractal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.add(panel);
        frame.setVisible(true);
    }

    //-----------------------------------------------------------------
    //  Determines which button was pushed, and sets the new order
    //  if it is in range.
    //-----------------------------------------------------------------
    
}
