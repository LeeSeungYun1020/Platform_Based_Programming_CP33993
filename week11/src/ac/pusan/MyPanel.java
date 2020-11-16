package ac.pusan;

import java.awt.*;
import javax.swing.*;
//공을 Ball 클래스로 모델링한다.
class Ball {
    //공의 속성은 위치, 크기, 속도이다.
    private int x = 100;
    private int y = 100;
    private int size = 30;
    private int xSpeed = 10;
    private int ySpeed = 10;
    //공을 화면에 그려주는 메소드이다.
    public void draw(Graphics g) {
        // frame 사이즈가 다른 경우 아래 코드로 범위 구분이 가능합니다.
        g.setColor(Color.BLACK);
        g.drawRect(0, 0, MyPanel.BOARD_WIDTH, MyPanel.BOARD_HEIGHT);
        // 원 그리기
        g.setColor(Color.RED);
        g.fillOval(x, y, size, size);
    }
    public void update() {
        x += xSpeed;
        y += ySpeed;
        if (x >= MyPanel.BOARD_WIDTH - size || x <= 0) {
            xSpeed = -xSpeed;
        }
        if (y >= MyPanel.BOARD_HEIGHT - size || y <= 0) {
            ySpeed = -ySpeed;
        }
    }
}
//공의 새로운 위치를 계산한다. 공이 벽에 부딪치면 반사되도록 한다.
public class MyPanel extends JPanel {
    static final int BOARD_WIDTH = 600;
    static final int BOARD_HEIGHT = 300;
    private Ball ball = new Ball();
    public MyPanel() {
        this.setBackground(Color.YELLOW);
        Runnable task = () -> {
            while (true) {
                ball.update();
                repaint();
                try {
                    Thread.sleep(50);
                } catch (InterruptedException ignore) {
                }
            }
        };
        new Thread(task).start();
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        ball.draw(g);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        // JFrame 사이즈에 제목표시줄 및 경계가 포함되어 예상한 사이즈와 다를 수 있음.
        frame.setSize(MyPanel.BOARD_WIDTH + 15, MyPanel.BOARD_HEIGHT + 40);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(new MyPanel());
    }
}