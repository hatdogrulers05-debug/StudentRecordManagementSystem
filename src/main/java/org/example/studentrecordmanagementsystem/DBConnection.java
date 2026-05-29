package org.example.studentrecordmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static Connection connect() {
        try {
            String url = "jdbc:postgresql://db.gxywvnvcfzaajwhvdkum.supabase.co:6543/postgres?sslmode=require";
            String user = "postgres";
            String pass = "YOUR_PASSWORD_HERE";

            Connection conn = DriverManager.getConnection(url, user, pass);
            System.out.println("✅ Connected to Supabase!");
            return conn;

        } catch (SQLException e) {
            System.err.println("❌ Connection failed: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}