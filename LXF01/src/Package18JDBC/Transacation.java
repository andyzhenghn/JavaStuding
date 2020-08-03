package Package18JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Transacation {
    public static void main(String[] args) throws SQLException {
        String JDBC_URL = "jdbc:mysql://localhost:3306/learnjdbc";
        String JDBC_USER = "root";
        String JDBC_PASSWORD = "admin";

        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            try {
                // 设置隔离级别
                // MySQL的默认隔离级别是REPEATABLE READ
                conn.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
                // 关闭自动提交
                conn.setAutoCommit(false);
                // 执行多条 sql语句
                // insert(); update(); delete();
                // 提交事务
                conn.commit();
            } catch (SQLException e) {
                // 回滚事务
                conn.rollback();
            } finally {
                conn.setAutoCommit(true);
                conn.close();
            }
        }
    }
}

/**
 * 小结
 * 数据库事务（Transaction）具有 ACID特性
 *  Atomicity: 原子性
 *  Consistency: 一致性
 *  Isolation: 隔离性
 *  Durability: 持久性
 * JDBC提供了事务的支持，使用 Connection可以开启、提交或回滚事务
 */
