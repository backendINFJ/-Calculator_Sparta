package calculator2;

public class Main {
    // 계산 메서드
    public static void main(String[] args) {
        Calculator result= new Calculator('+',15,16); // 객체를 생성하는 동시에 생성자를 호출
        Calculator result1 = new Calculator('-',15,16);
        Calculator result3 = new Calculator('*',15.3,16.3);
        Calculator result4 = new Calculator('/',15,16);
        Calculator result5 = new Calculator('%',15,16);

        }
    }

    // 총 부족했던 개념들 :
    // 상속 & 포함관계, 컬렉션 필드, 추상 클래스,인터페이스,Setter,Getter