package ac.pusan;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    private final WelcomePanel welcomePanel = new WelcomePanel();
    private final TypePanel typePanel = new TypePanel();
    private final ToppingPanel toppingPanel = new ToppingPanel();
    private final SizePanel sizePanel = new SizePanel();
    private final CountPanel countPanel = new CountPanel();
    private final OrderPanel orderPanel = new OrderPanel();
    private final JPanel centerPanel;

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
        orderPanel.getOrderButton().addActionListener((event) -> {
            int price = typePanel.value() + toppingPanel.value() + sizePanel.value();
            price *= countPanel.value();
            welcomePanel.getMessage().setText("주문해주셔서 감사합니다.");
            orderPanel.getTextField().setText(Integer.toString(price));
        });
        orderPanel.getCancelButton().addActionListener((event) -> {
            typePanel.clear();
            toppingPanel.clear();
            sizePanel.clear();
            countPanel.clear();
            welcomePanel.getMessage().setText("자바 피자에 오신 것을 환영합니다.");
            orderPanel.getTextField().setText("");
        });
        setVisible(true);
    }
}
