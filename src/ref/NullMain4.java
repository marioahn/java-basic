package ref;

public class NullMain4 {

    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data(); // 이거만 추가하며 ㄴ해결됨!
        System.out.println("bigData.count=" + bigData.count);
        System.out.println("bigData.data=" + bigData.data);

        //NullPointerException -> 이제 안남
        System.out.println("bigData.data.value=" + bigData.data.value);
    }
}
