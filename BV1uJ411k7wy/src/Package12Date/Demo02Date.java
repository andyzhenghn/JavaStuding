package Package12Date;

import java.util.Date;

public class Demo02Date {
    public static void main(String[] args) {
        Date date = new Date(); // 獲取當前時間
        System.out.println(date);

        long cur = date.getTime();
        System.out.println(cur);

        Date date0 = new Date(0L);
        System.out.println(date0);

        Date date1 = new Date(1594310871819L);
        System.out.println(date1);
    }
}