package src.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/pundar_system"; // Your DB name
    private static final String USER = "root"; // Your DB username
    private static final String PASSWORD = "password"; // Your DB password

    public static Connection getConnection() throws SQLException {
        // Optionally, you can still load the driver manually
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Optional, can be omitted in newer versions
        } catch (ClassNotFoundException e) {
            throw new SQLException("MySQL JDBC Driver not found", e);
        }
        return DriverManager.getConnection(URL, USER, PASSWORD);

    }
}

