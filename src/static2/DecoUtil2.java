package static2;

public class DecoUtil2 {

    // static을 붙임ㅇㅇ. 이건 클래스 메서드임 -> 정적으로, 전역으로 쓰겠다는 뜻
    // 인스턴스 메서드가 아니야. 인스턴스 생성안해도 쓸 수 있음!!
    public static String deco(String str) {
        String result = "*" + str + "*";
        return result;
    }
}
