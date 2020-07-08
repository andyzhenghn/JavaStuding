package J_InnerClass;

import java.util.List;
import java.util.ArrayList;

public class Return {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        List<String> result = addNames(list);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static List<String> addNames(List<String> list) {
        list.add("11");
        list.add("22");
        list.add("33");
        list.add("44");
        return list;
    }
}