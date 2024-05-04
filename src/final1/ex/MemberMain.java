package final1.ex;

public class MemberMain {

    public static void main(String[] args) {
        Member member = new Member("myId", "kim");
        member.print();
        // 만약, pk키인 id에 final을 안 줘서 아래처럼 id가 바뀐다?
        // ㄹㅇ재앙 그 자체임. 여태 모든 데이터들도 myId->myId2로 바꿔줘야 함
        member.changeData("myId2", "seo");
        member.print();
    }
}
