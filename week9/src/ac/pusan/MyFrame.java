package ac.pusan;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    private WelcomePanel welcomePanel = new WelcomePanel();
    private TypePanel typePanel = new TypePanel();
    private ToppingPanel toppingPanel = new ToppingPanel();
    private SizePanel sizePanel = new SizePanel();
    private CountPanel countPanel = new CountPanel();
    private OrderPanel orderPanel = new OrderPanel();
    private JPanel centerPanel;

    public MyFrame() {
        setSize(500, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("피자주문 학번 이름");

        centerPanel = new JPanel();
        centerPanel.add(toppingPanel);
        centerPanel.add(countPanel);

        setLayout(new BorderLayout());
        add(welcomePanel, BorderLayout.NORTH);
        add(orderPanel, BorderLayout.SOUTH);
        add(sizePanel, BorderLayout.EAST);
        add(typePanel, BorderLayout.WEST);
        add(centerPanel, BorderLayout.CENTER);
        setVisible(true);
    }
}
