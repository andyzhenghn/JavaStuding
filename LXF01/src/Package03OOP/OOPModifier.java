package Package03OOP;

// 定义为 public的 class、interface可以被其他任何类访问
public class OOPModifier {
    // 定义为 public的 field、method可以被其他类访问，前提是首先由访问 class的权限
    public void hi() {}

    // 定义为 private的 field、method无法被其他类访问，嵌套类用于访问 private权限
    private void hello() {}

    // protected作用于继承关系，定义为 protected的 field、method可以被子类，子类的子类访问
    protected void h() {}

    // 用 final修饰 class可以阻止被继承
    final class metaClass {}
    // 用 final修饰 method可以阻止被子类覆写
    protected final void hii() {}
    // 用 final修饰局部变量可以阻止被重新赋值
    private final int n = 0;
}

/**
 * 小结：
 * java内建的访问权限包括 public, protected, private和 package权限
 * java在方法内部定义的变量是局部变量，局部变量的作用域从变量声明开始，到一个块结束
 * final修饰符不是访问权限，它可以修饰 class, field和 method
 * 一个 .java文件只能是包含一个 public类，但可以包含多个非 public类
 */