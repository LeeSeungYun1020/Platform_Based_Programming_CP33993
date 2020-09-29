package ac.pusan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PlayerTest {

    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        players.add(new Player("Eric", 786));
        players.add(new Player("Alice", 899));
        players.add(new Player("Chris", 450));
        players.add(new Player("Bob", 975));
        players.add(new Player("John", 582));

        // 1 comparable 이용 / 점수 내림차순
        Collections.sort(players);
        System.out.println("1: " + players);

        // 2 comparator 이용 / 이름 오름차순
        players.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        /*
        players.sort(new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        */
        System.out.println("2: " + players);

        // 3 Calculator interface 구현 테스트
        Player kate = new Player("Kate", 300);
        for (Player player : players) {
            int add = kate.plus(player);
            if (add >= 1000)
                System.out.println("Kate + " + player.getName() + " = " + add);
        }
        System.out.println(Calculator.execStatic(kate.getScore(), players.get(players.size() - 1).getScore()));
        System.out.println(kate.execDefault(3, -3));
    }
}
