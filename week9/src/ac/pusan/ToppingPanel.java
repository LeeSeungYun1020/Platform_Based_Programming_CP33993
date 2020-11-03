package ac.pusan;

import javax.swing.*;
import java.awt.*;

public class ToppingPanel extends JPanel {
    private JCheckBox pepper, cheese, peperoni, bacon;
    private ButtonGroup buttonGroup;

    public ToppingPanel() {
        setLayout(new GridLayout(4, 1));
        pepper = new JCheckBox("피망", true);
        cheese = new JCheckBox("치즈");
        peperoni = new JCheckBox("페페로니");
        bacon = new JCheckBox("베이컨");
        buttonGroup = new ButtonGroup();
        buttonGroup.add(pepper);
        buttonGroup.add(cheese);
        buttonGroup.add(peperoni);
        buttonGroup.add(bacon);
        setBorder(BorderFactory.createTitledBorder("추가토핑"));//버튼 그룹 정리
        add(pepper);
        add(cheese);
        add(peperoni);
        add(bacon);
    }
}
