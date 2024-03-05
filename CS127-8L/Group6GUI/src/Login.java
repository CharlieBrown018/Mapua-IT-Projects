/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.awt.*;
import static java.awt.PageAttributes.ColorType.COLOR;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.*;

/**
 *
 * @author katri
 */
public class Login extends javax.swing.JFrame {
    ImageIcon background = new ImageIcon ("src/Frames/Login_LM.png");
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        resizeImg(background);
        clock();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MAIN = new javax.swing.JPanel();
        Login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabelDate = new javax.swing.JLabel();
        jLabelTime = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuExit = new javax.swing.JMenu();
        jMenuAboutUs = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cardinal OS Group 6");
        setMinimumSize(new java.awt.Dimension(1080, 720));

        MAIN.setMinimumSize(new java.awt.Dimension(1080, 720));
        MAIN.setPreferredSize(new java.awt.Dimension(1075, 720));
        MAIN.setRequestFocusEnabled(false);
        MAIN.setLayout(null);

        Login.setText("Login");
        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginMouseExited(evt);
            }
        });
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        MAIN.add(Login);
        Login.setBounds(150, 480, 140, 40);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("WELCOME BACK");
        MAIN.add(jLabel1);
        jLabel1.setBounds(80, 150, 290, 150);
        MAIN.add(username);
        username.setBounds(130, 320, 200, 30);

        jLabel2.setText("Username: ");
        MAIN.add(jLabel2);
        jLabel2.setBounds(40, 330, 70, 20);

        jLabel3.setText("Password:");
        MAIN.add(jLabel3);
        jLabel3.setBounds(40, 380, 60, 16);

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        MAIN.add(password);
        password.setBounds(130, 380, 200, 30);
        MAIN.add(jLabelDate);
        jLabelDate.setBounds(650, 550, 320, 40);
        MAIN.add(jLabelTime);
        jLabelTime.setBounds(650, 600, 320, 40);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frames/Login_LM.png"))); // NOI18N
        Background.setPreferredSize(new java.awt.Dimension(1090, 720));
        MAIN.add(Background);
        Background.setBounds(0, 0, 1080, 700);

        jMenuExit.setText("Exit");
        jMenuExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuExitMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuExit);

        jMenuAboutUs.setText("About Us");
        jMenuAboutUs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuAboutUsMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuAboutUs);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MAIN, javax.swing.GroupLayout.PREFERRED_SIZE, 1083, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MAIN, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:
        if ("user1".equals(username.getText()) && "password".equals(password.getText())){
            new Main().setVisible(true);
            setVisible(false);
        }
        else{
            username.setText("");
            password.setText("");
        }
    }//GEN-LAST:event_LoginActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void LoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseEntered
        // TODO add your handling code here:
        Login.setBackground(Color.red);
    }//GEN-LAST:event_LoginMouseEntered

    private void LoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseExited
        // TODO add your handling code here:
        Login.setBackground(Color.white);
    }//GEN-LAST:event_LoginMouseExited

    private void jMenuExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuExitMouseClicked

    private void jMenuAboutUsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAboutUsMouseClicked
        // TODO add your handling code here:
        JFrame aboutUs = new JFrame("About Us");
        JOptionPane.showMessageDialog(aboutUs, "This is a project by Group 6 of BM5 CS128-8L: "
            + "\nCharles Ian Monteloyola"
            + "\nKarina Francesca Soo"
            + "\nPatrick Miguel Purificacion"
            + "\nJeremey Joshua Yao"
            + "\nJenoel Kline Recena");
    }//GEN-LAST:event_jMenuAboutUsMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }
    
    public void resizeImg(ImageIcon bg){
        Image pic = bg.getImage();
        Image scaledBg = pic.getScaledInstance(Background.getWidth(), Background.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon bgScaled = new ImageIcon(scaledBg);
        Background.setIcon(bgScaled);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton Login;
    private javax.swing.JPanel MAIN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelTime;
    private javax.swing.JMenu jMenuAboutUs;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuExit;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

private void clock() {
        try{
            Timer timer = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Calendar cal1 = new GregorianCalendar();
                    Calendar cal2 = cal1.getInstance();
                    
                    String date = new SimpleDateFormat("MMMM '-' dd '-' YYYY EEEE").format(Calendar.getInstance().getTime()).toUpperCase();
                    String time = new SimpleDateFormat("hh ':' mm ':' ss").format(Calendar.getInstance().getTime());
                    
                    String am_pm;
                    if (cal1.get(Calendar.AM_PM) == 0){
                        am_pm = "AM";
                    } else{
                        am_pm = "PM";
                    }
                    jLabelDate.setText(date);
                    jLabelTime.setText(time+" "+ am_pm);
                }

               
            });
            timer.start();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
