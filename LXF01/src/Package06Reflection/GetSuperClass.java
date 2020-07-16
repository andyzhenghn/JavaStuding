package Package06Reflection;

public class GetSuperClass {
    public static void main(String[] args) {
        /**
            // 获取父类的 class
            Class i =  Integer.class;
            Class n = i.getSuperClass();
            System.out.println(n);
            Class o = n.getSuperClass();
            System.out.println(o);
            System.out.println(o.getSuperClass());
         */

        /**
            // 获取 interface
            // Class s = Integer.class;
            Class s = Integer.getSuperClass()
            Class[] is = s.getInterfaces();
            for(Class i : is) {
                System.out.println(i);
            }
         */

        // 继承关系
        // 判断一个实例是否是某个类型时，正常情况下，使用 instanceof
        Object n = Integer.valueOf(123);
        boolean isDouble = n instanceof Double;
        boolean isInteger = n instanceof Integer;
        boolean isNumber = n instanceof Number;
        boolean isSerializable = n instanceof java.io.Serializable;
        // 如果是两个 Class实例，要判断一个向上转型是否成立，可以调用 isAssignableFrom()
        Integer.class.isAssignableFrom(Integer.class);
        Number.class.isAssignableFrom(Integer.class);
        Object.class.isAssignableFrom(Integer.class);
        Integer.class.isAssignableFrom(Number.class);
    }
}

/**
 * 小结：
 * 通过 Class对象可以获取继承关系
 *  Class getSuperclass() 获取父类类型
 *  Class[] getInterfaces() 获取当前类实现的所有接口
 * 通过 Class对象的 isAssignableFrom()方法可以判断一个向上转型是否实现
 */
