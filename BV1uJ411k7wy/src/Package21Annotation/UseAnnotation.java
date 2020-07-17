package Package21Annotation;

/**
 * 注解的三类：
 *  1. 第一类由编译器使用的注解：
 *      @Override: 让编译器检查该方法是否正确的实现了覆写
 *      @SuppressWarnings: 告诉编译器忽略此处代码产生的警告
 *     这类注解不会被编译进入 .class文件
 *  2. 第二类是由工具处理 .class文件使用的注解
 *  3. 第三类是在程序运行期能够读取的注解，它们在加载后一直存在于 JVM中
 */

//@Resource("hello")
public class UseAnnotation {
    // @Inject
    // int n;

    // @PostConstruct
    // public void hello(@Param String name) {
    //     System.out.println(name);
    // }

    // @Check(min=0, max=100, value=55)
    public int n;

    // @Check(value=99)
    public int p;

    // @Check(99)
    public int x;

    // @Check
    public int y;

    @Override
    public String toString() {
        return "hello";
    }
}

/**
 * 小结：
 * 注解是 java语言用于工具处理的标注
 * 注解可以配置参数，没有指定配置的参数使用默认值
 * 如果参数名称是 value，且只有一个参数，那么可以省略参数名称
 */