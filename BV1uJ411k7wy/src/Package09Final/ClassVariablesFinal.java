package Package09Final;

/**
 * 对于成员变量来说，如果使用了 final关键字修饰，那么这个变量也照样不可变
 * 
 * 1. 由于成员变量具有默认值，所以用了 final之后必须手动赋值，不会再给默认值
 * 2. 对于 final的成员变量，要么使用直接赋值，要么通过构造方法赋值。二者选其一
 * 3. 必须保证类当中所有重载的构造方法，都最终会对 final的成员变量进行赋值
 */

public class ClassVariablesFinal {
    // private final String name = "hahaha";
    private final String name;

    public ClassVariablesFinal() {
        name = "haha2";
    }

    public ClassVariablesFinal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // public void setName(String name) {
    //     this.name = name;
    // }
}