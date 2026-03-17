import java.util.ArrayList;

public class Course {

    String courseName;

    Course(String courseName) {
        this.courseName = courseName;
    }

    void showCourse() {
        System.out.println("Course Name: " + courseName);
    }

    public static void main(String[] args) {

        OnlineCourse oc = new OnlineCourse("Java Programming");

        oc.registerStudents("Arun", "Bala", "Charan", "Divya");

        oc.showCourse();
        oc.showCourses();
        oc.showStudents();
    }
}

class OnlineCourse extends Course {

    ArrayList<String> students = new ArrayList<>();
    ArrayList<String> courses = new ArrayList<>();

    OnlineCourse(String courseName) {
        super(courseName);
        courses.add(courseName);
    }

    void registerStudents(String... names) {
        for (String name : names) {
            students.add(name);
        }
    }

    void showStudents() {
        System.out.println("Registered Students:");
        for (String s : students) {
            System.out.println(s);
        }
    }

    void showCourses() {
        System.out.println("Course List:");
        for (String c : courses) {
            System.out.println(c);
        }
    }
}
