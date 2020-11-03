package ac.pusan;

import javax.swing.*;
import java.awt.*;

public class SizePanel extends JPanel {
    private JComboBox<String> size;
    private JLabel label;

    public SizePanel() {
        String[] types = {"small", "medium", "large"};
        setLayout(new FlowLayout());
        label = new JLabel("사이즈");
        size = new JComboBox<>(types);
        size.setSelectedIndex(0);
        add(label);
        add(size);
    }
}
