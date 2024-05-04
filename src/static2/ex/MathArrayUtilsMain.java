package static2.ex;

import static static2.ex.MathArrayUtils.*;

public class MathArrayUtilsMain {

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        // 바로 sum(), average().. 호출했음 -> 위에 import static이 있기 때문!
        System.out.println("sum=" + sum(values));
        System.out.println("average=" + average(values));
        System.out.println("min=" + min(values));
        System.out.println("max=" + max(values));
        
        // MathArrayUtils a = new MathArrayUtils();
        // 에러 -> 아! 막아뒀구나. 그럼, 생성자 만들면 안되겠다는 메세지 can get
        // -> 아! 그러면, 생성하지말고, 그냥 static으로 쓰라는 뜻이구나!

    }
}
