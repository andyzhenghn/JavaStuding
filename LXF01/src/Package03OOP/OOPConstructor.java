package Package03OOP;

public class OOPConstructor {
    private String name;
    private int age;

    public OOPConstructor() {
    }

    public OOPConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

/**
 * 小结：
 * 实例在创建时通过 new操作符会调用其对应的构造方法，构造方法用于初始化实例
 * 没有定义构造方法时，编译器会自动创建一个默认的无参数构造方法
 * 可以定义多个构造方法，编译器根据参数自动判断
 * 可以在一个构造方法内部调用另一个构造方法，便于代码复用
 */
