import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JComponent;
 
/**
*
* @author Rece
*
*/
public class Draw extends JComponent {
 
  // Image in which we're going to draw
  private Image image;
  // Uses Graphics2D to draw
  private Graphics2D g2;
  // Uses the coordinates of the mouse to input
  private int currentX, currentY, oldX, oldY;
 
  public Draw() {
    setDoubleBuffered(false);
    addMouseListener(new MouseAdapter() {
      public void mousePressed(MouseEvent e) {
        // This is when the mouse is pressed and the colors are registered in the board
        oldX = e.getX();
        oldY = e.getY();
      }
    });
 
    addMouseMotionListener(new MouseMotionAdapter() {
      public void mouseDragged(MouseEvent e) {
        // This is where the mouse location is being tracked
        currentX = e.getX();
        currentY = e.getY();
 
        if (g2 != null) {
          g2.drawLine(oldX, oldY, currentX, currentY);
          repaint();
          oldX = currentX;
          oldY = currentY;
        }
      }
    });
  }
 
  protected void paintComponent(Graphics g) {
    if (image == null) {
      // This is the input on the colors
      image = createImage(getSize().width, getSize().height);
      g2 = (Graphics2D) image.getGraphics();
      // Will make the lines more accurate
      g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      // This will clear the entire board
      clear();
    }
 
    g.drawImage(image, 0, 0, null);
  }
 
  
  public void clear() {
    g2.setPaint(Color.white);
    // This will clear all colors as the entire board will be filled with white color
    g2.fillRect(0, 0, getSize().width, getSize().height);
    g2.setPaint(Color.black);
    repaint();
  }
 
      // These apply the colors that the user wants to use

  public void red() {
    g2.setPaint(Color.red);
  }
 
  public void black() {
    g2.setPaint(Color.black);
  }
 
  public void magenta() {
    g2.setPaint(Color.magenta);
  }
 
  public void green() {
    g2.setPaint(Color.green);
  }
 
  public void blue() {
    g2.setPaint(Color.blue);
  }
 public void orange() {
    g2.setPaint(Color.orange);
  }
 public void yellow() {
    g2.setPaint(Color.yellow);
  }
 public void pink() {
    g2.setPaint(Color.pink);
 }
 public void cyan() {
    g2.setPaint(Color.cyan);
 }
}