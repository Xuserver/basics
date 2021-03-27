package net.xuserver.part1;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.function.Predicate;

public class BearOrShark {

    public static void luck(int val) {

        System.out.print("Testing 10 / " + val);
        int luck = 10;
        if ((luck > 10 ? luck++ : --luck) < 10) {
            System.out.print("Bear");
        }
        if (luck < 10)
            System.out.print("Shark");
            
    }

    public static void calendar() {
        // INSERT CODE HERE
        System.out.println(test(i -> i == 5));
        //System.out.println(test(i -> {i == 5;}));
        System.out.println(test((i) -> i == 5));
        //System.out.println(test((int i) -> i == 5);        

        //System.out.println( test( (int i) -> {return i == 5;}) );
        System.out.println(test((i) -> {return i == 5;}));

        System.out.println(LocalDate.of(2015, Calendar.APRIL, 1));
        System.out.println(LocalDate.of(2015, Month.APRIL, 1));
        System.out.println(LocalDate.of(2015, 3, 1));
        System.out.println(LocalDate.of(2015, 4, 1));
        
        //System.out.println(new LocalDate(2015, 3, 1));
        //System.out.println(new LocalDate(2015, 4, 1));

    }

    private static boolean test(Predicate<Integer> p) {
        return p.test(5);
    }
}

/*
 * public interface CanSwim { }
 * 
 * public class Amphibian implements CanSwim { }
 * 
 * class Tadpole extends Amphibian { }
 * 
 * public class FindAllTadPole { public static void main(String[] args) {
 * List<Tadpole> tadpoles = new ArrayList<Tadpole>(); for (Amphibian amphibian :
 * tadpoles) { CanSwim // Object Amphibian tadpole = amphibian; } } }
 */

/*
 * public interface Animal { public default String getName() { return null; } }
 * 
 * interface Mammal { public default String getName() { return null; } }
 * 
 * abstract class Otter implements Mammal, Animal { }
 */