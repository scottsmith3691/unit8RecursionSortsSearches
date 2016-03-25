 

import java.awt.BasicStroke;
import java.awt.Canvas; 
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;

public class FractalTree1 extends Canvas {

  // fields for drawing
  private JFrame frame;
  private final int WINDOW_WIDTH = 1280;
  private final int WINDOW_HEIGHT = 720;

  public FractalTree1() {
    frame = new JFrame("Fractal Tree");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
    frame.setLocationRelativeTo(null);
    frame.setResizable(true);
    frame.add(this);
    frame.setVisible(true);
  }

  public static void main(String[] args) {
    FractalTree1 ft = new FractalTree1();
    ft.setVisible(true);
    ft.setBackground(Color.black);
  }

  @Override
  public void paint(Graphics g) {
    g.setColor(Color.green);
    drawFractalTree(g, WINDOW_WIDTH / 2, WINDOW_HEIGHT - 75, -90, 11);
  }

  public void drawFractalTree(Graphics g, int x1, int y1, double angle, int depth) {
    if (depth == 0) {
    } else {
      int x2 = x1 + (int) (Math.cos(Math.toRadians(angle)) * depth * 10.0);
      int y2 = y1 + (int) (Math.sin(Math.toRadians(angle)) * depth * 10.0);

      Graphics2D g2d = (Graphics2D) g;
      g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,     RenderingHints.VALUE_ANTIALIAS_ON);

      g2d.setStroke(new BasicStroke(0.5f * depth));
      g2d.drawLine(x1, y1, x2, y2);

      drawFractalTree(g, x2, y2, angle + 30, depth - 1);
      drawFractalTree(g, x2, y2, angle - 30, depth - 1);
    }
  } 
}