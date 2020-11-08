package ac.pusan;

import javax.swing.*;
import java.awt.*;

public class SizePanel extends JPanel implements PizzaPanel {
    private final JComboBox<String> comboBox;
    private final JLabel label;

    public SizePanel() {
        String[] types = {"small", "medium", "large"};
        setLayout(new FlowLayout());
        label = new JLabel("사이즈");
        comboBox = new JComboBox<>(types);
        comboBox.setSelectedIndex(0);
        add(label);
        add(comboBox);
    }

    @Override
    public void clear() {
        comboBox.setSelectedIndex(0);
    }

    @Override
    public int value() {
        int index = comboBox.getSelectedIndex();
        switch (index) {
            case 0:
                return 0;
            case 1:
                return 3000;
            default:
                return 5000;
        }
    }
}
