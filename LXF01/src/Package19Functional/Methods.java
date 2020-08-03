package Package19Functional;

public class Methods {
    public static void main(String[] args) {
//        String[] array = new String[] {"aaa", "bbb", "ccc"};
        /**
         * 所谓方法引用，是指如果某个方法签名和接口恰好一致，就可以直接传入方法引用
         * 除了方法名外，方法参数一致，返回类型相同，因此可以直接把方法名作为 Lambda表达式传入
         * 注意：在这里，方法签名只看参数类型和返回类型，不看方法名称，也不看类的继承关系
         */
//        Arrays.sort(array, Methods::cmp);
//        System.out.println(String.join(", "), array);
//
//        // 构造方法引用
//        List<String> names = List.of("Bob", "ALice", "Tim");
//        List<Person> persons = names.stream().map(Person::new).collect(Collectors.toList());
//        System.out.println(persons);
    }

    static int comp(String o1, String o2) {
        return o1.compareTo(o2);
    }
}

class Person {
    String name;
    public Person (String name) {
        this.name = name;
    }
    public String toString() {
        return "Person:" + this.name;
    }
}

/**
 * 小结
 * FunctionalInterface允许传入：
 *  接口的实现类（传统写法，代码较繁琐）
 *  Lambda表达式（只需列出参数名，由编译器推断类型）
 *  符合方法签名的静态方法
 *  符合方法签名的实例方法（实例类型被看作第一个参数类型）
 *  符合方法签名的构造方法（实例类型被看作返回类型）
 * FunctionalInterface不强制继承关系，不需要方法名称相同，只要求方法参数（类型和数量）与方法返回类型相同，即认为方法签名相同
 */