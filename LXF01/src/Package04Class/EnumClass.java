package Package04Class;

/**
 * enum类
 * 为了让编译器自动检查某个值在枚举的集合内，并且不同用途的枚举需要不同的类型来标记，不能混用
 * 与其他类的区别：
 *  定义的 enum类型总是继承自 java.lang.Enum，且无法被继承
 *  只能定义出 enum的实例，而无法通过 new操作符创建 enum实例
 *  定义的每个实例都是引用类型的唯一实例
 *  可以将 enum类型用于 switch语句
 */
public class EnumClass {
    public static void main(String[] args) {
        // enum类的 name()方法返回当前枚举值的 name
        String name = Weekday.FRI.name();
        System.out.println(name);

        // enum类的 ordinal()方法返回当前枚举值的顺序
        // 枚举类的元素顺序改变，ordinal获取的顺序也会改变
        int ordinal = Weekday.FRI.ordinal();
        System.out.println(ordinal);

        Weekday wd = Weekday.MON;
        if (wd.dayValue == 6 || wd.dayValue == 0) {
            System.out.println(wd + " at home");
        } else {
            System.out.println(wd + " at office");
        }
    }
}

enum Weekday {
    // SUN, MON, TUE, WED, THU, FRI, SAT;
    SUN(1, "周日"),
    MON(2, "周一"),
    TUE(3, "周二"),
    WED(4, "周三"),
    THU(5, "周四"),
    FRI(6, "周五"),
    SAT(7, "周六");

    public final int dayValue;
    private final String chinese;

    private Weekday(int dayValue, String chinese) {
        this.dayValue = dayValue;
        this.chinese = chinese;
    }

    @Override
    public String toString() {
        return this.chinese;
    }
}

/**
 * 小结：
 * java使用 enum定义枚举类型，它被编译器编译为 final class Xxx extends Enum{...}
 * 通过 name()获取常量定义的字符串，注意不要使用 toString()
 * 通过 ordinal()返回常量定义的顺序（无实质意义）
 * 可以为 enum编写构造方法，字段和方法
 * enum的构造方法要声明为 private，字段强烈建议为 final
 * enum适合用在 switch语句中
 */
