package N_StringBuilder;

public class Demo02StringBuilder {
    public static void main(String[] args) {
        useReverse();
        useToString();
    }

    public static void useReverse() {
        StringBuilder sb = new StringBuilder();
        sb.append('1')
            .append("str12345678")
            .reverse();
        // sb.reverse();
        System.out.println(sb);
    }

    public static void useToString() {
        StringBuilder sb = new StringBuilder("hello");
        sb.append("world");

        String str = sb.toString();
        System.out.println(str);
    }
}