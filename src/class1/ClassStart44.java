package class1;

public class ClassStart44 {

    public static void main(String[] args) {
        Student student1 = new Student(); //x001
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); //x002
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;


        Student[] students = new Student[2]; // 와 이게 되네 클래스도 배열처럼!
        students[0] = student1; // 주의할 점은. student1의 참조값인 x001을 담는거임. 주의하셈!
        students[1] = student2; // 실제값들을 담는게 아님. 따라서 아래처럼 print찍으면 주소값이 나옴

        System.out.println(students); // [Lclass1.Student;@2f4d3709
        System.out.println(students[0]); // class1.Student@4e50df2e
        System.out.println(students[1]); // class1.Student@1d81eb93
        System.out.println(students[1].name); // 이렇게 해야 비로소 값이 나옴
    }
}
