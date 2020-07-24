package Package09IO;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * PrintStream是一种 FilterOutputStream
 * System.out.println()实际就是使用 PrintStream打印各种数据
 * System.out是系统默认提供的 PrintStream，表示标准输出
 * System.err是系统默认提供的标准错误输出
 */

public class PrintStreamAndPrintWriter {
    public static void main(String[] args) {
        StringWriter buffer = new StringWriter();
        try (PrintWriter pw = new PrintWriter(buffer)) {
            pw.println("Hello");
            pw.println(12345);
            pw.println(true);
        }
        System.out.println(buffer.toString());
    }
}

/**
 * 小结
 * PrintStream是一种能接受各种数据类型的输出，打印数据时比较方便
 * PrintWriter是基于 Writer的输出
 */
