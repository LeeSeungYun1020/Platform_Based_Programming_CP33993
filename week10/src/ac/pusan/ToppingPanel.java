package ac.pusan;

import javax.swing.*;
import java.awt.*;

public class ToppingPanel extends JPanel implements PizzaPanel {
    private final JCheckBox pepper;
    private final JCheckBox cheese;
    private final JCheckBox peperoni;
    private final JCheckBox bacon;
    private final ButtonGroup buttonGroup;

    public ToppingPanel() {
        setLayout(new GridLayout(4, 1));
        pepper = new JCheckBox("피망");
        cheese = new JCheckBox("치즈");
        peperoni = new JCheckBox("페페로니");
        bacon = new JCheckBox("베이컨");
        buttonGroup = new ButtonGroup();
        buttonGroup.add(pepper);
        buttonGroup.add(cheese);
        buttonGroup.add(peperoni);
        buttonGroup.add(bacon);
        setBorder(BorderFactory.createTitledBorder("추가토핑"));
        add(pepper);
        add(cheese);
        add(peperoni);
        add(bacon);
    }

    @Override
    public void clear() {
        buttonGroup.clearSelection();
    }

    @Override
    public int value() {
        int val = 0;
        if (pepper.isSelected())
            val += 1000;
        else if (cheese.isSelected())
            val += 2000;
        else if (peperoni.isSelected())
            val += 2500;
        else if (bacon.isSelected())
            val += 2800;
        return val;
    }
}
