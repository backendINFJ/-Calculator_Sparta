package calculator2;
 // 부모 클래스 -> 더하기,빼기,곱하기,나누기,나머지를 자식 클래스로 상속하여 효율적인 코드관리 목적
public class Calculator {
     private char type;
     private double num1;
     private double num2; // 상속 외 호출방지

     public Calculator(char type, double num1, double num2) { // 인수 생성자 생성
         this.type = type;
         this.num1 = num1;
         this.num2 = num2;
         cal(type, num1, num2);  // 실전자바 - 기본편 12강 생성자 - 도입  이해참고!! 저는 2번봤습니다 ㅋㅋ..

     }

     // char 사용한 이유는 String보다 메모리 할당이 낮기때문 +
// String 사용시 오타 기입 가능성 있고 제약할 범위가 넓어짐 = 비효율적 (개인적인 생각)
     public void cal(char type, double num1, double num2) { // 계산 메서드
         if (type == '+') {
             double result = num1 + num2; // 덧셈
             System.out.println("결과 : " + result);
         } else if (type == '-') {
             double result = num1 - num2; // 뺄셈
             System.out.println("결과 : " + result);
         } else if (type == '*') {
             double result = num1 * num2; // 곱셈
             System.out.println("결과 : " + result);
         } else if (type == '/') {
             double result = num1 + num2; // 나눗셈
             System.out.println("결과 : " + result);
         } else if (type == '%') {
             double result = num1 % num2; // 나머지
         } else {
             System.out.println("수행범위는 사칙연산 입니다.");
         }
     }
 }