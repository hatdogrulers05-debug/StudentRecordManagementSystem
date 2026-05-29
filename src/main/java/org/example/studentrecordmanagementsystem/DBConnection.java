package org.example.studentrecordmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection connect() {
        try {
            return DriverManager.getConnection(
                    "jdbc:postgresql://db.gxywvnvcfzaajwhvdkum.supabase.co:6543/postgres?sslmode=require",
                    "postgres",
                    "SupaGithub26"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}