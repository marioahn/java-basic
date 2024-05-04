package final1.ex;

public class Member {

    private final String id; //final 키워드 사용
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void changeData(String id, String name) {
        //this.id = id; //컴파일 오류 - 되겠냐? 위에서 이미 한번 바꿔줬는데!
        // 와 이렇게 메서드들이 정의만 되었는데도, 인식을 해주네 - 실행한 경우가 아님에도ㅇㅇ;
        // 메서드들 정의할대 이런 점들 주의!
        this.name = name;
    }

    public void print() {
        System.out.println("id:" + id + ", name:" + name);
    }

}
