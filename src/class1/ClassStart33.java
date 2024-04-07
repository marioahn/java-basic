package class1;

public class ClassStart33 {

    public static void main(String[] args) {
        // 이처럼 클래스는 설.계.도.이다
        // 이러한 설계도를 바탕으로 아래처럼 실.제.메모리에 할당해서 쓰는 것
        // 표준처럼. 설계도는 표준임ㅇㅇ
        // 이러한 설계도를 가지고 실제로 만든 것들을 객체, 인스턴스라고 함
        // student1,2는 객체, 인스턴스임 = 실제(설계도를 실제로 만든 것)
        // 무.엇.보다 같.은 패키지 안에 있으므로 따로 Student.java파일 import export안해도 되나보네 ㄷㄷ;
        Student student1;
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;
//        student2.ohoho = 100; // 당연히 에러겠지. 설계도에 ohoho필드는 없으니까!


        System.out.println(student1.name);
        System.out.println(student2.name);
        System.out.println(student1);
        System.out.println(student2);
//        class1.Student@2f4d3709 @뒤가 참조값들임 ㅇㅇ.
//        class1.Student@4e50df2e
    }
}
