package ac.pusan;

import javax.swing.*;
import java.awt.*;

public class TypePanel extends JPanel {
    private JComboBox<String> type;
    private JLabel label;

    public TypePanel() {
        String[] types = {"콤보", "포테이토", "불고기"};
        setLayout(new FlowLayout());
        label = new JLabel("종류");
        type = new JComboBox<>(types);
        type.setSelectedIndex(0);

        add(label);
        add(type);
    }
}
