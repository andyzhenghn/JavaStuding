package Package18JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 利用循环去执行每个 PreparedStatement虽然可行，但是性能很低
 * 可作为 batch执行，即批量执行，性能有优化
 */

public class Batch {
    public static void main(String[] args) throws SQLException {
        String JDBC_URL = "jdbc:mysql://localhost:3306/learnjdbc";
        String JDBC_USER = "root";
        String JDBC_PASSWORD = "admin";
        String[] names = {"aa", "bb", "cc"};
        boolean gender = false;
        int grade = 1;
        int score = 99;

        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            try (PreparedStatement ps = conn.prepareStatement("INSERT INTO students (name, gender, grade, score) VALUES (?, ?, ?, ?)")) {
                // 对同一个 PreparedStatement反复设置参数并调用 addBatch()
                for (String name : names) {
                    ps.setString(1, name);
                    ps.setBoolean(2, gender);
                    ps.setInt(3, grade);
                    ps.setInt(4, score);
                    // 添加到 batch
                    ps.addBatch();
                }
                // 执行 batch
                int[] ns = ps.executeBatch();
                for(int n : ns) {
                    System.out.println(n + " inserted.");
                }
            }
        }
    }
}

/**
 * 小结
 * 使用 JDBC的 batch操作会大大提高执行效率，对内容相同，参数不同的 SQL，要优先考虑 batch操作
 */
