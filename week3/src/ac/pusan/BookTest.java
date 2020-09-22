package ac.pusan;

import java.util.Scanner;

enum OperationKind {ADD, LIST, FIND, QUIT, CLEAR, INVALID}

public class BookTest {
    private static OperationKind getOperation(String operation) {
        OperationKind kind = OperationKind.INVALID;
        if (operation.equalsIgnoreCase("ADD"))
            kind = OperationKind.ADD;
        else if (operation.equalsIgnoreCase("LIST"))
            kind = OperationKind.LIST;
        else if (operation.equalsIgnoreCase("FIND"))
            kind = OperationKind.FIND;
        else if (operation.equalsIgnoreCase("CLEAR"))
            kind = OperationKind.CLEAR;
        else if (operation.equalsIgnoreCase("QUIT"))
            kind = OperationKind.QUIT;
        return kind;
    }

    public static void main(String[] args) {
// TODO Auto-generated method stub
        Book[] Books = new Book[5];
        Book aBook;
        String title;
        String author;
        String op;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; ) {
            System.out.print("Enter Operation String!(ADD, LIST, FIND, QUIT)");
            op = scan.nextLine();
            OperationKind kind = getOperation(op);
            if (kind == OperationKind.QUIT) break;
            System.out.println("------------------------------------");
            switch (kind) {
                case ADD:
                    System.out.println("Type the title of the book: ");
                    title = scan.nextLine();
                    System.out.println("Type the name of thd author: ");
                    author = scan.nextLine();
                    Books[i] = new Book(title, author);
                    System.out.println(Books[i] + "\n책이 추가 되었습니다.");
                    i++;
                    break;
                case LIST:
                    System.out.println("Book List");
                    System.out.println("----------------------------------------");
                    for (int j = 0; j < i; j++)
                        System.out.println(Books[j]);
                    System.out.println("----------------------------------------");
                    System.out.println("총 " + Book.bookCount + "권");
                    break;
                case FIND:
                    System.out.println("Type the title of the book: ");
                    title = scan.nextLine();
                    System.out.println("Type the name of thd author: ");
                    author = scan.nextLine();
                    aBook = new Book(title, author);
                    Book.decrease();
                    if (!(title.equals("") && author.equals(""))) {
                        boolean find = false;
                        for (int j = 0; j < i; j++) {
                            if (Books[j].equals(aBook)) {
                                System.out.println("해당하는 책이 도서관에 존재합니다.");
                                find = true;
                                break;
                            }
                        }
                        if (!find)
                            System.out.println("찾는 책이 없습니다.");
                    }

            }//switch
        }//for
        // 책 목록과 책 보유수량을 출력하는 코드를 추가
        System.out.println("----------------------------------------");
        System.out.println("현재 도서관 책 보유량 : " + Book.bookCount + "권");
        System.out.println("도서관 보유 책 리스트");
        System.out.println("-----------------------------------------");
        for (int j = 0; j < Book.bookCount; j++)
            System.out.println(Books[j]);
        System.out.println("----------------------------------------");

        // getter와 setter를 이용하여 책 정보 수정 코드 추가
        System.out.println("정보 수정을 원하는 책 id를 입력하세요.");
        int id = scan.nextInt();
        for (int i = 0; i < Book.bookCount; i++) {
            if (id == Books[i].getId()){
                System.out.println("책이름 : " + Books[i].getTitle());
                System.out.println("저자 : " + Books[i].getAuthor());
                System.out.print("수정할 부분을 선택 (1: title, 2: author) : ");
                int select = scan.nextInt();
                scan.nextLine();
                if (select == 1){
                    System.out.print("제목 입력 : ");
                    Books[i].setTitle(scan.nextLine());
                    System.out.println(Books[i] + " <-- 수정됨.");
                } else if (select == 2){
                    System.out.print("저자 입력 : ");
                    Books[i].setAuthor(scan.nextLine());
                    System.out.println(Books[i] + " <-- 수정됨.");
                } else {
                    System.out.println(Books[i] + " <-- 수정하지 않음");
                }
                break;
            } else if (i == Book.bookCount - 1){
                System.out.println("해당 id의 책을 찾을 수 없습니다.");
            }
        }

    }
}

