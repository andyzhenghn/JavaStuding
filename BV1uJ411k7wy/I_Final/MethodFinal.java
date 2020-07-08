package I_Final;

/**
 * 当 final关键字用来修饰一个方法的时候，这个方法就是最终方法，也就是不能被覆盖重写
 * 格式：
 *  修饰符 final 返回值类型 方法名称(参数列表) {
 *  }
 * 注意：
 *  对于类、方法来说，abstract关键字和 final关键字不能同时使用，因为重写逻辑矛盾
 */

public class MethodFinal {
    public final void method () {
        System.out.println("父类方法执行");
    }

    // public abstract final void methodAbs() {
    //     System.out.println("method abstract");
    // }
}