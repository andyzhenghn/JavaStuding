package com.study.LXF01.Package18JDBC;

/**
 * 数据类型映射
 * sql数据类型              java数据类型
 * BIT,BOOL                 boolean
 * INTEGER                  int
 * BIGINT                   long
 * REAL                     float
 * FLOAT,DOUBLE             double
 * CHAR,VARCHAR             String
 * DECIMAL                  BigDecimal
 * DATE                     java.sql.Date,LocalDate
 * TIME                     java.sql.Time,LocalTime
 */

import java.sql.*;

public class Query {
    public static void main(String[] args) throws SQLException {
        String JDBC_URL = "jdbc:mysql://localhost:3306/learnjdbc";
        String JDBC_USER = "root";
        String JDBC_PASSWORD = "admin";

        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            // statement拼字符串非常容易引发 sql注入的问题
            try (Statement stmt = conn.createStatement()) {
                try (ResultSet rs = stmt.executeQuery("SELECT id, grade, name, gender FROM students WHERE gender=1")) {
                    while (rs.next()) {
                        long id = rs.getLong(1); // 索引从 1开始
                        System.out.println(id);
                        long grade = rs.getLong(2);
                        System.out.println(grade);
                        String name = rs.getString(3);
                        System.out.println(name);
                        int gender = rs.getInt(4);
                        System.out.println(gender);
                    }
                }
            }

            // 使用 preparedStatement可以完全避免 sql注入的问题，因为 preparedStatement始终使用 ?作为占位符，并且把数据连同 sql本身传给数据库
            try (PreparedStatement ps = conn.prepareStatement("SELECT id, grade, name, gender FROM students WHERE gender=? AND grade=?")) {
                ps.setObject(1, "M");
                ps.setObject(2, 3);
                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        long id = rs.getLong("id");
                        long grade = rs.getLong("grade");
                        String name = rs.getString("name");
                        String gender = rs.getString("gender");
                    }
                }
            }
        }
    }
}

/**
 * 小结
 * JDBC接口的 Connection代表一个 JDBC连接
 * 使用 JDBC查询时，总是使用 PreparedStatement进行查询而不是 Statement
 * 查询结果总是 ResultSet，即使使用聚合查询也不例外
 */
