package ac.pusan;
// 문제 1
public class Exam {
    public static void main(String[] args) {
        // int를 long으로 바꾸면 문제가 해결된다.
        long lightspeed;
        long distance;

        lightspeed = 300000;
        // int를 사용할 경우 distance가 int 최대값을 초과하여 오버플로우가 발생한다.
        distance = lightspeed * 365 * 24 * 60 * 60;

        System.out.println("빛이 1년간 움직인 거리는 " + distance + "km");
        // lightspeed와 distance를 double로 선언한 경우
        //System.out.printf("빛이 1년간 움직인 거리는 %.0fkm", distance);
    }
}
