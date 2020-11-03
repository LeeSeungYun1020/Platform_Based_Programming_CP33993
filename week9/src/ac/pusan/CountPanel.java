package ac.pusan;

import javax.swing.*;
import java.awt.*;

public class CountPanel extends JPanel {
    private JTextField count;
    private JLabel label;

    public CountPanel() {
        count = new JTextField(10);
        label = new JLabel("주문수량입력");
        setLayout(new GridLayout(2, 1));
        add(label);
        add(count);
    }
}
