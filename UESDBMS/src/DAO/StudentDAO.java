package DAO;

import Models.Course;
import Models.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    public void addStudent(Connection connection, Student student) throws SQLException {
        String query = "INSERT INTO STUDENTS (NAME,MAJOR) VALUES (?, ?)";
        try(PreparedStatement prepstmt = connection.prepareStatement(query)){
            prepstmt.setString(1, student.getName());
            prepstmt.setString(2, student.getMajor());
            prepstmt.executeUpdate();
        }
    }

    public List<Course> getCoursesForStudent(Connection connection, int studentID) throws SQLException {
        List<Course> crlist = new ArrayList<>();
        String query = "SELECT c.course_name, c.credits FROM courses c " +
                        "JOIN enrollments e " +
                        "ON c.course_id = e.course_id " +
                        "WHERE e.student_id = ?";

        try(PreparedStatement prepstmt = connection.prepareStatement(query)) {
            prepstmt.setInt(1, studentID);
            ResultSet rs = prepstmt.executeQuery();

            while (rs.next()){
                Course course = new Course();
                course.setCourseName(rs.getString("course_name"));
                course.setCredits(rs.getInt("credits"));
                crlist.add(course);
            }
        }
        return crlist;
    }

}
