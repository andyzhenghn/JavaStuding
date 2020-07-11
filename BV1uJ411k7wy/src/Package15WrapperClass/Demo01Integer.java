package Package15WrapperClass;

/**
 * 基本数据类型对应的包装类
 * byte     Byte
 * short    Short
 * int      Integer
 * long     Long
 * float    Float
 * double   Double
 * char     Character
 * boolean  Boolean
 */

/**
 * 装箱：把基本类型的数据，包装到包装类中（基本类型的数据 -> 包装类）
 *  构造方法：
 *      Integer(int value) 构造一个新分配的 Integer对象，它表示指定的 int值
 *      Integer(String s) 构造了一个新分配的 Integer对象，它表示 String参数所指示的 int值
 *          传递的字符串，必须是基本类型的字符串，否则会抛出异常 “100”正确 “a”抛异常
 *  静态方法：
 *      static Integer valueOf(int i) 返回一个表示指定的 int值的 Integer实例
 *      static Integer valueOf(String s) 返回保存指定的 String值的 Integer对象
 * 拆箱：在包装类中取出基本类型的数据（包装类 -> 基本类型的数据）
 *  成员方法：
 *      int intValue() 以 int类型返回该 Integer的值
 */

public class Demo01Integer {
    public static void main(String[] args) {
        // 装箱
        // 构造方法
        Integer in1 = new Integer(1);
        System.out.println(in1);

        Integer in2 = new Integer("1");
        System.out.println(in2);

        // 静态方法
        Integer in3 = Integer.valueOf(1);
        System.out.println(in3);
        
        Integer in4 = Integer.valueOf("1");
        System.out.println(in4);

        // 拆箱
        int i = in1.intValue();
        System.out.println(i);
    }
}