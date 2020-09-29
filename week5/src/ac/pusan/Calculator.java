package ac.pusan;

public interface Calculator<T> {
    public int plus(T other);
    public int multiple(T other);
    // 인터페이스 default 메소드
    public default int execDefault(int a, int b){
        return a + b;
    }
    // 인터페이스 static 메소드
    public static int execStatic(int a, int b){
        return a + b;
    }
}
