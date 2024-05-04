package final1;

public class ConstantMain1 {

    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 " + 1000);
        int currentUserCount = 999;
        // 후.위연산자니까, 일단 999에 넣고, 함수내용끝나면 맨.마지막에 ++되는거임ㅇㅇ
        process(currentUserCount++); // 999에서 ㄱㄱ
        process(currentUserCount++); // 1000에서 함수ㄱㄱ
        process(currentUserCount++); // 1001상태에서 ㄱㄱ하고, 마지막에 1002됨

        System.out.println(currentUserCount); // 1002
    }

    private static void process(int currentUserCount) {
        System.out.println("참여자 수:" + currentUserCount);
        if (currentUserCount > 1000) {
            System.out.println("대기자로 등록합니다.");
        } else {
            System.out.println("게임에 참여합니다.");
        }
    }
}
