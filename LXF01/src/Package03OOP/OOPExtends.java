package Package03OOP;

public class OOPExtends {
    // has关系
    protected OOPBase ob;
}

/**
 * 继承是面向对象编程的一种强大的代码复用方式
 * java只允许单继承，所有类最终的根类是 Object
 * protected允许子类访问父类的字段和方法
 * 子类的构造方法可以通过 super()调用父类的构造方法
 * 可以安全地向上转型为更抽象的类型
 * 可以强制向下转型，最好借助 instanceof判断
 * 子类和父类的关系是 is, has关系不能用继承
 */
