package quiz.application;
/**
 * @author Ranu Rajput
 * @version 11
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuizApplication extends JFrame implements ActionListener{
    
    JButton b1, b2;
    JTextField t1;
    QuizApplication(){
        setBounds(400, 200, 1200, 500); // dleft, //dup // length, height ///////
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("quiz/application/icons/login.jpeg"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0, 0, 600, 500);
        add(l1);
        
        JLabel l2 = new JLabel("Quiz Application");
        l2.setFont(new Font("Segoe Print", Font.BOLD, 45));
        l2.setForeground(new Color(30, 144, 254));
        l2.setBounds(700, 60, 500, 65);
        add(l2);
        
        JLabel l3 = new JLabel("Enter Your Name");
        l3.setFont(new Font("Segoe Print", Font.BOLD, 28));
        l3.setForeground(new Color(30, 144, 254));
        l3.setBounds(755, 150, 350, 30);
        add(l3);
        
        t1 = new JTextField();
        t1.setBounds(735, 215, 300, 30);
        t1.setFont(new Font("Segoe Print", Font.BOLD, 20));
        add(t1);
        
        b1 = new JButton("Rules");
        b1.setBounds(735, 270, 120, 35);
        b1.setBackground(new Color(30, 144, 254));
        b1.setFont(new Font("Segoe Print", Font.BOLD, 18));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Exit");
        b2.setBounds(915, 270, 120, 35);
        b2.setBackground(new Color(30, 144, 254));
        b2.setFont(new Font("Segoe Print", Font.BOLD, 18));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            String name = t1.getText();
            this.setVisible(false);
            new Rules(name);
        }else{
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new QuizApplication();
    }
    
}