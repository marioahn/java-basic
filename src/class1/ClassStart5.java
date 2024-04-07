package class1;

public class ClassStart5 {

    public static void main(String[] args) {
        Student student1 = new Student(); //x001
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); //x002
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        // 이.렇.게 할 수 있음!! new Student[]{~~,~~};
        Student[] students = new Student[]{student1, student2};

        for (int i = 0; i < students.length; i++) {
            // Student s = students[i]와도 같이 가능. 아래 향상포문에서도 이런 느끼임ㅇㅇ.
            System.out.println("이름:" + students[i].name + " 나이:" + students[i].age + " 성적:" + students[i].grade);
        }

        // 향상된 포문으로도!,
        // 그냥 s가 아니라 Stuent s이렇게 해줘야 함. 타입을 써줬잖아.
        // 여기서도 s는 클래스를 써주는데 이게 타입 대신이지 뭐
        for (Student s: students) {
            System.out.println(s.name + " " + s.age + " " + s.grade);
        }

    }
}
