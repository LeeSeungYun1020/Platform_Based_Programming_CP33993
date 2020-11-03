package ac.pusan;

import javax.swing.*;

public class OrderPanel extends JPanel {
    private JButton orderButton, cancelButton;
    private JTextField text;

    public OrderPanel(){
        orderButton = new JButton("주문");
        cancelButton = new JButton("취소");
        text = new JTextField();
        text.setEditable(false); // 수정불가
        text.setColumns(8); // 길이 지정

        add(orderButton);
        add(cancelButton);
        add(text);
    }
}
