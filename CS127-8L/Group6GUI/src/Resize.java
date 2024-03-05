
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author katri
 */

public class Resize {
    
    public Icon resizeImg(ImageIcon bg, JLabel label){
        Image pic = bg.getImage();
        Image scaledBg = pic.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bgScaled = new ImageIcon(scaledBg);
        //label.setIcon(bgScaled);
        return bgScaled;
    }
    
    public void resizeIcon(ImageIcon icon, JButton button){
        Image pic = icon.getImage();
        Image pic2scaled = pic.getScaledInstance(button.getWidth(), button.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledpic2 = new ImageIcon(pic2scaled);
        button.setIcon(scaledpic2);
        button.setBorderPainted(false);
        button.setOpaque(false);
        button.setContentAreaFilled(false);
    }
}
