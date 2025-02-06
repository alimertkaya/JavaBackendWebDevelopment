public class Student {
    String name;
    String studentNumber;
    int grade;
    Course math;
    Course physics;
    Course chemistry;
    double average;
    boolean isPass;

    public Student(String name, String studentNumber, int grade, Course math, Course physics, Course chemistry) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.grade = grade;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        calcAverage();
        this.isPass = false;
    }

    public void addBlukExamNote(int mat, int fizik, int kimya) {
        if (mat >= 0 && mat <= 100)
            this.math.note = mat;
        if (fizik >= 0 && fizik <= 100)
            this.physics.note = fizik;
        if (kimya >= 0 && kimya <= 100)
            this.chemistry.note = kimya;
    }

    public void isPass() {
        if (this.math.note == 0 || this.physics.note == 0 || this.chemistry.note == 0)
            System.out.println("Grades have not been fully entered.");
        else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Average: " + this.average);

            if (this.isPass)
                System.out.println("Passed the class.");
            else
                System.out.println("Failed the class.");
        }
    }

    public void calcAverage() {
        this.average = (this.math.note + this.physics.note + this.chemistry.note) / 3.0;
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }

    public void printNote() {
        System.out.println("====================");
        System.out.println("Student: " + this.name);
        System.out.println("Math Grade: " + this.math.note);
        System.out.println("Physics Grade: " + this.physics.note);
        System.out.println("Chemistry Grade: " + this.chemistry.note);
    }
}
