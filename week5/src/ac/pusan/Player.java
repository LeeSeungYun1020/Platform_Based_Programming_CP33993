package ac.pusan;

public class Player implements  Comparable<Player>, Calculator<Player> {
    private String name;
    private int score;

    public Player(String name, int score){
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Player o) {
        return o.score - score;
    }

    @Override
    public String toString() {
        return name + " (" + score + ")";
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int plus(Player other) {
        return score + other.score;
    }

    @Override
    public int multiple(Player other) {
        return score * other.score;
    }

    @Override
    public int execDefault(int a, int b) {
        return a + b + score;
    }
}
