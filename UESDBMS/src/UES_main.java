import DAO.CourseDAO;
import DAO.EnrollmentDAO;
import DAO.StudentDAO;
import Models.Course;
import Models.Enrollment;
import Models.Student;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class UES_main {
    public static void main(String[] args) throws SQLException {
        try(Connection connection = DatabaseConnection.getConnection()){
            System.out.println("Connected to database...");

            StudentDAO studentDao = new StudentDAO();
            CourseDAO courseDao = new CourseDAO();
            EnrollmentDAO enrollmentDao = new EnrollmentDAO();

            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("1. Add Student");
                System.out.println("2. Add Course");
                System.out.println("3. Enroll Student in Course");
                System.out.println("4. View Courses for a Student");
                System.out.println("5. View Students in a Course");
                System.out.println("6. Exit");
                System.out.print("Choose an option: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter student name: ");
                        String studentName = sc.next();
                        System.out.print("Enter student major: ");
                        String studentMajor = sc.next();
                        Student student = new Student();
                        student.setName(studentName);
                        student.setMajor(studentMajor);
                        studentDao.addStudent(connection, student);
                        break;
                    case 2:
                        System.out.print("Enter course name: ");
                        String courseName = sc.next();
                        System.out.print("Enter course credits: ");
                        int courseCredits = sc.nextInt();
                        Course course = new Course();
                        course.setCourseName(courseName);
                        course.setCredits(courseCredits);
                        courseDao.addCourse(connection, course);
                        break;
                    case 3:
                        System.out.print("Enter student ID: ");
                        int studentId = sc.nextInt();
                        System.out.print("Enter course ID: ");
                        int courseId = sc.nextInt();
                        Enrollment enrollment = new Enrollment();
                        enrollment.setStudentId(studentId);
                        enrollment.setCourseId(courseId);
                        enrollment.setEnrollmentDate(new java.sql.Date(System.currentTimeMillis()));
                        enrollmentDao.enrollStudent(connection, enrollment);
                        break;
                    case 4:
                        System.out.print("Enter student ID: ");
                        int sid = sc.nextInt();
                        List<Course> courses = studentDao.getCoursesForStudent(connection, sid);
                        for (Course c : courses) {
                            System.out.println("Course Name: " + c.getCourseName() + ", Credits: " + c.getCredits());
                        }
                        break;
                    case 5:
                        System.out.print("Enter course ID: ");
                        int cid = sc.nextInt();
                        List<Student> students = courseDao.viewStudentsInCourse(connection, cid);
                        for (Student s : students) {
                            System.out.println("Student Name: " + s.getName());
                        }
                        break;
                    case 6:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }

        }
    }
}