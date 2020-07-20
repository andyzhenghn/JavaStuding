package Package07Generic;

public class Super {
}

/**
 * 小结：
 * 使用类似 <? super Integer>通配符作为方法参数时表示
 *  方法内部可以调用传入 Integer引用的方法，例如：obj.setFirst(Integer n)
 *  方法内部无法调用获取 Integer引用的方法（Object除外），例如：Integer n = obj.getFirst()
 * 即使用 super通配符表示只能写不能读
 * 使用 extends和 super通配符要遵循 PECS原则
 * 无限定通配符 <?>很少使用，可以使用 <T>替换，同时它是所有 <T>类型的超类
 */
