package ref;

public class InitMain {
    public static void main(String[] args) {
        InitData data = new InitData();
        // 멤버 변수는 초기화를 안해주면, 자동으로 0이 할당된다!
        System.out.println("value1 = " + data.value1);
        System.out.println("value2 = " + data.value2);
    }
}
