package calculator2;


public class AddOperation extends Calculator { // 부모 클래스 상속
    public AddOperation(char type, double num1, double num2) {
        super(type, num1, num2); // super() https://kadosholy.tistory.com/93 참고
        //  super.type = type;  // type num1,num2 는 private로 접근제어

    }
}

