package static1;

public class DataCountMain2 {

    public static void main(String[] args) {
        Counter counter = new Counter();
        Data2 data1 = new Data2("A", counter);
        System.out.println("A count=" + counter.count);

        Data2 data2 = new Data2("B", counter);
        System.out.println("B count=" + counter.count);

        Data2 data3 = new Data2("C", counter);
        System.out.println("C count=" + counter.count);
        // 여기선, 1,2,3이 나옴 ㅇㅇ Counter클래스 따로 만들고, 인스턴스 1개 만든다음에
        // 모두 각각 여기서 만든 하.나.의 인스턴스인 counter로 ++시켰으니까
        // -> 그런데, 이게 최선인가? 굳이 Counter클래스 -> 인스턴스 번거롭게 새로 추가해야 함?
        // 다른 방법있음 -> Main3ㄱㄱ
            // (즉, 외부변수 도움 없이 할 수 있는 것)
            // -> 그게 바로 static임!
    }
}
