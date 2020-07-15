package Package20Map;

import java.util.HashMap;
import java.util.Map;

public class Demo04MapPersion {
    public static void main(String[] args) {

        // 使用自定义类型当做 key，需要重写 hashcode()和 equals()
        Map<Persion, String> map = new HashMap<>();
        map.put(new Persion("h", 1), "valueh");
        map.put(new Persion("ha", 2), "valueha");
        map.put(new Persion("hah", 1), "valuehah");
        map.put(new Persion("haha", 3), "valuehaha");
        map.put(new Persion("h", 13), "valuedd");

        System.out.println(map);
    }
}
