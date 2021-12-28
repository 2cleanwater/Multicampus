# Java_Calendar

목표 : 
  1. 2020~2024년까지의 달력을 생성하는 프로그램
  2. 년도와 월을 입력하면 해당 월 출력
  3. 연도만 입력하면 1~12월 모두 출력
  4. 사용자가 원하는만큼 반복
  5. 해당 월과 년도는 콘솔에서 입력 가능
  6. 최대한 라인수를 줄여서 작성
\n
코드 :
\n

![캘린더 01](https://user-images.githubusercontent.com/32264455/147567456-c8434185-6801-4d71-adc2-2257cd8f8a06.png)
![캘린더 02](https://user-images.githubusercontent.com/32264455/147567461-262df53e-a8a0-4891-b325-10c9e69c56f9.png)
\n
소요기간 : 2일
\n
어려웠던 점 : 
  1. 처음 Java를 이용해봐서 라인수를 줄이기 힘들었다.
  2. Calendar 유틸 기능 중 요일을 알 수 있는 day_of_week, 블로그나 설명에는 일요일이 7 또는 0 으로 나와있는데 실제론 6, 월요일이 7, 화요일이 1이였다. (?)
  3. 메서드를 이용해 함수를 작성하는건 어렵지 않았지만 이중 for 문을 이용하지 않으려 하다보니 연산이 복잡해졌다.
  4. Scanner를 이용할 때 마지막에 close를 해주지 않으면 실행에 오류는 없지만 오류 메시지가 발생한다.
