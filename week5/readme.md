# 5주차 실습
추석 연휴로 인해 별도 과제는 출제되지 않았고 질의 응답 수업만 진행하였다.  
## Player (배점 없음)
제네릭, 인터페이스, 정렬(comparable, comparator) 관련 질문 답변을 위해 만든 클래스  
1. 오름차순, 내림차순 정렬 방법
2. 다중 상속
3. 인터페이스에 제네릭 사용
### 1. 오름차순, 내림차순 정렬 방법
Player 클래스를 만들고 PlayerTest 클래스에서 comparable, comparator 사용한 정렬 방법을 알아보았다.  
Comparable<T(Player)> 인터페이스를 implement하여 compareTo 메소드를 override하면 컬렉션의 정렬 기능을 사용할 수 있다.  
다른 방법으로는 익명 클래스로 Comparator<T(Player)>()를 생성하여 정렬 방법을 전달하여 정렬을 수행할 수 있다.  
Comparable의 경우 class 내에 미리 정의되어 있어야 사용할 수 있으며 클래스 제작자의 의도대로 정렬 기능이 작동된다.  
Comparator의 경우 사용자가 직접 원하는 정렬 방식을 정의하여 정렬할 수 있다는 특징이 있다.  
### 2. 다중 상속
자바에서는 여러 개의 클래스를 상속하는 것을 지원하지 않는다.  
그러나 인터페이스는 여러 개 구현할 수 있다.  
Calculator 인터페이스를 만들고 Player 클래스가 Calculator 인터페이스와 Comparable 인터페이스를 구현하도록 해보았다.  
### 3. 인터페이스에 제네릭 사용
앞에서 만든 Calculator 인터페이스를 제네릭을 이용하여 
Player 클래스가 Calculator<Player>를 구현하도록 하였다.  
 
[전체목록으로 돌아가기](./../../../)