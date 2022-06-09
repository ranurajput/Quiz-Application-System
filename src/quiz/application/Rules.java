/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    JButton b1, b2;
    String username;
    Rules(String username){
        this.username = username;
        setBounds(600, 200, 800, 730);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel l1 = new JLabel("Welcome " + username + " to Quiz Application");
        l1.setForeground(new Color(30, 144, 255));
        l1.setFont(new Font("Segoe Print", Font.BOLD, 32));
        l1.setBounds(30, 40, 800, 55);
        add(l1);
        
        JLabel l2 = new JLabel("");
        l2.setFont(new Font("Segoe Print", Font.BOLD, 18));
        l2.setBounds(20, 60, 780, 570);
        l2.setText(
            "<html>"+
                    "1. You are trained to a programmer not a story teller , answer point to point" + "<br></br>" + 
                    "2. All the Questions are compulsory" + "<br></br>" +
                    "3. You may have a lot of options in life but here are only four options. so, Choose wisely one option" + "<br></br>" + 
                    "4. Only a fool asks and a wise answers(Be wise, not otherwise)" + "<br></br>" +
                    "5. Do not get nervous if your friend is answering more questions, may be he/she is doing JAI MATA DI" + "<br></br>" +
                    "6. Trust on your mind. And give answer correctly" + "<br></br>" +
                    "9. There are total 10 Questions" + "<br></br>" +
                    "8. Each question is of 10 marks" + "<br></br>" +
                    "9. Be confident" + "<br></br>" +
                    "10. All the very Best !!!" + "<br></br>" +
            "<html>" 
        );
        add(l2);
        
        b1 = new JButton("Back");
        b1.setBounds(250, 570, 100, 30);
        b1.setBackground(new Color(30, 144, 255));
        b1.setFont(new Font("Segoe Print", Font.BOLD, 18));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Start");
        b2.setBounds(400, 570, 100, 30);
        b2.setBackground(new Color(30, 144, 255));
        b2.setFont(new Font("Segoe Print", Font.BOLD, 18));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            this.setVisible(false);
            new QuizApplication().setVisible(true);
        }else if(ae.getSource() == b2){
            this.setVisible(false);
            new Quiz(username).setVisible(true);
        }
    }
    
    public static void main(String[] args){
        new Rules("");
    }
}