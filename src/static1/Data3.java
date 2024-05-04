package static1;

public class Data3 {
    public String name; // 이건 각 개별 변수임 - 인스턴스만들어질때마다 추가되는, 새로 만들어지는!
    // 즉, 이런 것을 인스턴스 변수라고 부른다
    public static int count; //static - 이거지. 이렇게 함 ㅇㅇ전역변수로 쓰겠다는 뜻임
    // 인스턴스 만들든 말든, 이건 Data3클래스의 고유의, 전역 변수임ㅇㅇ = 정적변수 = 클래스 변수

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
