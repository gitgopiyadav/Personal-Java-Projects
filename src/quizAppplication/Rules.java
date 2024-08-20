package quizAppplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {

    String name;
    JButton start, back;
    Rules(String name){
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Welcome " + name + " to QuizBuzz");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 255));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20, 20, 700, 600);
        rules.setFont(new Font("Tahoma", Font.PLAIN , 16));
        rules.setText(
                "<html>"+
                        "1. Participants must be registered and verified before the quiz begins. Only one entry per participant is allowed." + "<br><br>" +
                        "2. The quiz will consist of multiple-choice questions and/or coding problems.Each question will have a specified time limit." + "<br><br>" +
                        "3. Participants must work independently and avoid using external help or resources.Any form of cheating or plagiarism will result in disqualification." + "<br><br>" +
                        "4. Answers must be submitted within the allotted time for each question.Late submissions will not be accepted or scored." + "<br><br>" +
                        "5. Points will be awarded based on the correctness and efficiency of the solution.Partial credit may be given for partially correct answers." + "<br><br>" +
                        "6. In case of a tie, the participant who completed the quiz in the shortest time will be declared the winner.If a tie still exists, additional tiebreaker questions may be administered." + "<br><br>" +
                        "7. Participants are responsible for ensuring a stable internet connection and functioning hardware/software." + "<br><br>" +
                        "8. Any disputes or issues must be reported to the quiz administrator within 24 hours of the quiz completion." + "<br><br>" +
                "<html>"
        );
        add(rules);


        back = new JButton("Back");
        back.setBounds(300, 550, 100, 30);
        back.setBackground(new Color(30, 144, 255));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);


        start = new JButton("Start");
        start.setBounds(450, 550, 100, 30);
        start.setBackground(new Color(30, 144, 255));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);

        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);


    }


    public void actionPerformed(ActionEvent ae) {

        if(ae.getSource()== start){
            setVisible(false);
            new Quiz(name);
        }else {
            setVisible(false);
            new Login();
        }

    }

    public static void main(String[] args) {
        new Rules("user");
    }


}
