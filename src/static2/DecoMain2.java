package static2;

public class DecoMain2 {

    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil2.deco(s); // 호우! static메서드니까, 인스턴스 생성안하고도 쓰임!

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}
