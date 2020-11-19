package com.study.LXF01.Package18JDBC;

import java.sql.*;

public class Update {
    public static void main(String[] args) throws SQLException {
        String JDBC_URL = "jdbc:mysql://localhost:3306/learnjdbc";
        String JDBC_USER = "root";
        String JDBC_PASSWORD = "admin";
        insertOperator(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
        updateOperator(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
        deleteOperator(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
    }

    public static void insertOperator(String url, String user, String password) throws SQLException {
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            try (PreparedStatement ps = conn.prepareStatement(
                    "INSERT INTO students (/** id, */ grade, name, gender) VALUES (/** ?, */ ?,?,?)",
                    // 指定标志位，表示 JDBC驱动必须返回插入的自增主键
                    Statement.RETURN_GENERATED_KEYS)) {
                // ps.setObject(1, 999);
                ps.setObject(2, 1);
                ps.setObject(3, "Bob");
                ps.setObject(4, "M");
                int n = ps.executeUpdate();

                try (ResultSet rs = ps.getGeneratedKeys()) {
                    if (rs.next()) {
                        long id = rs.getLong(1);
                    }
                }
            }
        }
    }

    public static void updateOperator(String url, String user, String password) throws SQLException {
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            try (PreparedStatement ps = conn.prepareStatement("UPDATE students SET name=? WHERE id=?")) {
                ps.setObject(1, "Bob");
                ps.setObject(2, 999);
                int n = ps.executeUpdate();
            }
        }
    }

    public static void deleteOperator(String url, String user, String password) throws SQLException {
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            try (PreparedStatement ps = conn.prepareStatement("DELETE FROM students WHERE id=?")) {
                ps.setObject(1, 999);
                int n = ps.executeUpdate();
            }
        }
    }
}

/**
 * 小结
 * 使用 JDBC执行 INSERT、UPDATE和 DELETE都可视为更新操作
 * 更新操作使用 PreparedStatement和 executeUpdate()进行，返回受影响的行数
 */
