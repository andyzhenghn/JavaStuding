package I_Final;

/**
 * 用 final来修饰局部变量，那么这个变量就不能进行更改
 * 1. 对于基本类型来说，不可变的是变量中的数据不可改变
 * 2. 对于引用类型来说，不可变的是变量中的引用地址值不可改变
 */

public class VariablesFinal {

    public static void main(String[] args) {
        int num1 = 10;
        final int num2 = 11;
        MethodFinal obj = new MethodFinal();
        final MethodFinal obj1 = new MethodFinal();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(obj);
        System.out.println(obj1);
    }
}