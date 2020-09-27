#3주차 과제
## 미니 도서관 관리 프로그램(100점)
Book 클래스를 만들고 Book 클래스 테스트를 위한 TestDrive를 만드는 과제이다.  
필드로 author, title, id, identification, bookCount를 가지며  
생성자 3개와 getter/setter, equals, toString 메소드를 구현해야 한다.  
그외 조건은 아래와 같다.  
1. 클래스 초기화 블록을 이용하여 identification, bookCount를 초기화한다.
1. 인스턴스 초기화 블록을 이용하여 identification과 bookCount 값을 증가시키고 id 값은 identification 값으로 초기화한다.
1. equals는 객체를 비교하고 책 제목과 저자가 같으면 true, 그렇지 않은 경우 false를 반환한다.
1. toString은 id, title, author를 수행 결과 형식에 맞게 작성한다.
<br>
BookTest 클래스는 명령 입력과 ADD, LIST, FIND 기능이 구현되어 있고 책 목록과 보유 수량을 출력하는 코드와 
getter와 setter를 사용하여 책 정보를 수정하는 코드를 구현해야 한다.
<br>
구체적인 항목별 배점은 아래와 같이 설정하였다.

| 　       | 항목                    | 배점 |
|:--------:|:-----------------------|:----:|
|   Book   | 클래스 초기화 블록      | 10   |
|          | 인스턴스 초기화 블록    | 10   |
|          | toString                | 10   |
|          | equals                  | 10   |
|          | 생성자                  | 5    |
|          | decrease                | 5    |
|          | getter/setter           | 5    |
|          | 이외 필드               | 5    |
|          | 기타                    |    - |
| BookTest | 보유 수량 출력          | 10   |
|          | 책 목록 출력            | 10   |
|          | 정보 출력 (getter 사용) | 10   |
|          | 정보 수정 (setter 사용) | 10   |
|          | 기타                    |    - |

클래스 초기화와 인스턴스 초기화를 헷갈려 하는 학생이 많은 것 같다. static 키워드가 붙는 경우, 
해당 필드, 메소드는 인스턴스에 관계없이 호출될 수 있는 클래스 필드/메소드로 인스턴스 생성 없이 사용 가능하다.  
Book 클래스는 클래스 필드인 identification과 bookCount를 가지는데 identification은 랜덤한 
id값 생성을 위해 사용되는 필드로 처음에는 0에서 10000까지의 int 값으로 초기화되고 새로운 Book 클래스가 
생성될 때마다 인스턴스 초기화 블록에서 identification을 증가시키고 그 값을 인스턴스의 id 필드에 대입하여 
생성된 책의 id가 각각 다른 값을 가지게 한다. bookCount는 현재까지 저장된 책의 수를 저장하는 클래스 필드이다.  
decrease 함수가 왜 static으로 구현되어야 하는지 궁금해하는 학생도 있었는데 decrease는 클래스 필드인 
identification과 bookCount를 감소시켜 id와 책의 수가 증가되지 않기 위한 메소드이기 때문이다. FIND 기능에서 
새로운 객체를 생성하지 않고 비교하면 되지 왜 굳이 인스턴스를 생성하고 decrease를 호출하는지에 대한 질문도 들어왔는데... 
decrease 메소드를 바르게 구현하지 않았을 경우 FIND 기능 수행 후 책 권수나 다음에 생성되는 책의 id가 하나 더 증가한 
값이 나오게 된다. 클래스 필드와 메소드에 대해 생각해볼 수 있도록 의도적으로 그렇게 구성한 것이다.  
<br>
equals 메소드를 override할 때 IDE에서 제공하는 자동 완성 기능을 사용하여 잘 구현해 온 학생들도 있었고 
해당 기능을 몰라 직접 구현한 학생들 중에는 모든 class(Object)가 아닌 Book 클래스 끼리만 작동하도록 
구현하거나 Object class를 같은 class인지 getClass()를 호출하여 비교하거나 instanceof 연산자를 사용하여 확인하지 않고 
바로 형변환을 시도하는 경우가 많았다.
<br>
보유 수량과 책 목록을 출력하는 코드, getter와 setter를 사용하여 정보를 출력하고 수정하는 부분 구현은 대부분이 잘 수행하였는데 
Books 배열에 저장된 인스턴스를 순환하면서 목록을 출력하고 getter/setter를 사용해야 하는데 Book 클래스 생성자를 잘못 만들어 
별도로 title, author를 String 배열을 만들어 출력한 경우가 기억에 남는다. Book 클래스를 제대로 구현하였더라면 
BookTest 클래스의 상단 코드는 그대로 두고 아래에 간단한 테스트 코드만 작성하면 되는데 BookTest 코드를 전면 수정하여 
문제에서 제시한 실행 결과와 같게 나오도록 구현하여 안타까웠다.

[전체목록으로 돌아가기](./../../../)