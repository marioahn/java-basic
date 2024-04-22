package ref;

public class VarChange1 {

    public static void main(String[] args) {
        int a = 10;
        int b = a; // 중요한.건 값을 복사해서 대입하는 거임. a가 그대로 들어가는게 아니라,
        // a의 값인 10이 복.사.돼서 들어가는 것
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //a 변경
        a = 20;
        System.out.println("변경  a = 20");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //b 변경
        b = 30;
        System.out.println("변경  b = 30");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
