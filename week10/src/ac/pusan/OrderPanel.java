package ac.pusan;

import javax.swing.*;

public class OrderPanel extends JPanel {
    private final JButton orderButton;
    private final JButton cancelButton;
    private final JTextField textField;

    public OrderPanel() {
        orderButton = new JButton("주문");
        cancelButton = new JButton("취소");
        textField = new JTextField();
        textField.setEditable(false); // 수정불가
        textField.setColumns(8); // 길이 지정

        add(orderButton);
        add(cancelButton);
        add(textField);
    }

    public JButton getOrderButton() {
        return orderButton;
    }

    public JButton getCancelButton() {
        return cancelButton;
    }

    public JTextField getTextField() {
        return textField;
    }
}
