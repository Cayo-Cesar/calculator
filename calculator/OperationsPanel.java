package calculator;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperationsPanel extends JPanel implements ActionListener {

    private JTextField txtText;

    private char op;
    private double num1;
    private double num2;

    private JButton btnAdd;
    private JButton btnSub;
    private JButton btnMult;
    private JButton btnDiv;
    private JButton btnEq;
    private JButton btnClear;

    public OperationsPanel(JTextField txtText) {
        this.txtText = txtText;

        setLayout(new GridLayout(3, 2));

        btnAdd = new JButton("+");
        btnAdd.addActionListener(this);
        btnAdd.setContentAreaFilled(false);
        btnAdd.setOpaque(true);
        btnAdd.setBackground(Color.GRAY);
        btnAdd.setBorder(new LineBorder(Color.BLACK, 1));
        add(btnAdd);

        btnSub = new JButton("-");
        btnSub.addActionListener(this);
        btnSub.setContentAreaFilled(false);
        btnSub.setOpaque(true);
        btnSub.setBackground(Color.GRAY);
        btnSub.setBorder(new LineBorder(Color.BLACK, 1));
        add(btnSub);

        btnMult = new JButton("*");
        btnMult.addActionListener(this);
        btnMult.setContentAreaFilled(false);
        btnMult.setOpaque(true);
        btnMult.setBackground(Color.GRAY);
        btnMult.setBorder(new LineBorder(Color.BLACK, 1));
        add(btnMult);

        btnDiv = new JButton("/");
        btnDiv.addActionListener(this);
        btnDiv.setContentAreaFilled(false);
        btnDiv.setOpaque(true);
        btnDiv.setBackground(Color.GRAY);
        btnDiv.setBorder(new LineBorder(Color.BLACK, 1));
        add(btnDiv);

        btnEq = new JButton("=");
        btnEq.addActionListener(this);
        btnEq.setContentAreaFilled(false);
        btnEq.setOpaque(true);
        btnEq.setBackground(Color.GRAY);
        btnEq.setBorder(new LineBorder(Color.BLACK, 1));
        add(btnEq);

        btnClear = new JButton("C");
        btnClear.addActionListener(this);
        btnClear.setContentAreaFilled(false);
        btnClear.setOpaque(true);
        btnClear.setBackground(Color.GRAY);
        btnClear.setBorder(new LineBorder(Color.BLACK, 1));
        add(btnClear);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if (txtText.getText().isEmpty()) {
           return;
        }
      JButton btn = (JButton) e.getSource();

      if (btn == btnClear) {
          op = '\u0000';
          txtText.setText("");
      } else if (btn == btnEq) {
            num2 = Double.parseDouble(txtText.getText());
            double result = switch (op) {
                case '+' -> num1 + num2;
                case '-' -> num1 - num2;
                case '*' -> num1 * num2;
                case '/' -> num1 / num2;
                default -> 0;
            };
          txtText.setText(String.valueOf(result));
            op = '\u0000';
            num1 = result;
            num2 = 0;

        } else {
            op = btn.getText().charAt(0);
            num1 = Double.parseDouble(txtText.getText());
            txtText.setText("");
      }
    }
}
