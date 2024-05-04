package static2;

public class DecoMain1 {

    public static void main(String[] args) {
        String s = "hello java";
        DecoUtil1 utils = new DecoUtil1();
        String deco = utils.deco(s);
        // 솔직히, 여기서 객체 생성 왜 한거임? -> 의미 전혀 없음! deco만 있는건데.
        // -> 그래서 DecoMain2에서는 static메서드로 deco()함수를 선언하고, 걍 클래스에서 바로 가져온거임
        // (인스턴스 생성없이!)

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}
