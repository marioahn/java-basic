package ref;

public class NullMain3 {

    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count=" + bigData.count);
        System.out.println("bigData.data=" + bigData.data);
//      bigData.count=0
//      bigData.data=null

        System.out.println("bigData.data.value" + bigData.data.value);
        // 여기서 - NullPointerException가 나타난다.
    }
}
