# 2주차 과제
##1. 소수 판단하기 (40점)
a가 b의 약수이면 a|b로 표시하고 
아닌 경우 a!|b로 표시하는 문제이다.  
아래 8개의 세트 하나를 통과할 때마다 5점이 주어진다.  
|   | Set1 | Set2 | Set3 | Set4 | Set5 | Set6 | Set7 | Set8 |
|:-:|:----:|:----:|:----:|:----:|:----:|:----:|:----:|:----:|
|입력| 2 4 | 3 4 | 0 10 | 30 15 | 10 10 | 5 3 | 4 2 | 4 8 |
|출력|2 \| 4|3 !\| 4|0 !\| 10|30 !\| 15|10 \| 10|5 !\| 3|4 !\| 2|4 \| 8|  
<br>
3번 세트를 통과하지 못한 학생들이 많았는데 문제 조건으로 주어진 단 a는 0이 아니다 
부분을 간과하여 a가 0인 경우를 고려하지 못한 것 같다.
##2. 점수 입력 받아 학점 출력, 평균 구하기 (60점)
최대 10명의 학생 점수를 입력받아 학점을 표시하고 종료 전 입력받은 성적의 평균을 출력하는 문제이다.
4가지 조건이 주어지고 조건을 만족하지 못할 경우 조건당 5점이 감점된다.
1. for문을 사용해 최대 10명의 학생을 입력받고 -1이 들어오면 종료할 것
1. while 또는 do-while문을 사용하여 점수 범위는 0~100점으로 올바르지 않은 값이면 다시 입력 받을 것
1. 학점 판별에 switch문을 사용할 것 (등급은 10점 단위로 부여)
1. 종료 전에는 입력된 학생의 성적 평균을 출력 (소수점이하 둘째자리까지)  

생각 외로 재미있는 답안이 많이 등장했다.  
일단 문제에서 for문과 while문 2개의 반복문을 사용해야 하는 것에서 어려움을 느낀 학생이 많았다  
조건에서 반복문 2개를 사용하라고 해서 반복문을 중첩해서 사용하기는 했는데 사실상 하나의 반복문으로 구현한 학생도 있었고
아예 하나의 반복문만 사용한 경우도 존재했다. 
반복문에 대한 이해가 부족하여 마지막 평균 계산 부분을 -1로 break 되는 경우를 생각하지 못하고 무조건 10명을 입력한 것으로 계산한다거나 
반복문을 잘못 작성하여 점수를 잘못 입력한 경우도 학생 수로 포함되는 경우도 있었다.  
<br>
가장 흥미로웠던 답안을 뽑자면 switch문에 관한 것이었다.
```c
switch(score) {
    case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10:
    case 11: case 12: case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20:
    case 21: case 22: case 23: case 24: case 25: case 26: case 27: case 28: case 29: case 30:
    case 31: case 32: case 33: case 34: case 35: case 36: case 37: case 38: case 39: case 40:
        System.out.print("Score : " + score + "(D)\n");
        break;
    case 41: case 42: case 43: case 44: case 45: case 46: case 47: case 48: case 49: case 50:
    case 51: case 52: case 53: case 54: case 55: case 56: case 57: case 58: case 59: case 60:
    case 61: case 62: case 63: case 64: case 65: case 66: case 67: case 68: case 69: case 70:
        System.out.print("Score : " + score + "(C)\n");
        break;
    case 71: case 72: case 73: case 74: case 75: case 76: case 77: case 78: case 79: case 80:
    case 81: case 82: case 83: case 84: case 85: case 86: case 87: case 88: case 89: case 90:
        System.out.print("Score : " + score + "(B)\n");
        break;
    case 91: case 92: case 93: case 94: case 95: case 96: case 97: case 98: case 99: case 100:
        System.out.print("Score : " + score + "(A)\n");
        break;
    }
```
switch문을 사용하고 모든 경우에 대해 잘 작동하기 때문에 감점은 없다. 
그러나 10점 간격을 기준으로 등급을 분류하기 때문에 입력 받은 점수를 10으로 나누고 
각 경우에 대해 학점을 부여하면 좀 더 간결하게 해결 가능하다.
```c
char grade;
switch (point / 10){
    case 10:
    case 9:
        grade = 'A';
        break;
    case 8:
        grade = 'B';
        break;
    case 7:
        grade = 'C';
        break;
    case 6:
        grade = 'D';
        break;
    default:
        grade = 'F';
}
```
다른 아쉬웠던 부분은 case 10:과 case 9:는 실행해야하는 동작이 같기 때문에 
각각 별도의 경우를 작성하지 않고 break없이 합칠 수 있는데 별도로 작성한 경우가 있었고  
default case를 통해 나머지 모든 경우에 대한 작업을 처리할 수 있는데 모든 경우(5, 4, ...)에 
대해 정의한 경우가 있었다.

[전체목록으로 돌아가기](./../../../)