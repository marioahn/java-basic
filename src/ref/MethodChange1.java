package ref;

public class MethodChange1 {
    // 자바대원칙: 자바는 항상 변수의 값을 복사해서 대입한다
        // 기본형이면 변수에 들어 있는 실.제 사용하는 값을 복사해서 대입하고,
        // 참조형이면 변수에 들.어 있는 참.조.값을 복사

    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전: a = " + a);
        changePrimitive(a);
        System.out.println("메서드 호출 후: a = " + a);
        // 다 10이 출력.
        // 자 보자. int x에 a를 대입한다. 그럼 x = a가 되는 것. a값이 복사돼서 x에 대입되거
        //, 함수안에서 x는 20이 되는거임. -> a가 20이 되는게 아니고
        // 따라서, a랑은 하등 상관없음. 따라서. 메서드 전후 모두 a는 10임!
    }

    static void changePrimitive(int x) {
        x = 20;
        int a = 30; // 이렇게 해도 지역변수 전역변수 다른거니까 어차피 위 프린트문 a는 모두 10
    }
}
