package ac.pusan;

import javax.swing.*;
import java.awt.*;

public class TypePanel extends JPanel implements PizzaPanel {
    private final JComboBox<String> comboBox;
    private final JLabel label;

    public TypePanel() {
        String[] types = {"콤보", "포테이토", "불고기"};
        setLayout(new FlowLayout());
        label = new JLabel("종류");
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
        return 10000 + comboBox.getSelectedIndex() * 5000;
    }
}
