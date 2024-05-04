package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        publicValue = 1;
        protectedValue = 1; //상속 관계(다른패키지여도) or 같은 패키지
        //defaultValue = 1; //다른 패키지 접근 불가, 컴파일 오류
        //privateValue = 1; //접근 불가, 컴파일 오류

        publicMethod();
        protectedMethod(); //상속 관계 or 같은 패키지
        //defaultMethod(); //다른 패키지 접근 불가, 컴파일 오류
        //privateMethod(); //접근 불가, 컴파일 오류

        printParent();
        // 이렇게는 가능함.ㅇㅇ printParent에서는 default, private을 쓰고 있음
        // 당연하지. 자기껀데. 자기클래스 안에서는 default, private도 사용가능함
        // -> 이렇게 하면 간접적으로 child에서도 부모의 default,private설정된 것을 불러올 수는 있네
    }
}
