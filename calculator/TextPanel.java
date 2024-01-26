package calculator;

import javax.swing.*;
import java.awt.*;

public class TextPanel extends JPanel {

    private static JTextField txtNumber;

    public TextPanel() {
        setLayout(new FlowLayout());

        txtNumber = new JTextField(40);
        txtNumber.setHorizontalAlignment(JTextField.RIGHT);
        txtNumber.setEditable(false);
        add(txtNumber);
    }

    public static JTextField getTxtNumber() {
        return txtNumber;
    }
}
