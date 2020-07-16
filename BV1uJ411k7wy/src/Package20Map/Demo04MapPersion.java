package Package20Map;

import java.util.HashMap;
import java.util.Map;

class Demo04MapPerson {
    public static void main(String[] args) {

        // 使用自定义类型当做 key，需要重写 hashcode()和 equals()
        Map<Person, String> map = new HashMap<>();
        map.put(new Person("h", 1), "valueh");
        map.put(new Person("ha", 2), "valueha");
        map.put(new Person("hah", 1), "valuehah");
        map.put(new Person("haha", 3), "valuehaha");
        map.put(new Person("h", 13), "valuedd");

        System.out.println(map);
    }
}
