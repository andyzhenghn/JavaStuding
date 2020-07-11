package Package02Base;

public class BooleanCalculate {
    public static void main(String[] args) {
        // 布尔运算
        // 比较运算符： > >= < <= == !=
        // 与或非：&& || !
        /**
         * 关系符优先级
         * !
         * >, >=, <, <=
         * *  ==, !=
         * &&
         * ||
         */
        boolean isGreater = 5 > 3;

        // 短路运算
        boolean result = true || (5 / 0 > 0); // true

        // 三元运算符
        int n = -100;
        int x = n >= 0 ? n : -n;
    }
}

/**
 * 与运算和或运算是短路运算
 * 三元运算符 b ? x : y后面的类型必须相同，三元运算也是"短路运算"，只计算 x或 y
 */