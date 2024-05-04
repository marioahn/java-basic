package extends1.ex2;

public class Car {

    public void move() {
        System.out.println("차를 이동합니다.");
    }
    // 부.모.는 자식에 대해 알 수 없다. 여기서 자식정보가 있음? 전혀 없지
    // 따라서, 부모는 자식의 기능을 사용할 수 없다
    // 반면에, 자식은 extends로 누구를 상속받았는지 알 수 있잖아
}
