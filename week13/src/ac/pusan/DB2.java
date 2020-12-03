package ac.pusan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DB2 {
    public static void read(Statement statement) {
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

    public static void create(Statement statement) {
        try{
            System.out.println("<책 추가>");
            System.out.print("id       : ");
            String id = readLine();
            System.out.print("title    : ");
            String title = readLine();
            System.out.print("publisher: ");
            String publisher = readLine();
            System.out.print("author   : ");
            String author = readLine();
            int result = statement.executeUpdate(
                    "INSERT INTO book (id, title, publisher, author) " +
                            String.format("VALUES (%s, '%s', '%s', '%s');", id, title, publisher, author)
                    );
            if (result < 1)
                throw new Exception();
        }catch (Exception e){
            System.err.println("레코드 추가 실패");
        }

    }

    public static void delete(Statement statement) {
        try {
            System.out.println("<책 삭제>");
            System.out.println("삭제할 책의 id를 입력하십시오.");
            System.out.print("id       : ");
            String id = readLine();
            int result = statement.executeUpdate(
                    "DELETE FROM book WHERE id = " + id + ";"
            );
            if (result < 1)
                throw new Exception();
        } catch (Exception e){
            System.err.println("레코드 삭제 실패");
        }

    }

    public static void update(Statement statement) {
        try{
            String type;
            System.out.println("<책 수정>");
            while (true){
                System.out.println("수정할 항목을 입력하십시오.");
                System.out.println("1. id, 2. title, 3. publisher, 4. author");
                String option = readLine().toLowerCase();
                if (option.equals("1") || option.equals("id")){
                   type = "id";
                    break;
                } else if (option.equals("2") || option.equals("title")){
                    type = "title";
                    break;
                } else if (option.equals("3") || option.equals("publisher")){
                    type = "publisher";
                    break;
                } else if (option.equals("4") || option.equals("author")){
                    type = "author";
                    break;
                } else {
                    System.err.println("입력을 다시 확인해주십시오.");
                }
            }
            System.out.print("현재 값 : ");
            String oldValue = readLine();
            System.out.print("수정 값 : ");
            String newValue = readLine();
            int result = statement.executeUpdate(String.format(
                    "UPDATE book SET %s = '%s' WHERE %s = '%s';", type, newValue, type, oldValue)
            );
            if (result < 1)
                throw new Exception();
        }catch (Exception e){
            System.err.println("레코드 수정 실패");
        }

    }

    public static String readLine() {
        Scanner scanner = new Scanner(System.in);
        String tem = scanner.nextLine();
        if (tem.length() > 29){
            System.err.println("입력 범위를 초과하여 일부 입력이 누락되었습니다.");
            tem = tem.substring(0, 28);
        }
        return tem;
    }

    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bookdb?serverTimezone=UTC",
                    "root",
                    "********");
            Statement statement = connection.createStatement();
            while (true){
                read(statement);
                System.out.println("원하는 명령을 선택하십시오.");
                System.out.println("1. CREATE, 2. DELETE, 3. UPDATE, 4. QUIT");
                System.out.print(">> ");
                String operation = readLine().toLowerCase();
                if (operation.equals("1") || operation.equals("create")){
                    create(statement);
                } else if (operation.equals("2") || operation.equals("delete")){
                    delete(statement);
                } else if (operation.equals("3") || operation.equals("update")){
                    update(statement);
                } else if (operation.equals("4") || operation.equals("quit")){
                    break;
                } else {
                    System.err.println("입력을 다시 확인해주십시오.");
                }
            }
        }catch (Exception e){

        }
        System.out.println("프로그램 종료");
    }
}
