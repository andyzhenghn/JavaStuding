package com.study.BV1uJ411k7wy.Package18Generic;

import java.util.ArrayList;
import java.util.Collections;

public class Poker {
    public static void main(String[] args) {
        ArrayList<String> poker = prepare();

        Collections.shuffle(poker);
        System.out.println(poker);

        ArrayList<String> A = new ArrayList<>();
        ArrayList<String> B = new ArrayList<>();
        ArrayList<String> C = new ArrayList<>();
        ArrayList<String> Last3 = new ArrayList<>();

        for (int i = 0; i < poker.size(); i++) {
            if (i >= 51) {
                Last3.add(poker.get(i));
            } else if (i % 3 == 0) {
                A.add(poker.get(i));
            } else if (i % 3 == 1) {
                B.add(poker.get(i));
            } else if (i % 3 == 2) {
                C.add(poker.get(i));
            }
        }

        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("Last3: " + Last3);
    }

    private static ArrayList<String> prepare() {
        ArrayList<String> Poker = new ArrayList<>();
        String[] color = {"♠", "♣", "♦", "♥"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        for (String c : color) {
            for (String nu : numbers) {
                Poker.add(c + nu);
            }
        }
        Poker.add("小王");
        Poker.add("大王");
        return Poker;
    }
}
