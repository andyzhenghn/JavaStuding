package Package07Generic;

import java.util.Arrays;

public class UsePerson {
    public static void main(String[] args) {
        Person[] ps = new Person[]{
            new Person("b", 61),
            new Person("a", 33),
            new Person("aa", 43)
        };
        Arrays.sort(ps);
        System.out.println(Arrays.toString(ps));
    }
}
