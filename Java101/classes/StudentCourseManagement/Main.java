import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Course math = new Course("Matematik", "MAT101", "MAT");
        Course physics = new Course("Fizik", "FZK101", "FZK");
        Course chemistry = new Course("Kimya", "KMY101", "KMY");

        Teacher teacher1 = new Teacher("Jale", "90550000", "MAT");
        Teacher teacher2 = new Teacher("Ali", "90550001", "FZK");
        Teacher teacher3 = new Teacher("Sibel", "90550002", "KMY");

        math.addTeacher(teacher1);
        physics.addTeacher(teacher2);
        chemistry.addTeacher(teacher3);

        Student student1 = new Student("Mert", "222200300", 4, math, physics, chemistry);
        student1.addBlukExamNote(50,20,40);
        student1.isPass();

        Student student2 = new Student("Kuzey", "222200301", 4, math, physics, chemistry);
        student2.addBlukExamNote(100,50,40);
        student2.isPass();

        Student student3 = new Student("Cemre", "222200302", 4, math, physics, chemistry);
        student3.addBlukExamNote(50,20,40);
        student3.isPass();

    }
}
