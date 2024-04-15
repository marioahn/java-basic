package ref;

public class VarChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA; //참.조.값이 들어감. 즉, 값이 아니라 위치정보가.
        // dataA라는 인스턴스값을 복사하는게 아니란 것! -> 참.조.값

        System.out.println("dataA 참조값="+ dataA);
        System.out.println("dataB 참조값="+ dataB);
        // 두.개.의 참조값이 같음ㅇㅇ.
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value); // 같음

        //dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value); // dataB.value도 같음!!

        //dataB 변경
        dataB.value = 30; // A랑 B랑 같은 것을 가리키므로 B를 바꾸면 A도 바뀌는 것
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);
    }
}
