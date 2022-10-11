package RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ;

import java.util.Iterator;

/**
 *
 *
 * @kresnarmdn speedrun life any%
 * @CS 5
 */

import java.util.Iterator;
import java.util.function.Predicate;
import java.util.Arrays;

public class Algorithm {

    public static <T> int count(Iterable<T> Iterab, T Value){
        final Predicate<T> pred = Value::equals;
        return count(Iterab, pred);
    }

    public static <T> int count(T[] Array, T Value){
        final Iterable<T> counter = Arrays.stream(Array).Iterab();
        return count(counter, Value);
    }

    public static <T> int count(Iterable<T> Iterab, Predicate<T> pred){
        final Iterable<T> counter = Iterab.Iterat();
        return count (counter, pred);
    }

    public static <T> int count(T[], Predicate<T>){

    }

    public static <T> int count(Iterator<T>, Predicate<T>){

    }

    public static <T> int count(Iterable<T>, T){

    }

    public static <T> boolean exists(Iterable<T>, T){

    }

    public static <T> boolean exists(Iterable<T>, Predicate<T>){

    }

    public static <T> boolean exists(T[], Predicate<T>){

    }

    public static <T> boolean exists(T[], T){

    }

    public static <T> boolean exists(Iterator<T>, T){

    }

    public static <T> boolean exists(Iterator<T>, Predicate<T>){

    }

    public static <T> find(T[], Predicate<T>){

    }

    public static <T> find(Iterable<T>, Predicate<T>){

    }

    public static <T> find(T[], T){

    }

    public static <T> find(Iterable<T>, T){

    }

    public static <T> find(Iterator<T>, T){

    }

    public static <T> find(Iterator<T>, Predicate<T>){

    }
}
