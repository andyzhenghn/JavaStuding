package Package18JDBC;

/**
 * JDBC
 * java database connectivity的缩写，是 java程序访问数据库的标准接口
 * 使用 java程序访问数据库时，java代码并不是直接通过 tcp连接去访问数据库，而是通过 jdbc接口来访问，而 jdbc接口则通过 jdbc驱动来实现真正对数据库的访问
 */

public class Introduction {
}

/**
 * 小结
 * 使用 jdbc的好处是：
 *  各数据库厂商使用相同的接口，java代码不需要针对不同数据库分别开发
 *  java程序编译期仅依赖 java.sql包，不依赖具体数据库的 jar包
 *  可随时替换底层数据库，访问数据库的 java代码基本不变
 */
