package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperationsPanel extends JPanel implements ActionListener {

    private JTextField textText;

    private JButton btnAdd;
    private JButton btnSub;
    private JButton btnMult;
    private JButton btnDiv;
    private JButton btnEq;
    private JButton btnClear;

    public OperationsPanel(JTextField txtNumber) {
        this.textText = textText;

        setLayout(new GridLayout(3, 2));

        btnAdd = new JButton("+");
        btnAdd.addActionListener(this);
        add(btnAdd);

        btnSub = new JButton("-");
        btnSub.addActionListener(this);
        add(btnSub);

        btnMult = new JButton("*");
        btnMult.addActionListener(this);
        add(btnMult);

        btnDiv = new JButton("/");
        btnDiv.addActionListener(this);
        add(btnDiv);

        btnEq = new JButton("=");
        btnEq.addActionListener(this);
        add(btnEq);

        btnClear = new JButton("C");
        btnClear.addActionListener(this);
        add(btnClear);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
aa
    }
}
