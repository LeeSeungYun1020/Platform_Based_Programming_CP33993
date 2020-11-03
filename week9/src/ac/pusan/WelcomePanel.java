package ac.pusan;

import javax.swing.*;

public class WelcomePanel extends JPanel {
    private JLabel message;

    public WelcomePanel() {
        message = new JLabel("자바 피자에 오신 것을 환영합니다.");
        add(message);
    }
}
