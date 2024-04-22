package ref;

// import Student안해도 됨. 같은 패키지 안에 있는 즉, 같은 폴더에 있는 것은
// 자동으로 불러와줌
public class Method1 {

    public static void main(String[] args) {
        Student student1 = new Student(); //x001
        // 아래처럼 하면 됨!
        System.out.println(student1); // ref.Student@2f4d3709

        initStudent(student1, "학생1", 15, 90);

        Student student2 = new Student(); //x002
        initStudent(student2, "학생2", 16, 80);

        Student student3 = new Student();
        initStudent(student3, "학생3", 111, 100);
        // 흠. 근데 아직도 부족 -> 두줄을 한 줄로도 할 수 잇음! -> method2

        printStudent(student1);
        printStudent(student2);
        printStudent(student3);
    }

    // Student객체도 불러와야, 그 하위 속성들인 name, age, grade적용도 가능하겠지
    static void initStudent(Student student, String name, int age, int grade) {
        student.name = name; // 우측의 name이 함수의 매개변수임 ㅇㅇ
        student.age = age;
        student.grade = grade;
    }

    static void printStudent(Student student) {
        System.out.println("이름:" + student.name + " 나이:" + student.age + " 성적:" + student.grade);
    }
}
