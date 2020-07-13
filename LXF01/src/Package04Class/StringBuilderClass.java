package Package04Class;

public class StringBuilderClass {
    public static void main(String[] args) {
        String s = "";
        // 每次循环都会创建新的字符串对象，然后扔掉旧的字符串，浪费空间
        for (int i = 0; i < 100; i++) {
            s = s + "," + i;
        }

        // StringBuilder是个可变对象，预分配缓冲区，新增字符时，不会创建新的临时对象
        StringBuilder sb = new StringBuilder(1024);
        for (int i = 0; i < 1000; i++) {
            // 支持链式调用
            sb.append(',')
              .append(i)
              .append('!');
        }
    }
}

/**
 * 小结：
 * StringBuilder是可变对象，用来高效拼接字符串
 * StringBuilder可以支持链式操作，实现链式操作的关键是返回实例本身
 * StringBuffer是 StringBuilder的线程安全版本，现在很少使用
 */