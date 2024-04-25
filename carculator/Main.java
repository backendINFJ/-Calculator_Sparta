package carculator;

public class Main {

    public static void main(String[] args) {

        double result = AddOperation.add(11.1, 10.1); // 덧셈 메서드 호출 // add에 있는걸 호출한거임 인스턴스를 호출한게 아니라
        System.out.println(result);

        double result1 = AbstractOperation.min(11.1, 10.1); // 덧셈 메서드 호출
        System.out.println(result);

        double result2 = MultiplyOperation.mul(11.1, 10.1); // 덧셈 메서드 호출
        System.out.println(result);

        double result3 = DivideOperation.div(11.1, 10.1); // 덧셈 메서드 호출
        System.out.println(result);

        double result4 = DivideOperation.div2(11.1, 10.1); // 덧셈 메서드 호출
        System.out.println(result);
    }
}
