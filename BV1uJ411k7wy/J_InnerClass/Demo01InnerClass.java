package J_InnerClass;

/**
 * 外部类调用内部类的变量和方法
 * 1. 间接方式：在外部类的方法中，使用内部类，然后 main只是调用外部类的方法
 * 2. 直接方式：格式：
 *  外部类名称.内部类名称 变量名 = new 外部类名称().new 内部类名称();
 */

public class Demo01InnerClass {
    public static void main(String[] args) {
        Body body = new Body();

        // 间接方式
        body.exercise();

        // 直接方式
        Body.Heart bodyHeart = new Body().new Heart();
        bodyHeart.beat();

    }
}