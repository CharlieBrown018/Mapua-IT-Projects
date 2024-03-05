
package MyApp;

import MyLibs.Equipment;
import MyLibs.MySqlClass;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class PurchaseForm extends javax.swing.JFrame {
    private MySqlClass mySql=new MySqlClass();
    
       //this is the method that contains the window listener
       public void listener(ArrayList<Equipment> equips) {
        WindowListener taskStarterWindowListener = new WindowListener() {
        @Override
        //executes when window is opened
        public void windowOpened(WindowEvent e) {
            System.out.println("Performing task...");
            runPurchaseForm(equips);
        }

        @Override
        //executes when window is closing
        public void windowClosing(WindowEvent e) {
            //do nothing
        }

        @Override
        //executes when window is closed
        public void windowClosed(WindowEvent e) {
        }

        @Override
        //executes when window is minimized
        public void windowIconified(WindowEvent e) {
        }

        @Override
        //executes when window is not minimized
        public void windowDeiconified(WindowEvent e) {
        }

        @Override
            //executes when window is activated
        public void windowActivated(WindowEvent e) {
        }

        @Override
            //executes when window is deactivated
        public void windowDeactivated(WindowEvent e) {
        }
    };
    this.addWindowListener(taskStarterWindowListener);
}

    /**
     * Creates new form PurchaseForm
     */
    public PurchaseForm() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        lbl15 = new javax.swing.JLabel();
        lbl30 = new javax.swing.JLabel();
        lbl45 = new javax.swing.JLabel();
        lbl60 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        lbl16 = new javax.swing.JLabel();
        lbl31 = new javax.swing.JLabel();
        lbl46 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        lbl2 = new javax.swing.JLabel();
        lbl17 = new javax.swing.JLabel();
        lbl32 = new javax.swing.JLabel();
        lbl47 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        lbl3 = new javax.swing.JLabel();
        lbl18 = new javax.swing.JLabel();
        lbl33 = new javax.swing.JLabel();
        lbl49 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        lbl4 = new javax.swing.JLabel();
        lbl19 = new javax.swing.JLabel();
        lbl34 = new javax.swing.JLabel();
        lbl48 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        lbl5 = new javax.swing.JLabel();
        lbl20 = new javax.swing.JLabel();
        lbl35 = new javax.swing.JLabel();
        lbl50 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        lbl6 = new javax.swing.JLabel();
        lbl21 = new javax.swing.JLabel();
        lbl36 = new javax.swing.JLabel();
        lbl51 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        lbl7 = new javax.swing.JLabel();
        lbl22 = new javax.swing.JLabel();
        lbl37 = new javax.swing.JLabel();
        lbl52 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        lbl8 = new javax.swing.JLabel();
        lbl23 = new javax.swing.JLabel();
        lbl38 = new javax.swing.JLabel();
        lbl53 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        lbl9 = new javax.swing.JLabel();
        lbl24 = new javax.swing.JLabel();
        lbl39 = new javax.swing.JLabel();
        lbl54 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        lbl10 = new javax.swing.JLabel();
        lbl25 = new javax.swing.JLabel();
        lbl40 = new javax.swing.JLabel();
        lbl55 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        lbl11 = new javax.swing.JLabel();
        lbl26 = new javax.swing.JLabel();
        lbl41 = new javax.swing.JLabel();
        lbl57 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        lbl12 = new javax.swing.JLabel();
        lbl27 = new javax.swing.JLabel();
        lbl42 = new javax.swing.JLabel();
        lbl56 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        lbl13 = new javax.swing.JLabel();
        lbl28 = new javax.swing.JLabel();
        lbl43 = new javax.swing.JLabel();
        lbl58 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        lbl14 = new javax.swing.JLabel();
        lbl29 = new javax.swing.JLabel();
        lbl44 = new javax.swing.JLabel();
        lbl59 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setTitle("Equipment List");
        setBackground(new java.awt.Color(245, 232, 228));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 30, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Office");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Condition");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, -1));

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel11.add(lbl15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 30));

        lbl30.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel11.add(lbl30, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 170, 30));

        lbl45.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel11.add(lbl45, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 250, 30));

        lbl60.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel11.add(lbl60, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 140, 30));

        getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 700, 30));

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel12.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 140, 30));

        lbl16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel12.add(lbl16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 30));

        lbl31.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel12.add(lbl31, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 170, 30));

        lbl46.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel12.add(lbl46, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 240, 30));

        getContentPane().add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 700, 30));

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel13.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 30));

        lbl17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel13.add(lbl17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 170, 30));

        lbl32.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel13.add(lbl32, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 250, 30));

        lbl47.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel13.add(lbl47, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 140, 30));

        getContentPane().add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 700, 30));

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel14.add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 30));

        lbl18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel14.add(lbl18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 170, 30));

        lbl33.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel14.add(lbl33, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 250, 30));

        lbl49.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel14.add(lbl49, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 140, 30));

        getContentPane().add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 700, 30));

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel15.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 28));

        lbl19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel15.add(lbl19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 170, 30));

        lbl34.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel15.add(lbl34, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 250, 30));

        lbl48.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel15.add(lbl48, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 140, 30));

        getContentPane().add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 700, 30));

        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel16.add(lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 77, 28));

        lbl20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel16.add(lbl20, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 170, 30));

        lbl35.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel16.add(lbl35, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 250, 30));

        lbl50.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel16.add(lbl50, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 140, 30));

        getContentPane().add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 700, 30));

        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel17.add(lbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 87, 30));

        lbl21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel17.add(lbl21, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 170, 30));

        lbl36.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel17.add(lbl36, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 250, 30));

        lbl51.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel17.add(lbl51, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 140, 30));

        getContentPane().add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 700, 30));

        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel18.add(lbl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 78, 28));

        lbl22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel18.add(lbl22, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 170, 30));

        lbl37.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel18.add(lbl37, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 250, 30));

        lbl52.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel18.add(lbl52, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 140, 30));

        getContentPane().add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 700, 30));

        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel19.add(lbl8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 75, 28));

        lbl23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel19.add(lbl23, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 170, 30));

        lbl38.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel19.add(lbl38, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 250, 30));

        lbl53.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel19.add(lbl53, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 140, 30));

        getContentPane().add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 700, 30));

        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel20.add(lbl9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 77, 30));

        lbl24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel20.add(lbl24, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 170, 30));

        lbl39.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel20.add(lbl39, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 250, 30));

        lbl54.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel20.add(lbl54, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 140, 30));

        getContentPane().add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 700, 30));

        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel21.add(lbl10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 30));

        lbl25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel21.add(lbl25, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 170, 30));

        lbl40.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel21.add(lbl40, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 250, 30));

        lbl55.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel21.add(lbl55, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 140, 30));

        getContentPane().add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 700, 30));

        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel22.add(lbl11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 30));

        lbl26.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel22.add(lbl26, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 170, 30));

        lbl41.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel22.add(lbl41, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 250, 30));

        lbl57.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel22.add(lbl57, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 140, 30));

        getContentPane().add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 700, 30));

        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel23.add(lbl12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 30));

        lbl27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel23.add(lbl27, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 170, 30));

        lbl42.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel23.add(lbl42, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 250, 30));

        lbl56.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel23.add(lbl56, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 140, 30));

        getContentPane().add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 700, 30));

        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel24.add(lbl13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 30));

        lbl28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel24.add(lbl28, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 170, 30));

        lbl43.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel24.add(lbl43, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 250, 30));

        lbl58.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel24.add(lbl58, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 140, 30));

        getContentPane().add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 700, 30));

        jPanel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel25.add(lbl14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 30));

        lbl29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel25.add(lbl29, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 170, 30));

        lbl44.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel25.add(lbl44, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 250, 30));

        lbl59.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel25.add(lbl59, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 140, 30));

        getContentPane().add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 700, 30));

        jPanel1.setBackground(new java.awt.Color(65, 21, 48));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Purchase Report");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(jLabel4)
                .addContainerGap(275, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, 700, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //method that will populate the set jLabels
    public void runPurchaseForm(ArrayList<Equipment> equips) {
        //Create and display the form
        int size = equips.size();   //gets the length of the array list equips
        //sets data on jLabels
        for(int num = 0;num<size;num++)
            if(num == 0){
                lbl16.setText(String.valueOf(equips.get(num).getEQNum()));
                lbl31.setText(equips.get(num).getEQName());
                lbl46.setText(equips.get(num).getEQCondition());
                lbl1.setText(equips.get(num).getOffice().OfficeName());
            }
            else if(num == 1){
                lbl2.setText(String.valueOf(equips.get(num).getEQNum()));
                lbl17.setText(equips.get(num).getEQName());
                lbl32.setText(equips.get(num).getEQCondition());
                lbl47.setText(equips.get(num).getOffice().OfficeName());
                
            }
            else if(num == 2){
                lbl3.setText(String.valueOf(equips.get(num).getEQNum()));
                lbl18.setText(equips.get(num).getEQName());
                lbl33.setText(equips.get(num).getEQCondition());
                lbl49.setText(equips.get(num).getOffice().OfficeName());
            }
            else if(num == 3){
                lbl4.setText(String.valueOf(equips.get(num).getEQNum()));
                lbl19.setText(equips.get(num).getEQName());
                lbl34.setText(equips.get(num).getEQCondition());
                lbl48.setText(equips.get(num).getOffice().OfficeName());
            }
            else if(num == 4){
                lbl5.setText(String.valueOf(equips.get(num).getEQNum()));
                lbl20.setText(equips.get(num).getEQName());
                lbl35.setText(equips.get(num).getEQCondition());
                lbl50.setText(equips.get(num).getOffice().OfficeName());
            }
            else if(num == 5){
                lbl6.setText(String.valueOf(equips.get(num).getEQNum()));
                lbl21.setText(equips.get(num).getEQName());
                lbl36.setText(equips.get(num).getEQCondition());
                lbl51.setText(equips.get(num).getOffice().OfficeName());
            }
            else if(num == 6){
                lbl7.setText(String.valueOf(equips.get(num).getEQNum()));
                lbl22.setText(equips.get(num).getEQName());
                lbl37.setText(equips.get(num).getEQCondition());
                lbl52.setText(equips.get(num).getOffice().OfficeName());
            }
            else if(num == 7){
                lbl8.setText(String.valueOf(equips.get(num).getEQNum()));
                lbl23.setText(equips.get(num).getEQName());
                lbl38.setText(equips.get(num).getEQCondition());
                lbl53.setText(equips.get(num).getOffice().OfficeName());
            }
            else if(num == 8){
                lbl9.setText(String.valueOf(equips.get(num).getEQNum()));
                lbl24.setText(equips.get(num).getEQName());
                lbl39.setText(equips.get(num).getEQCondition());
                lbl54.setText(equips.get(num).getOffice().OfficeName());
            }
            else if(num == 9){
                lbl10.setText(String.valueOf(equips.get(num).getEQNum()));
                lbl25.setText(equips.get(num).getEQName());
                lbl40.setText(equips.get(num).getEQCondition());
                lbl55.setText(equips.get(num).getOffice().OfficeName());
            }
            else if(num == 10){
                lbl11.setText(String.valueOf(equips.get(num).getEQNum()));
                lbl26.setText(equips.get(num).getEQName());
                lbl41.setText(equips.get(num).getEQCondition());
                lbl57.setText(equips.get(num).getOffice().OfficeName());
            }
            else if(num == 11){
                lbl12.setText(String.valueOf(equips.get(num).getEQNum()));
                lbl27.setText(equips.get(num).getEQName());
                lbl42.setText(equips.get(num).getEQCondition());
                lbl56.setText(equips.get(num).getOffice().OfficeName());
            }
            else if(num == 12){
                lbl13.setText(String.valueOf(equips.get(num).getEQNum()));
                lbl28.setText(equips.get(num).getEQName());
                lbl43.setText(equips.get(num).getEQCondition());
                lbl58.setText(equips.get(num).getOffice().OfficeName());
            }
            else if(num == 13){
                lbl14.setText(String.valueOf(equips.get(num).getEQNum()));
                lbl29.setText(equips.get(num).getEQName());
                lbl44.setText(equips.get(num).getEQCondition());
                lbl59.setText(equips.get(num).getOffice().OfficeName());
            }
            else if(num == 14){
                lbl15.setText(String.valueOf(equips.get(num).getEQNum()));
                lbl30.setText(equips.get(num).getEQName());
                lbl45.setText(equips.get(num).getEQCondition());
                lbl60.setText(equips.get(num).getOffice().OfficeName());
            }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl12;
    private javax.swing.JLabel lbl13;
    private javax.swing.JLabel lbl14;
    private javax.swing.JLabel lbl15;
    private javax.swing.JLabel lbl16;
    private javax.swing.JLabel lbl17;
    private javax.swing.JLabel lbl18;
    private javax.swing.JLabel lbl19;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl20;
    private javax.swing.JLabel lbl21;
    private javax.swing.JLabel lbl22;
    private javax.swing.JLabel lbl23;
    private javax.swing.JLabel lbl24;
    private javax.swing.JLabel lbl25;
    private javax.swing.JLabel lbl26;
    private javax.swing.JLabel lbl27;
    private javax.swing.JLabel lbl28;
    private javax.swing.JLabel lbl29;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl30;
    private javax.swing.JLabel lbl31;
    private javax.swing.JLabel lbl32;
    private javax.swing.JLabel lbl33;
    private javax.swing.JLabel lbl34;
    private javax.swing.JLabel lbl35;
    private javax.swing.JLabel lbl36;
    private javax.swing.JLabel lbl37;
    private javax.swing.JLabel lbl38;
    private javax.swing.JLabel lbl39;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl40;
    private javax.swing.JLabel lbl41;
    private javax.swing.JLabel lbl42;
    private javax.swing.JLabel lbl43;
    private javax.swing.JLabel lbl44;
    private javax.swing.JLabel lbl45;
    private javax.swing.JLabel lbl46;
    private javax.swing.JLabel lbl47;
    private javax.swing.JLabel lbl48;
    private javax.swing.JLabel lbl49;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl50;
    private javax.swing.JLabel lbl51;
    private javax.swing.JLabel lbl52;
    private javax.swing.JLabel lbl53;
    private javax.swing.JLabel lbl54;
    private javax.swing.JLabel lbl55;
    private javax.swing.JLabel lbl56;
    private javax.swing.JLabel lbl57;
    private javax.swing.JLabel lbl58;
    private javax.swing.JLabel lbl59;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl60;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    // End of variables declaration//GEN-END:variables
}