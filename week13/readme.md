# 13주차 과제
## 1. 데이터베이스 생성
```mysql
CREATE DATABASE bookdb;
```
## 2. 테이블 생성
```mysql
CREATE TABLE book(
    id INT PRIMARY KEY,
    title VARCHAR(30) NOT NULL,
    publisher VARCHAR(30) NOT NULL,
    author VARCHAR(30) NOT NULL
);
```
## 3. 레코드 추가
```mysql
INSERT INTO book (id, title, publisher, author)
VALUES (0, 'Harry Potter', 'Bloomsbury', 'J. K. Rowling');

INSERT INTO book (id, title, publisher, author)
VALUES ('1, The Lord of the Rings', 'Allen & Unwin', 'J. R. R. Tolkein');

INSERT INTO book (id, title, publisher, author)
VALUES ('2, Pride and Prejudice', 'T. Egerton Kingdom', 'Jane Austen');
```
## 4. 레코드 모두 삭제
```mysql
DELETE FROM book;
```

1-4번 문항은 mysql workbench에서 GUI를 이용하여 데이터베이스 및 테이블을 생성하고  
레코드 추가 및 삭제를 수행하여도 된다. 결과를 바로바로 확인할 수 있기 때문에 다들 쉽게 수행하였다.

## 5-7. DB1
위 과정 중 일부를 자바를 이용하여 수행하면 된다.  
위에서 사용한 SQL 문을 이용하여 쉽게 수행할 수 있다,

## 8. DB2
이번 과제의 하이라이트, 데이터베이스를 이용하여 책 관리 프로그램을 만든다.  
DB1에서는 특정 명령을 고정된 형태로 수행한다면  
DB2에서는 추가, 삭제, 수정을 위해 SQL 문의 일부 내용을 변경해야한다.  
String을 다루는데 익숙하지 않아서 DB2를 제대로 만들지 못한 경우가 있었다.  
String.format()을 이용하면 좀 더 쉽게 SQL 문을 작성할 수 있다.