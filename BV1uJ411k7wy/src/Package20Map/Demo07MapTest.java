package Package20Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo07MapTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        scanner.close();
        System.out.println(input);

        Map<Character, Integer> map = new HashMap<>();

        for (Character key : input.toCharArray()) {
            if (map.containsKey(key)) {
                Integer value = map.get(key);
                map.put(key, value + 1);
            } else {
                map.put(key, 1);
            }
        }
        System.out.println(map);
    }
}
