import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test5_15_1 implements ActionListener {
    JLabel number1Label, number2Label, resultLabel, oper1lJLabel;
    JTextField number1Field, number2Field, resultField, oper1Field;
    JButton btn1, btn2, btn3, btn4;
    JFrame window;

    /** Creates a new instance of Test5_15 */
    public Test5_15_1() {
        window = new JFrame("Summation number Swing Application");
        // obtain content pane and set its layout to FlowLayout
        Container container = window.getContentPane();
        container.setLayout(new FlowLayout());
        // create numberLabel and attach it to content pane

        number1Label = new JLabel("Enter number 1 ");
        container.add(number1Label);
        number1Field = new JTextField(10);
        container.add(number1Field);

        number2Label = new JLabel("Enter number 2 ");
        container.add(number2Label);
        number2Field = new JTextField(10);
        container.add(number2Field);

        oper1lJLabel = new JLabel("Enter Operater ");
        container.add(oper1lJLabel);
        oper1Field = new JTextField(10);
        container.add(oper1Field);

        resultLabel = new JLabel("Result value is");
        container.add(resultLabel);
        resultField = new JTextField(15);
        resultField.setEditable(false);
        container.add(resultField);

        btn2 = new JButton(" Calculator ");
        btn2.addActionListener(this);
        container.add(btn2);

        window.setSize(300, 200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        int num1 = Integer.parseInt(number1Field.getText());
        int num2 = Integer.parseInt(number2Field.getText());
        String operate = (oper1Field.getText());

        switch (operate) {
        case "+":
            resultField.setText(Integer.toString(num1 + num2));
            break;
        case "-":
            resultField.setText(Integer.toString(num1 - num2));
            break;
        case "*":
            resultField.setText(Integer.toString(num1 * num2));
            break;
        case "/":
            resultField.setText(Integer.toString(num1 / num2));
            break;
        }

    } // end method actionPerformed

    public static void main(String[] args) {
        Test5_15_1 gui = new Test5_15_1();
    }
}