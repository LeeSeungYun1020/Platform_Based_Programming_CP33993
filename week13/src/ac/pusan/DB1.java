package ac.pusan;
import java.sql.*;

public class DB1 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Class.forName("com.mysql.jdbc.Driver"); <- deprecated
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bookdb?serverTimezone=UTC",
                    "root",
                    "********");
            System.out.println("데이터베이스 연결 완료");
            Statement statement = connection.createStatement();
            statement.executeUpdate("DELETE FROM book");
            System.out.println("init");
            printTable(statement);
            statement.executeUpdate(
                    "INSERT INTO book (id, title, publisher, author) " +
                            "VALUES (0, 'Harry Potter', 'Bloomsbury', 'J. K. Rowling');");
            statement.executeUpdate(
                    "INSERT INTO book (id, title, publisher, author) " +
                            "VALUES (1, 'The Lord of the Rings', 'Allen & Unwin', 'J. R. R. Tolkein');");
            statement.executeUpdate(
                    "INSERT INTO book (id, title, publisher, author) " +
                            "VALUES (2, 'Pride and Prejudice', 'T. Egerton Kingdom', 'Jane Austen');");
            System.out.println("Q5");
            printTable(statement);
            statement.executeUpdate(
                    "UPDATE book " +
                            "SET title = 'Pride&Prejudice', author = '제인 오스틴'" +
                            "WHERE title = 'Pride and Prejudice';"
            );
            System.out.println("Q6");
            printTable(statement);
            statement.executeUpdate(
                    "DELETE FROM book WHERE author = '제인 오스틴';"
            );
            System.out.println("Q7");
            printTable(statement);
        } catch (ClassNotFoundException e) {
            System.out.println("데이터베이스 드라이버 로드 오류");
        } catch (SQLException e) {
            System.out.println("데이터베이스 연결 오류");
        }
    }
    public static void printTable(Statement statement) {
        StringBuilder result = new StringBuilder();
        try {
            ResultSet resultSet = statement.executeQuery("select * from book;");
            while (resultSet.next()) {
                result.append("id       : ").append(resultSet.getString("id"))
                        .append("\ntitle    : ").append(resultSet.getString("title"))
                        .append("\npublisher: ").append(resultSet.getString("publisher"))
                        .append("\nauthor   : ").append(resultSet.getString("author"))
                        .append("\n--------------------------------\n");

            }
        } catch (Exception e) {
            result = new StringBuilder("오류가 발생하여 테이블을 출력할 수 없습니다.\n");
        }
        System.out.print(result);
    }
}
