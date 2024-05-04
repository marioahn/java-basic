package static1;

public class DataCountMain3 {

    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count=" + Data3.count); // 클래스에 바.로접근 ㅇㅇ.

        Data3 data2 = new Data3("B");
        System.out.println("B count=" + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count=" + Data3.count);

        // 정적변수 추가
            // 인스턴스를 통한 접근도 가능! -> 근.데.권장은 안함
            // 생각해보셈. data4.count하면 이게 인스턴스 변수라고 생각들잖아
            // 누가 static변수라고 생각하겠음ㅇㅇ
        Data3 data4 = new Data3("D");
        System.out.println(data4.count);

            //클래스를 통한 접근은 당연히 ok -> 권장방식
        System.out.println(Data3.count);
    }
}
