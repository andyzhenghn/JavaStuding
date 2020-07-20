package Package07Generic;

public class Extends {
}

/**
 * 小结：
 * 使用类似 <? extends Number>通配符作为方法参数时表示：
 *  方法内部可以调用获取 Number引用的方法，例如：Number n = obj.getFirst()
 *  方法内部无法调用传入 Number引用的方法（null除外），例如：obj.setFirst(Number n)
 * 即一句话总结：使用 extends通配符表示可以读，不能写
 * 使用类似 <T extends Number>定义泛型类时表示：
 *  泛型类型限定为 number以及 Number的子类
 */