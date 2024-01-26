package calculator;

import com.sun.org.apache.xerces.internal.util.DOMUtil;

import javax.swing.*;
import java.awt.*;

public class calc extends JFrame {

    public calc() throws Exception{
        super ("Calculadora");

        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 350);
        setLocation(400, 200);
        setResizable(false);
        setBackground(Color.GRAY);

        setLayout(new BorderLayout());

        TextPanel textPanel = new TextPanel();
        add(textPanel, BorderLayout.NORTH);

        JPanel digitsPanel = new JPanel();
        digitsPanel.setLayout(new BorderLayout());
        digitsPanel.add(new NumbersPanel(TextPanel.getTxtNumber()), BorderLayout.CENTER);
        digitsPanel.add(BorderLayout.EAST, new OperationsPanel(TextPanel.getTxtNumber()));

        add(digitsPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) throws Exception{
        new calc();
    }
}
