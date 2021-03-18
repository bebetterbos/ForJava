import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test7_3 implements ActionListener {
    JLabel numberLabel;
    String op = " ";
    JTextField numberField;
    JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnc, a1, a2, a3, a4, a5, percent, CE, dot, a9,
            a10, a11, a12, pm;
    JFrame window;

    public Test7_3() {
        // obtain content pane and set its layout to FlowLayout
        window = new JFrame("Programm Show Text");
        Container container = window.getContentPane();
        container.setLayout(new FlowLayout());
        // create numberLabel and attach it to content pane
        numberLabel = new JLabel("Show Number : ");
        container.add(numberLabel);
        numberField = new JTextField(25);
        // numberField.setEditable( false );
        container.add(numberField);

        percent = new JButton(" % ");
        percent.addActionListener(this);
        percent.setPreferredSize(new Dimension(70, 70));
        container.add(percent);

        CE = new JButton(" CE ");
        CE.addActionListener(this);
        CE.setPreferredSize(new Dimension(70, 70));
        container.add(CE);

        btnc = new JButton(" C ");
        btnc.addActionListener(this);
        btnc.setPreferredSize(new Dimension(70, 70));
        container.add(btnc);

        a9 = new JButton(" <- ");
        a9.addActionListener(this);
        a9.setPreferredSize(new Dimension(70, 70));
        container.add(a9);

        a10 = new JButton(" 1/x ");
        a10.addActionListener(this);
        a10.setPreferredSize(new Dimension(70, 70));
        container.add(a10);

        a11 = new JButton(" x^2 ");
        a11.addActionListener(this);
        a11.setPreferredSize(new Dimension(70, 70));
        container.add(a11);

        a12 = new JButton(" 2√x ");
        a12.addActionListener(this);
        a12.setPreferredSize(new Dimension(70, 70));
        container.add(a12);

        a4 = new JButton(" / ");
        a4.addActionListener(this);
        a4.setPreferredSize(new Dimension(70, 70));
        container.add(a4);

        btn7 = new JButton(" 7 ");
        btn7.addActionListener(this);
        btn7.setPreferredSize(new Dimension(70, 70));
        container.add(btn7);

        btn8 = new JButton(" 8 ");
        btn8.addActionListener(this);
        btn8.setPreferredSize(new Dimension(70, 70));
        container.add(btn8);

        btn9 = new JButton(" 9 ");
        btn9.addActionListener(this);
        btn9.setPreferredSize(new Dimension(70, 70));
        container.add(btn9);

        a3 = new JButton(" * ");
        a3.addActionListener(this);
        a3.setPreferredSize(new Dimension(70, 70));
        container.add(a3);

        btn4 = new JButton(" 4 ");
        btn4.addActionListener(this);
        btn4.setPreferredSize(new Dimension(70, 70));
        container.add(btn4);

        btn5 = new JButton(" 5 ");
        btn5.addActionListener(this);
        btn5.setPreferredSize(new Dimension(70, 70));
        container.add(btn5);

        btn6 = new JButton(" 6 ");
        btn6.addActionListener(this);
        btn6.setPreferredSize(new Dimension(70, 70));
        container.add(btn6);

        a2 = new JButton(" - ");
        a2.addActionListener(this);
        a2.setPreferredSize(new Dimension(70, 70));
        container.add(a2);

        btn1 = new JButton(" 1 ");
        btn1.addActionListener(this);
        btn1.setPreferredSize(new Dimension(70, 70));
        container.add(btn1);

        btn2 = new JButton(" 2 ");
        btn2.addActionListener(this);
        btn2.setPreferredSize(new Dimension(70, 70));
        container.add(btn2);

        btn3 = new JButton(" 3 ");
        btn3.addActionListener(this);
        btn3.setPreferredSize(new Dimension(70, 70));
        container.add(btn3);

        a1 = new JButton(" + ");
        a1.addActionListener(this);
        a1.setPreferredSize(new Dimension(70, 70));
        container.add(a1);

        pm = new JButton(" +/- ");
        pm.addActionListener(this);
        pm.setPreferredSize(new Dimension(70, 70));
        container.add(pm);

        btn0 = new JButton(" 0 ");
        btn0.addActionListener(this);
        btn0.setPreferredSize(new Dimension(70, 70));
        container.add(btn0);

        dot = new JButton(" . ");
        dot.addActionListener(this);
        dot.setPreferredSize(new Dimension(70, 70));
        container.add(dot);

        a5 = new JButton(" = ");
        a5.addActionListener(this);
        a5.setPreferredSize(new Dimension(70, 70));
        container.add(a5);

        window.setSize(320, 550);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        String str = numberField.getText();
        if (event.getSource() == btn0) {
            str += "0";
            numberField.setText(str);
        } else if (event.getSource() == btn1) {
            str += "1";
            numberField.setText(str);
        } else if (event.getSource() == btn2) {
            str += "2";
            numberField.setText(str);
        } else if (event.getSource() == btn3) {
            str += "3";
            numberField.setText(str);
        } else if (event.getSource() == btn4) {
            str += "4";
            numberField.setText(str);
        } else if (event.getSource() == btn5) {
            str += "5";
            numberField.setText(str);
        } else if (event.getSource() == btn6) {
            str += "6";
            numberField.setText(str);
        } else if (event.getSource() == btn7) {
            str += "7";
            numberField.setText(str);
        } else if (event.getSource() == btn8) {
            str += "8";
            numberField.setText(str);
        } else if (event.getSource() == btn9) {
            str += "9";
            numberField.setText(str);
        } else if (event.getSource() == btnc) {
            str = " ";
            numberField.setText(str);
        }

        else if (event.getSource() == a1) {
            str += " + ";
            numberField.setText(str);
        } else if (event.getSource() == a2) {
            str += " - ";
            numberField.setText(str);
        } else if (event.getSource() == a3) {
            str += " * ";
            numberField.setText(str);
        } else if (event.getSource() == a4) {
            str += " / ";
            numberField.setText(str);
        }
        // if (!event.equals(a5)) {
        // cl.number = temp;
        // cl.op = opText.charAt(0);
        // return;
        // }

    } // end method actionPerformed

    public static void main(String[] args) {
        Test7_3 gui = new Test7_3();
    }
}
