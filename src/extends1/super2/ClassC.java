package extends1.super2;

public class ClassC extends ClassB {

    public ClassC() {
        // classB는 기본생성자가 없기때문에, super생략불가능함
        super(10, 20);
        // super(10); // 이건 B의 생성자 2개가 다 나옴ㄷㄷ
        System.out.println("ClassC 생성자");
    }
}
