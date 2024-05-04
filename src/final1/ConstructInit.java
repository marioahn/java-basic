package final1;

public class ConstructInit {

    final int value; // 얘는 초기값 할당이 안되어있으니 아래 생성자에서 (최초)할당이 되는 것
    // -> FieldInit에선 안됨. 이미 이쪽에서 할당이 되어있었으므로

    public ConstructInit(int value) {
        this.value = value;
    }
}
