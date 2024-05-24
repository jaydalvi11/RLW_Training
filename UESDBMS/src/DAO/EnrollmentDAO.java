package DAO;

import Models.Enrollment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EnrollmentDAO {

    public void enrollStudent(Connection connection, Enrollment enrollment) throws SQLException {
        String query = "INSERT INTO enrollments (student_id, course_id, enrollment_date) VALUES (?, ?, ?)";

        try(PreparedStatement prepstmt = connection.prepareStatement(query)){
            prepstmt.setInt(1,enrollment.getStudentId());
            prepstmt.setInt(2,enrollment.getCourseId());
            prepstmt.setDate(3, enrollment.getEnrollmentDate());
            prepstmt.executeUpdate();
            System.out.println("Student enrollment successful.");
        }
    }
}
