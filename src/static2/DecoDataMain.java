package static2;

import static static2.DecoData.staticCall;
// 그냥 import가 아니라, import "static"이다!
// import static static2.DecoData.*; 이렇게 하면 모든 메서드 사용가능~

public class DecoDataMain {

    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
//        DecoData.staticCall();
        staticCall(); // 위에서 import해오면 이렇게도 사용 가능함
//        1. 정적 호출
//        staticValue=1

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();
//        2. 인스턴스 호출1
//        instanceValue=1
//        staticValue=2

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();
//        3. 인스턴스 호출2
//        instanceValue=1 -> 다시 1이 됨ㅇㅇ. 인스턴스변수니까 - 인스턴스끼리 공유가 아님ㅇㅇ
//        staticValue=3


        //추가
        //인스턴스를 통한 접근
        DecoData data3 = new DecoData();
        data3.staticCall(); // 4 -> 당연히, 권장x접근이니 노란줄 뜨겠지.
        // 이렇게 하면 인스턴스메서드처럼 보이잖아.

        //클래스를 통한 접근
        DecoData.staticCall(); // 5
    }
}
