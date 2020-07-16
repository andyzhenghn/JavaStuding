package Package06Reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 在运行期动态创建一个 interface实例的方法如下：
 *  1. 定义一个 InvocationHandler实例，它负责实现接口的方法调用
 *  2. 通过 Proxy.newProxyInstance()创建 interface实例，它需要 3个参数
 *      1. 使用的 ClassLoader，通常就是接口类的 ClassLoader
 *      2. 需要实现的接口数组，至少需要传入一个接口进去
 *      3. 用来处理接口方法调用的 InvocationHandler实例
 *  3. 将返回的 Object强制转型为接口
 */

public class NewProxyInstance {
    public static void main(String[] args) {
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method);
                if (method.getName().equals("morning")) {
                    System.out.println("Good morning, " + args[0]);
                }
                return null;
            }
        };

        /**
            Hello hello = (Hello) Proxy.newProxyInstance(
                    Hello.class.getClassLoader(),
                    new Class[]{Hello.class},
                    handler
            );
         */
    }
}

interface Hello {
    void morning(String name);
}

/**
 * 小结：
 * java标准库提供了动态代理功能，允许在运行期动态创建一个接口的实例
 * 动态代理是通过 Proxy创建代理对象，然后将接口方法"代理"给 InvocationHandler完成的
 */
