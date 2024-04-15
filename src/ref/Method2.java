package ref;

public class Method2 {

    public static void main(String[] args) {
        // 아 아예 new Student()부분을 빼고, 생성을 그 자리에서 바로 해버리네 함수로
        Student student1 = createStudent("학생1", 15, 90);
        System.out.println("student1=" + student1);
        // student1= ref.Student@2f4d3709 <- 이렇게 주.소.값이 출력됨 ㄷㄷㄷ;;
        Student student2 = createStudent("학생2", 16, 80);
        System.out.println("student2=" + student2);
        Student student3 = createStudent("학생3", 18, 100);

        printStudent(student1);
        printStudent(student2);
        printStudent(student3);
    }

    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        System.out.println("student=" + student);
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student; // return stduent까지 꼭!
    }

    static void printStudent(Student student) {
        System.out.println("이름:" + student.name + " 나이:" + student.age + " 성적:" + student.grade);
    }
}
