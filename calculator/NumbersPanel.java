package calculator;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumbersPanel extends JPanel implements ActionListener {

    private JTextField txtText;
        public NumbersPanel(JTextField txtNumber) {
            this.txtText = txtNumber;

            setLayout(new GridLayout(4, 3));

            JButton btn1 = new JButton("1");
            btn1.addActionListener(this);
            btn1.setContentAreaFilled(false);
            btn1.setOpaque(true);
            btn1.setBackground(Color.GRAY);
            btn1.setBorder(new LineBorder(Color.BLACK, 1));
            add(btn1);

            JButton btn2 = new JButton("2");
            btn2.addActionListener(this);
            btn2.setContentAreaFilled(false);
            btn2.setOpaque(true);
            btn2.setBackground(Color.GRAY);
            btn2.setBorder(new LineBorder(Color.BLACK, 1));
            add(btn2);

            JButton btn3 = new JButton("3");
            btn3.addActionListener(this);
            btn3.setContentAreaFilled(false);
            btn3.setOpaque(true);
            btn3.setBackground(Color.GRAY);
            btn3.setBorder(new LineBorder(Color.BLACK, 1));
            add(btn3);

            JButton btn4 = new JButton("4");
            btn4.addActionListener(this);
            btn4.setContentAreaFilled(false);
            btn4.setOpaque(true);
            btn4.setBackground(Color.GRAY);
            btn4.setBorder(new LineBorder(Color.BLACK, 1));
            add(btn4);

            JButton btn5 = new JButton("5");
            btn5.addActionListener(this);
            btn5.setContentAreaFilled(false);
            btn5.setOpaque(true);
            btn5.setBackground(Color.GRAY);
            btn5.setBorder(new LineBorder(Color.BLACK, 1));
            add(btn5);

            JButton btn6 = new JButton("6");
            btn6.addActionListener(this);
            btn6.setContentAreaFilled(false);
            btn6.setOpaque(true);
            btn6.setBackground(Color.GRAY);
            btn6.setBorder(new LineBorder(Color.BLACK, 1));
            add(btn6);

            JButton btn7 = new JButton("7");
            btn7.addActionListener(this);
            btn7.setContentAreaFilled(false);
            btn7.setOpaque(true);
            btn7.setBackground(Color.GRAY);
            btn7.setBorder(new LineBorder(Color.BLACK, 1));
            add(btn7);

            JButton btn8 = new JButton("8");
            btn8.addActionListener(this);
            btn8.setContentAreaFilled(false);
            btn8.setOpaque(true);
            btn8.setBackground(Color.GRAY);
            btn8.setBorder(new LineBorder(Color.BLACK, 1));
            add(btn8);

            JButton btn9 = new JButton("9");
            btn9.addActionListener(this);
            btn9.setContentAreaFilled(false);
            btn9.setOpaque(true);
            btn9.setBackground(Color.GRAY);
            btn9.setBorder(new LineBorder(Color.BLACK, 1));
            add(btn9);

            JButton btnEmpty = new JButton();
            btnEmpty.setEnabled(false);
            btnEmpty.setContentAreaFilled(false);
            btnEmpty.setOpaque(true);
            btnEmpty.setBackground(Color.GRAY);
            btnEmpty.setBorder(new LineBorder(Color.BLACK, 1));
            add(btnEmpty);

            JButton btn0 = new JButton("0");
            btn0.addActionListener(this);
            btn0.setContentAreaFilled(false);
            btn0.setOpaque(true);
            btn0.setBackground(Color.GRAY);
            btn0.setBorder(new LineBorder(Color.BLACK, 1));
            add(btn0);

            JButton btnEmpty2 = new JButton();
            btnEmpty2.setEnabled(false);
            btnEmpty2.setContentAreaFilled(false);
            btnEmpty2.setOpaque(true);
            btnEmpty2.setBackground(Color.GRAY);
            btnEmpty2.setBorder(new LineBorder(Color.BLACK, 1));
            add(btnEmpty2);

        }

    @Override
    public void actionPerformed(ActionEvent e) {

            if(txtText.getText().length() == 30) {
                return;
            }

            JButton btn = (JButton) e.getSource();
            String number = btn.getText();
            txtText.setText(txtText.getText() + number);

    }
}
