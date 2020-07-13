package Package03OOP;

public interface OOPInterface {
    // 字段只能是 public static final类型，修饰符可以不写
    int Male = 1;
    int Female = 1;

    // 接口定义的所有方法默认是 public abstract的，不需要写出来
    void run();
    String getName();

    /**
     * 实现类不必覆写 default方法
     * default方法的目的是
     *  当需要给接口新增一个方法时，会涉及到修改全部子类，如果新增的是 default方法，子类不必全部修改，需要使用的地方去覆写
     * default方法与抽象类的普通方法不同：
     *  interface没有字段，default方法无法访问字段，而抽象类的普通方法可以访问实例字段
     */
    default void defaultMethod() {
        System.out.println("default");
    }
}

//interface OO extends OOPInterface {
//    void run();
//    String getName();
//}

/**
 * 小结：
 * java的接口（interface）定义了纯抽象规范，一个类可以实现多个接口
 * 接口也是数据类型，适用于向上转型和向下转型
 * 接口的所有方法都是抽象方法，接口不能定义实例字段
 * 接口可以定义 default方法（JDK>=1.8）
 */
