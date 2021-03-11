import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

public class Test5_13 {

    public static void main(String[] args) {

        JFrame window = new JFrame("Using Swing Application");

        JTextArea textArea1, textArea2, textArea3;

        JTextField textField1, textField2;

        JLabel label1, label2;

        JButton btn1, btn2;

        JScrollPane scroller;

        textArea1 = new JTextArea(10, 10);

        textArea1.setText("This is JTextArea");

        textArea2 = new JTextArea(10, 10);

        textArea2.setText("This is JTextArea with JScrollPane");
        textArea3 = new JTextArea(10, 10);

        textArea3.setText("This is JTextArea");

        textField1 = new JTextField(10);

        textField1.setText("This is JTextField");

        textField2 = new JTextField(10);

        textField2.setText("This is JTextField");

        label1 = new JLabel(">> String 1 create by JLabel <<");

        label2 = new JLabel(">> String 2 create by JLabel <<");

        btn1 = new JButton(" OK ");

        btn2 = new JButton("This is Botton");

        scroller = new JScrollPane(textArea2);

        Container c = window.getContentPane();

        c.setLayout(new FlowLayout());
        c.add(label1);

        c.add(textField1);

        c.add(label2);

        c.add(textField2);

        c.add(textArea1);

        c.add(scroller);

        c.add(textArea3);

        c.add(btn1);

        c.add(btn2);

        window.setSize(400, 350);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setVisible(true);
    }
}