# 11주차 과제
## 그래픽과 스레드를 활용하여 화면에서 공을 움직이는 프로그램 작성
### 1. 명시한 클래스를 반드시 구현하여 사용 (40점)
- Ball 클래스
    - 필드: x:int, y:int, size:int, xSpeed:int, ySpeed:int
    - 메소드: draw(g: Graphics):void, update():void
- MyPanel 클래스
    - 필드: BOARD_WIDTH:int, BOARD_HEIGHT:int, ball:Ball
    - 메소드: MyPanel(), paintComponent(g: Graphics):void, main(args:String[]):void

코드가 주어졌기 때문에 학생들이 빠짐없이 잘 구현하였다.  
주어진 코드에서 draw 메소드에서 색상 지정과 원 그리기는 잘 구현하였으나 
update 메소드의 벽에 반사되도록 하는 부분 계산에 틀린 학생들이 더러 있었다.  
(draw 메소드, update 메소드 각 20점)
### 2. 람다식을 사용하여 Runnable 객체 구현 (60점)
```java
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
```
나머지 코드는 모두 주어지고 while문 내부에서 공이 움직이도록 한 뒤 
새로 그리는 코드만 넣어주면 되서 난이도가 매우 낮다. 
Runnable 객체를 생성한 뒤 스레드 객체를 생성하여 스레드를 실행시키면 된다.  
(람다식, 위치 변경, 그리기, 쉬기 각 15 점)

이번 과제는 코드가 거의 다 주어지고 그래픽과 스레드를 다루는 일부분 코드만 수정하면 되는 간단한 과제였다. 
대부분의 학생들이 잘 수행해주었고 평균 점수도 매우 높게 나왔다.
