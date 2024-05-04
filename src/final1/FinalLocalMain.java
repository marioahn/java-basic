package final1;

public class FinalLocalMain {

    public static void main(String[] args) {
        //final 지역 변수1
        final int data1;
        data1 = 10; //최초의 한번만 할당 가능!!
        //data1 = 20; //컴파일 오류

        //final 지역 변수2
        final int data2 = 10;
        //data2 = 20; //컴파일 오류
        method(10);
    }

    static void method(final int parameter) {
        // 매.개.변수로 할당받은 이 상수를 함수 안에서 다시 할당? -> 불.가
        // 최초할당은 이미 매개변수에 숫자넣은순간 된 셈이다!
        // 와 이건 좀 헷갈릴만 하네 ㄷㄷㄷㄷ
        //parameter = 20; //컴파일 오류
    }
}
