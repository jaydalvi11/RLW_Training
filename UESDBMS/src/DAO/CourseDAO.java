package DAO;

import Models.Course;
import Models.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CourseDAO {

    public void addCourse(Connection connection, Course course) throws SQLException {
        String query = "INSERT INTO courses (course_name, credits) VALUES (?, ?)";

        try(PreparedStatement prepstmt = connection.prepareStatement(query)){
            prepstmt.setString(1,course.getCourseName());
            prepstmt.setInt(2, course.getCredits());
            prepstmt.executeUpdate();
            System.out.println("Course added successfully !");
        }
    }

    public List<Student> viewStudentsInCourse(Connection connection, int courseID) throws SQLException {
        List<Student> stlist = new ArrayList<>();
        String query = "SELECT s.name FROM students s " +
                        "JOIN enrollments e " +
                        "ON s.student_id = e.student_id " +
                        "WHERE e.course_id = ?";

        try(PreparedStatement prepstmt = connection.prepareStatement(query)){
            prepstmt.setInt(1, courseID);
            ResultSet rs = prepstmt.executeQuery();
            while(rs.next()){
                Student stud = new Student();
                stud.setName(rs.getString("name"));
                stlist.add(stud);
            }
        }
            return stlist;
    }

}
