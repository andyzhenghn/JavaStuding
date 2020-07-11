package Package18Generic;

public class Demo02Generic {
    public static void main(String[] args) {
        GenericClass<String> gc = new GenericClass<>();
        gc.setName("hahah");
        String name = gc.getName();
        System.out.println(name);
    }
}
