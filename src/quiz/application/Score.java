package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
    
    Score(String username, int score){
        setBounds(600, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("quiz/application/icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 200, 300, 250);
        add(l1);
        
        JLabel l2 = new JLabel("THANK YOU " + username + " FOR PLAYING QUIZ");
        l2.setBounds(45, 50, 750, 50);
        l2.setFont(new Font("Segoe Print", Font.BOLD, 26));
        l2.setForeground(new Color(30, 144, 254));
        add(l2);
        
        JLabel l3 = new JLabel("Your Score is " + score);
        l3.setBounds(400, 200, 300, 30);
        l3.setFont(new Font("Segoe Print", Font.BOLD, 26));
        l3.setForeground(new Color(199, 21, 133));
        add(l3);
        
        JButton b1 = new JButton("Play Again");
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Segoe Print", Font.BOLD, 20));
        b1.addActionListener(this);
        
        b1.setBounds(400, 270, 220, 40);
        add(b1);
    }
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
        new QuizApplication().setVisible(true);
    }
    
    public static void main(String[] args){
        new Score("", 0).setVisible(true);
    }
}