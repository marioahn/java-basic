package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        // 헉;; 참.조.형도 final이 가능하네!?!?!?!?
        final Data data = new Data();
        // data = new Data(); // 되겠냐 이게?? final이니까 못 바꿈ㅇㅇ

        // 다만, 참조 대상의 값은 변경 가능. 엣;; 그..런거구나;
        // final 참조형은 참조객.체.의 주소값만 못 바꾸는 그런 개념임
        // 그니까, 참조 대상을 다른 대상으로 바꾸지 못한다는거지, 내부의 값을 바꿀 수 없다는게 아님
        // 내가 이집에서, 저 집으로 못간다는거지. 나의 식사량같은건 내 자유롭게 늘리거나 할 수 있는거임
        // 내가 집 옮기는게 묶인거는 강제성인데, 식사량 줄이고 늘리고는 자유롭게 할 수 있잖아!
            // 물론, 갑자기 전세금때문에 묶이면 ㅈ같아서 스트레스때메 식사량에 영향갈 수 있음
            // 이렇듯, 연관이 되어있으니 식사량도 같이 "묶인"다는 속성o라고 생각 can
            // 하지만, 아니죠? 스트레스받으니까 식사량 줄이거나 늘릴 수 있죠?
            // 물론, 솔직히 위 비유가 10점짜리 비유이긴하지만 뭐. 컨셉만 이해하자ㅇㅇ
        // 비슷한 구조같아보이면서도, 전혀 다른 것들임 이건ㅇㅇ.
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
