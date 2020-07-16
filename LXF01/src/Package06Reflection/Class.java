package Package06Reflection;

public class Class {
    public static void main(String[] args) {
        Number n = new Double(123.456);
        // String s = new Double(123.456);  // compile error

        /**
         // 获取一个 class的 class实例

         // 直接通过一个 class的静态变量 class获取
         Class cls = String.class;

         // 可以通过实例变量提供的 getClass()方法获取
         String s = "Hello";
         Class cls1 = s.getClass();

         // 通过静态方法 Class.forName()获取
         Class cls2 = Class.forName("java.lang.String");
         */
    }
}

/**
 * 小结：
 * jvm为每个加载的 class及 interface创建了对应的 Class实例保存 class及 interface的所有信息
 * 获取一个 class对应的 Class实例后，就可以获取该 class的所有信息
 * 通过 Class实例获取 class信息的方法称为反射（Reflection）
 * jvm总是动态加载 class，可以在运行期根据条件来控制加载 class
 */