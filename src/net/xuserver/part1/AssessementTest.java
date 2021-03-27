package net.xuserver.part1;

import java.util.ArrayList;
import java.util.List;

public class AssessementTest {
    private static int $;

    public static void main(String[] main) {
        Q0();
        Q1();
        QWhile();
        Q3();

    }

    public static void QWhile() {
        // boolean keepGoing = true;
        int count = 0;
        int x = 3;

        count = 0;
        for (count = 0; count < x; count++) {
            System.out.println(" for " + count);
        }
        ;

        count = 0;
        while (count++ < x) {
            System.out.println(" w " + count);
        }

        count = 0;
        do {
            System.out.println(" do " + count);
        } while (count++ < x);

    }

    private static void Q0() {
        String a_b;
        System.out.println($); // initialisé à 0, type primitif
        // System.out.print(a_b); // non initialisé => cannont compile
    }

    private static void Q1() {
        String s1 = "Java";
        String s2 = "Java";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ja").append("va");
        System.out.println(s1 == s2); // true same adress
        System.out.println(s1.equals(s2)); // true same value
        System.out.println(sb1.toString() == s1); // false different adress
        System.out.println(sb1.toString().equals(s1)); // true same value

        
    }

    public static void Q3() {
        int[] array = { 6, 9, 8 };
        List<Integer> list = new ArrayList<>();
        list.add(array[0]); // 6
        System.out.println(list);
        list.add(array[2]); // 6, 8
        System.out.println(list);
        list.set(1, array[1]); // 6, 9
        System.out.println(list);
        list.remove(0); // 9
        System.out.println(list);
    }

}



/*
 * interface HasTail { int getTailLength(); }
 * 
 * abstract class Puma implements HasTail { public int getTailLength() { return
 * 4; } }
 * 
 * public class Cougar extends Puma {
 * 
 * public static void main(String[] args) { Puma puma = new Puma();
 * System.out.println(puma.getTailLength()); }
 * 
 * public int getTailLength(int length) { return 2; }
 * 
 * }
 */
/*
 * public class FeedingSchedule { public static void main(String[] args) {
 * boolean keepGoing = true; int count = 0; int x = 3;
 * 
 * while (count++ < 3) { int y = (1 + 2 * count) % 3; switch (y) { default: case
 * 0: x -= 1; break; case 1: x += 5; } }
 * 
 * System.out.println(x); } }
 */