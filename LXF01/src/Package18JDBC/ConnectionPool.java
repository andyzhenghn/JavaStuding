package Package18JDBC;

public class ConnectionPool {
    public static void main(String[] args) {
        /**
            HikariConfig config = new HikariConfig();
            config.setJdbcUrl("jdbc:mysql://localhost:3306/test");
            config.setUsername("root");
            config.setPassword("password");
            config.addDataSourcePropery("connectionTimeout", "1000"); // 连接超时 1秒
            config.addDataSourcePropery("idleTimeout", "60000");      // 空闲超时 60秒
            config.addDataSourcePropery("maximumPoolSize", "10");     // 最大连接数 10
            DataSource ds = new HikariDataSource(config)
         */
    }
}

/**
 * 小结
 * 数据库连接池是一种复用 Connection的组件，它可以避免反复创建新连接，提高 JDBC代码的运行效率
 * 可以配置连接池的详细参数并监控连接池
 */
