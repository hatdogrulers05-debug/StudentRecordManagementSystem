package org.example.studentrecordmanagementsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Controller {

    public void addStudent(String name, String email) {
        String sql = "INSERT INTO students (name, email) VALUES (?, ?)";

        Connection conn = DBConnection.connect();

        if (conn == null) {
            System.out.println("❌ Cannot save: no database connection.");
            return;
        }

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.executeUpdate();
            System.out.println("✅ Student added successfully!");
        } catch (SQLException e) {
            System.out.println("Error adding student: " + e.getMessage());
        }
    }
}