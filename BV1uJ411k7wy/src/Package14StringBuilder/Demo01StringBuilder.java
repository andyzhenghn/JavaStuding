package Package14StringBuilder;

public class Demo01StringBuilder {
    public static void main(String[] args) {
        create();
        appendMethod();
    }

    public static void create() {
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1);
        StringBuilder sb2 = new StringBuilder("123456");
        System.out.println(sb2);
    }

    public static void appendMethod() {
        StringBuilder sb = new StringBuilder();
        sb.append(1)
            .append('h')
            .append("str")
            .append(true);
        System.out.println(sb);
    }
}