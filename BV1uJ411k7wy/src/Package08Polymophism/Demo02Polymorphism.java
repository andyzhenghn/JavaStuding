package Package08Polymophism;

/**
 * 1. 对象的向上转型，其实就是多态写法
 * 格式：父类名称 对象名 = new 子类名称();
 * double num = 100;
 * 
 * 2. 对象的向下转型，其实是一个【还原】的动作
 * 格式：子类名称 对象名 = (子类名称) 父类对象;
 * 含义：将父类对象，【还原】称为本来的子类对象
 * int num = (int) 10.0;
 * int num = (int) 10.5; // 不可
 * 
 * instanceof 判断实例是否来自父类
 */

public class Demo02Polymorphism {
    public static void main(String[] args) {
        // 向上转型
        Parent01 obj = new Child01();
        obj.method();
        obj.methodParent();
        // obj.methodChild();

        boolean isChild01 = obj instanceof Child01;
        boolean isChild02 = obj instanceof Child02;
        boolean isParent01 = obj instanceof Parent01;
        System.out.println(isChild01);
        System.out.println(isChild02);
        System.out.println(isParent01);

        // 向下转型
        if (isChild01) {
            Child01 childObj = (Child01) obj;
            childObj.methodParent();
            childObj.methodChild();
        }
        // 编译不报错，运行出错
        // Child02 childObj2 = (Child02) obj;       
    }
}