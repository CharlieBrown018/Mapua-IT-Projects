/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Imports Used
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Migo
 */

public class CalculatorApp extends JPanel implements ActionListener {

    // Creating a Constructor for Calculator
    // Implementing All Components
    JTextField tx1;
    JLabel background;
    JButton[] numB = new JButton [10];
    JButton[] funcB = new JButton [9];
    JButton add, sub, mul,div, home;
    JButton dec, equal, del, clr;
    JPanel panel, calcpanel;
    
    //variables
    ImageIcon bgimg = new ImageIcon ("src/Frames/Calculator_LM.png");
    ImageIcon homeicon = new ImageIcon ("src/Buttons/Calculator_LM.png");
    
    
    // declaring Fonts for the Calculator
    Font myFont = new Font ("Ink Free", Font.BOLD,30);
    double num1 = 0, num2 = 0, result = 0;
    char operator;
    
    CalculatorApp(){
        setLayout(null);
        setSize(1080,720);// setting the size of the JFrame
        
        /*home = new JButton("Home");        
        home.setSize(120, 80);
        home.setIcon(bgimg);
        home.setOpaque(false);
        home.setLocation(25, 30);
        home.addActionListener(this);*/

        calcpanel = new JPanel();
        background = new JLabel();
        
        background.setLayout(null);
        background.setSize(1080,720);
        background.setIcon(bgimg);
        background.setLocation(0, 0);
        
        calcpanel.setLocation(200, 50);
        calcpanel.setSize(450,550);// setting the size of the JFrame
        calcpanel.setOpaque(false);
        calcpanel.setLayout(null); // setting the layout of the JFrame
        
        tx1 = new JTextField(); // declaring tx1 as new TextField
        tx1.setBounds(50,25,300,50); // setting the bounds
        tx1.setFont(myFont); // setting the font
        tx1.setEditable(false); // the textfield will not be edited
        add = new JButton ("+"); // this is the addition in the calculator
        sub = new JButton ("-"); // this is the subtraction in the calculator
        mul = new JButton ("*"); // this is the multiplication in the calculator
        div = new JButton ("/"); // this is the division in the calculator
        dec = new JButton ("."); // this is the decimal in the calculator
        equal = new JButton ("="); // this is the equal in the calculator
        del = new JButton ("Delete"); // this is the delete in the calculator
        clr = new JButton ("Clear"); // this is the clear screen in the calculator
       
        funcB[0] = add; // this is use to call for addition
        funcB[1] = sub; // this is use to call for subtraction
        funcB[2] = mul; // this is use to call for multiplication
        funcB[3] = div; // this is use to call for division
        funcB[4] = dec; // this is use to call for decimal
        funcB[5] = equal; // this is use to call for equal
        funcB[6] = del; // this is use to call for delete
        funcB[7] = clr; // this is use to call for clear screen
        
        for (int i =0;i<8;i++)
        {
            funcB[i].addActionListener(this); // adding action listener to functions in the calculator
            funcB[i].setFont(myFont); // setting the font
            funcB[i].setFocusable(false); // setting the focus into false
        }
        
         for (int i =0;i<10;i++)
        {
            numB[i] = new JButton(String.valueOf(i));
            numB[i].addActionListener(this); // adding action listener to functions in the calculator
            numB[i].setFont(myFont); // setting the font
            numB[i].setFocusable(false); // setting the focus into false
        }
         
            del.setBounds(50,430,135,50); // setting the bounds of delete button in calculator
            clr.setBounds(205,430,145,50); // setting the bounds of clear button in calculator
            
            
            panel = new JPanel(); // creating the panel variable for JPanel
            panel.setBounds(50,100,300,300); // setting the bounds
            panel.setLayout(new GridLayout(4,4,10,10)); // setting the layout
            panel.setBackground(Color.GRAY); // setting the color
            
            // first row
            panel.add(numB[1]);
            panel.add(numB[2]);
            panel.add(numB[3]);
            panel.add(add);
            
            // second row
            panel.add(numB[4]);
            panel.add(numB[5]);
            panel.add(numB[6]);
            panel.add(sub);
            
            // third row
            panel.add(numB[7]);
            panel.add(numB[8]);
            panel.add(numB[9]);
            panel.add(mul);
            panel.add(dec);
            panel.add(numB[0]);
            panel.add(equal);
            panel.add(div);
            
            calcpanel.add(panel);
            // adding the components to the JFRame
            calcpanel.add(del); 
            calcpanel.add(clr);
            calcpanel.add(tx1);
            calcpanel.add(tx1); // adding the textfield to the JPanel   
            
            calcpanel.add(panel);
            calcpanel.setOpaque(false);
            panel.setOpaque(false);
           // background.add(home);
            background.add(calcpanel);

            //background.setVisible(true);
            add(background);
      
            setVisible(true);
        
    }
  

    
    public void actionPerformed(ActionEvent e) {
             
        for(int i=0;i<10;i++) // using a for loop for every number
                             // in the calculator
        {
            if(e.getSource() == numB[i]) // if the value is equal to the numB index
                                         // it will display on the textfield
            {
                tx1.setText(tx1.getText().concat(String.valueOf(i)));
            }
            
        }
        if(e.getSource() == dec)
        {
            tx1.setText(tx1.getText().concat(".")); // if the value is equal to dec
                                                    // it will display on the textfield
        }
         if(e.getSource() == add) // if source is equal to add, then
                                  // it will set the operator to addition
        {
            num1 = Double.parseDouble(tx1.getText());                                 // it will set the operator to addition
            operator = '+';
            tx1.setText("");
        }
         if(e.getSource() == sub) // if the source is equal to subtract
                                  // it will set the operator into subtraction
        {
            num1 = Double.parseDouble(tx1.getText()); 
            operator = '-';
            tx1.setText("");
        }
         if(e.getSource() == mul) // if the source is equal to multiply
        {                         // it will set the operator into multiplication
            num1 = Double.parseDouble(tx1.getText()); 
            operator = '*';
            tx1.setText("");
        }
         if(e.getSource() == div) // if the source is equal to divide
        {                         // it will set the operator into division
            num1 = Double.parseDouble(tx1.getText()); 
            operator = '/';
            tx1.setText("");
        }
        if(e.getSource()== equal)
        {
            num2 = Double.parseDouble(tx1.getText());
            
            switch(operator) // determining which operator will be used in the calculator
            {
                case '+': // addition
                    result= num1+num2;
                    break;
                case '-':  // subtraction
                    result= num1-num2;
                    break;
                case '*':  // multiplication
                    result= num1*num2;
                    break;
                case '/':  // division
                    result= num1/num2;
                    break;
            }
            tx1.setText(String.valueOf(result)); // displaying the result
            num1 = result;
        }
          if(e.getSource() == clr) // if the source is equal to clear screen
        {                         // it will set the textfield blank;
            tx1.setText("");
        }
           if(e.getSource() == del) // if the source is del to clear screen
        {                         // it will delete the values in the textfield;
               String string = tx1.getText();
               tx1.setText("");
               
            //  itierate the length of the string   
            for(int i=0; i<string.length()-1;i++)
            {
                tx1.setText(tx1.getText()+string.charAt(i)); // return the char value
            }
          
        }   
        if(e.getSource() == home) // if the source is equal to clear screen
        {                         // it will set the textfield blank;
            //this.setVisible(false);
            Main main = new Main();
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    main.setVisible(true);
                }
            });
        }
}
}
