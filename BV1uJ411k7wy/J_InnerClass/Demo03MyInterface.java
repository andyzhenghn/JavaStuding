package J_InnerClass;

/**
 * 如果接口的实现类（或者是父类的子类）只需要使用唯一的一次
 * 那么这种情况下就可以省略掉概况类的定义，改为使用 匿名内部类
 */

public class Demo03MyInterface {
    public static void main(String[] args) {
        MyInterface obj = new MyInterface(){
        
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法");
            }
        };

        obj.method();

        new MyInterface(){
        
            @Override
            public void method() {
                System.err.println("匿名对象实现了方法");
            }
        }.method();
    }
}