package ac.pusan;

import javax.swing.*;
import java.awt.*;

public class CountPanel extends JPanel implements PizzaPanel {
    private final JTextField count;
    private final JLabel label;

    public CountPanel() {
        count = new JTextField(10);
        label = new JLabel("주문수량입력");
        setLayout(new GridLayout(2, 1));
        add(label);
        add(count);
    }

    @Override
    public void clear() {
        count.setText("");
    }

    @Override
    public int value() {
        int val = 0;
        try {
            val = Integer.parseInt(count.getText());
        } catch (Exception ignored) {
        }
        return val;
    }
}
