package ref;

public class MethodChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전: dataA.value = " + dataA.value);
        System.out.println("dataA=" + dataA);
        changeReference(dataA);
        System.out.println("메서드 호출 후: dataA.value = " + dataA.value);
        // 이건 당.연.히 바뀌어야겠지 - 이유? methodchange1 주석에 원리 써있음 ㅇㅇ.
        // 이건 참조형 주소니까 연계되는 것 - 전역변수,지역변수 개념이랑은 또 다른것
        // 근본.은. 어찌되었든 dataA, dataB 두 변수가 똑같.은 참조값(주소)을 가지기 때문에,
        // 한개가 값이 바뀌면 둘다 바뀌게 되는 것
        /*
        메서드 호출 전: dataA.value = 10
        dataA=ref.Data@27973e9b
        dataX=ref.Data@27973e9b
        메서드 호출 후: dataA.value = 20
        */
    }

    static void changeReference(Data dataX) {
        System.out.println("dataX=" + dataX);
        dataX.value = 20;
    }
}
