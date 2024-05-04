package static1;

public class Data2 {
    public String name;

    // 어우 생성할때마다 그냥 자동으로 count가 ++되네.
    // 먼가 pk넘버가 올라가는 그런 느낌인데!
    public Data2(String name, Counter counter) {
        this.name = name;
        counter.count++;
    }
}
