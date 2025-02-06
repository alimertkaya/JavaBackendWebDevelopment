public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        note = 0;
    }

    public void addTeacher(Teacher teacher) {
        if (this.prefix.equals(teacher.branch))
            this.teacher = teacher;
        else
            System.out.println(teacher.name + " cannot teach this course.");
    }

    public void printTeacher() {
        if (teacher != null)
            System.out.println("Instructor for " + this.name + " course: " + teacher.name);
        else
            System.out.println("No instructor has been assigned to " + this.name + " course.");
    }
}
