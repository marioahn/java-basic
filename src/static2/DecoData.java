package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    // static메서드는 절.대 인스턴스변수, 메서드를 사용할 수 없다.
    // 당연하지. 인스턴스가 만들어져야 활용되는건데, static메서드는 그 이전에 만들어진 것이잖아
    // 순.서가 맞지도 않음 -> 이걸 이후에 기억못하면 ㄹㅇ말도 안되는 수준임
    // 단, 그 반대는 가능함ㅇㅇ. 당연하지, 이전에 만들어진 것을 이후에 만들어진 인스턴스메서드,변수들이 가지고 놀 수 있다는 것은.
    public static void staticCall() {
        //instanceValue++; //인스턴스 변수 접근, compile error
        //instanceMethod(); //인스턴스 메서드 접근, compile error

        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }

    // 단, 이 경우는 가능함ㅇㅇ. 주의주의!!!!!!!!!!!!
        // 외.부에서 참조값이 들어오는 경우. ㅇㅇ 이 경우는 인스턴스변수에 당.엲.히접근가능
        // ㅇㅋ?? 당연한거임. 위랑 아래는 전-혀 다른 것
    public static void staticCall(DecoData data) {
        data.instanceValue++; 
        data.instanceMethod();
    }

    public void instanceCall() {
        instanceValue++; //인스턴스 변수 접근 - 당연히 됨
        instanceMethod(); //인스턴스 메서드 접근 - 당연히 됨

        staticValue++; //정적 변수 접근 - ok
        // 사실은, DecoData.staticValue처럼 'DecoData.'가 생략된거임ㅇㅇ
        staticMethod(); //정적 메서드 접근 - ok
    }


    // static이 없으니 이건 인스턴스 메서드임ㅇㅇ
    // static없으면? = 인스턴스 메서드. 기억하자
    private void instanceMethod() {
        System.out.println("instanceValue=" + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue=" + staticValue);
    }
}
