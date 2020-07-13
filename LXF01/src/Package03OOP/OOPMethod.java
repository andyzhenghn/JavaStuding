package Package03OOP;

public class OOPMethod {
    private String name;

    public OOPMethod(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

/**
 * 小结：
 * 方法可以让外部代码安全地访问实例字段
 * 方法是一组执行语句，并且可以执行任意逻辑
 * 方法内部遇到 return时返回，void表示不返回任意值（注意和返回 null不同）
 * 外部代码通过 public方法操作实例，内部代码可以调用 private方法
 * 理解方法的参数绑定
 */
