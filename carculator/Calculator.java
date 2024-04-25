package carculator;

public class Calculator {

    AddOperation addOperation = new AddOperation(); // 덧셈 인스턴스

    AbstractOperation abstractOperation = new AbstractOperation(); // 뺼셈 인스턴스

    MultiplyOperation multiplyOperation = new MultiplyOperation(); // 곱셈 인스턴스

    DivideOperation divideOperation = new DivideOperation(); // 나눗셈 || 나머지 인스턴스

}

// 인스턴스를 생성한 객체 안에 있는