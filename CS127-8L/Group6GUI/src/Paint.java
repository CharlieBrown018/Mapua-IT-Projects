import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
 
public class Paint  extends JPanel{
 
  JButton ClearB, BlackB, BlueB, GreenB, RedB, MagentaB, OrangeB, YellowB, PinkB, CyanB, home;
  Draw drawArea;
  ActionListener actionListener = new ActionListener() {
      
 
  public void actionPerformed(ActionEvent e) {
      if (e.getSource() == ClearB) {
        drawArea.clear();
      } else if (e.getSource() == BlackB) {
        drawArea.black();
      } else if (e.getSource() == BlueB) {
        drawArea.blue();
      } else if (e.getSource() == GreenB) {
        drawArea.green();
      } else if (e.getSource() == RedB) {
        drawArea.red();
      } else if (e.getSource() == MagentaB) {
        drawArea.magenta();
      } else if (e.getSource() == OrangeB) {
        drawArea.orange();
      } else if (e.getSource() == YellowB) {
        drawArea.yellow();
      } else if (e.getSource() == PinkB) {
        drawArea.pink();
      } else if (e.getSource() == CyanB) {
        drawArea.cyan();
      } else if (e.getSource() == home){
        Main main = new Main();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                main.setVisible(true);
            }
        });
      }
    }
  };
 
  /*
  public static void main(String[] args) {
    new Paint().show();
  }*/
 
  public Paint() {
    // This is the main frame
    //JFrame frame = new JFrame("Paint");
    //Container content = frame.getContentPane();
    setLayout(new BorderLayout());
    setSize(1080, 720);
    // The draw area
    drawArea = new Draw();
 
    // add to content pane
    add(drawArea, BorderLayout.CENTER);
 
    // create controls to apply colors and call clear feature
    JPanel controls = new JPanel();
 
    ClearB = new JButton("Clear");
    ClearB.addActionListener(actionListener);
    BlackB = new JButton("Black");
    BlackB.addActionListener(actionListener);
    BlueB = new JButton("Blue");
    BlueB.addActionListener(actionListener);
    GreenB = new JButton("Green");
    GreenB.addActionListener(actionListener);
    RedB = new JButton("Red");
    RedB.addActionListener(actionListener);
    MagentaB = new JButton("Magenta");
    MagentaB.addActionListener(actionListener);
    OrangeB = new JButton("Orange");
    OrangeB.addActionListener(actionListener);
    YellowB = new JButton("Yellow");
    YellowB.addActionListener(actionListener);
    PinkB = new JButton("Pink");
    PinkB.addActionListener(actionListener);
    CyanB = new JButton("Cyan");
    CyanB.addActionListener(actionListener);
    home = new JButton("Home");
    home.addActionListener(actionListener);
    
 
    // add to panel
    controls.add(ClearB);
    controls.add(GreenB);
    controls.add(BlueB);
    controls.add(BlackB);
    controls.add(RedB);
    controls.add(MagentaB);
    controls.add(OrangeB);
    controls.add(YellowB);
    controls.add(PinkB);
    controls.add(CyanB);
    controls.add(home);

 
    // add to content pane
    add(controls, BorderLayout.NORTH);
    /*
    frame.setSize(1080, 720);
    // can close frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // show the swing paint result
    frame.setVisible(true);
    */
  }
 
}
