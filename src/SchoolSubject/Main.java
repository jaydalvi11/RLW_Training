package RailworldJavaBasics.ObjectCollaboration.SchoolSubject;

public class Main {

    public static void main(String[] args) {
        School school = new School("Don Bosco");
        Subject subject = new Subject("Science");

        Student student = new Student("Jay", 18, school, subject);

        student.displayStudentData();
    }

}
