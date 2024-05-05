package extends1.super2;

public class ClassB extends ClassA {

    public ClassB(int a) {
        this(a, 0); //기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a=" + a);
    }

    public ClassB(int a, int b) {
        super(); //기본 생성자 생략 가능
        // super()변수에 아무것도 없다는건 classA에 ClassA() {~}이렇게 기본생성자란 뜻이니까
        // super()도 생략 가능한거임ㅇ. super(10,20)이런게 있으면 기본생성자 아님ㅇ
        System.out.println("ClassB 생성자 a=" + a + " b=" + b);
    }
}
