package ref;

public class NullMain1 {

    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data);
        data = new Data();
        System.out.println("2. data = " + data);
        data = null;
        System.out.println("3. data = " + data);
//        1. data = null
//        2. data = ref.Data@1d81eb93
//        3. data = null - 2의 ref.주소는 이제 다시 찾을 수 없음 -> gc에 의해 사라짐

//        int num = null;  // <nulltype> cannot be converted to int <- 기본형은 null값 할당x
    }
}
