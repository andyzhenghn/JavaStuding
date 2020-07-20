package Package07Generic;

public class GenericAndReflection {
}

/**
 * 小结：
 * 部分反射 API是泛型，例如：Class<T>，Constructor<T>
 * 可以声明带泛型的数组，但不能直接创建带泛型的数组，必须强制转型
 * 可以通过 Array.newInstance(Class<T>, int)创建 T[]数组，需要强制转型
 * 同时使用泛型和可变参数时需要特别小心
 */
