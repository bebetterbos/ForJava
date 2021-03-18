import java.awt.*;
import java.awt.event.*;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.*;
import javax.swing.JScrollPane;

public class Test7_1 extends JFrame {
    JLabel numberLabel, resultLabel, numberLabel2;
    JTextField numberField, numberField2;
    JTextArea resultArea;

    public Test7_1() {
        // title bar in window
        super("Program display value n");
        // obtain content pane and set its layout to FlowLayout
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        // create numberLabel and attach it to content pane
        numberLabel = new JLabel("Enter integer and press Enter");
        container.add(numberLabel);
        // create numberField and attach it to content pane
        numberField = new JTextField(10);
        container.add(numberField);

        numberLabel2 = new JLabel("Enter integer of number blank");
        container.add(numberLabel2);
        numberField2 = new JTextField(10);
        container.add(numberField2);
        // register this applet as numberField’s ActionListener
        numberField2.addActionListener(
                // create inner class
                new ActionListener() {
                    public void actionPerformed(ActionEvent event) {
                        int number, number2, sumValue;
                        String blank5 = " ";
                        number = Integer.parseInt(numberField.getText());
                        number2 = Integer.parseInt(numberField2.getText());

                        resultArea.setText("");
                        for (int b = 1; b <= number2; b++) {
                            blank5 += " ";

                        }

                        for (int n = 1; n <= number; n++) {
                            resultArea.append(blank5 + Integer.toString(n));
                            if (n % 5 == 0)
                                resultArea.append("\n");
                        }

                        numberField.setText("");
                    }
                });

        resultArea = new JTextArea(10, 20);
        resultArea.setEditable(false);
        container.add(resultArea);
    }

    public static void main(String[] args) {
        Test7_1 window = new Test7_1();
        window.setSize(400, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

        JScrollPane scrollableTextArea = new JScrollPane(window.resultArea);

        scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        window.add(scrollableTextArea);
    }
}