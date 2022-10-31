package RadenBagusSenopatiKresnaRamdaniGalihRahayuJSleepRJ;

import java.util.*;

/**
 *
 *
 * @kresnarmdn speedrun life any%
 * @CS 5
 * @updated PT 5
 */
/*
import java.util.function.Predicate;
import java.util.Iterator;

public class Algorithm {

    public static <T> List<T> collect(Iterable<T> iterable, T value){
        final Iterator<T> it = iterable.iterator();
        return collect(it, value);
    }

    public static <T> List<T> collect(Iterable<T> iterable, Predicate<T> pred){
        final Iterator<T> it = iterable.iterator();
        return collect(it, pred);
    }

    public static <T> List<T> collect(T[] array, T value){
        final Iterator<T> it = Arrays.stream(array).iterator();
        return collect(it, value);
    }

    public static <T> List<T> collect(Iterator<T> iterator, T value){
        final Iterator<T> pred = value::equals;
        return collect(pred, iterator);
    }

    public static <T> List<T> collect(T[] array, Predicate<T> pred){
        final Iterator<T> it = Arrays.stream(array).iterator();
        return collect(it, pred);
    }

    public static <T> List<T> collect(Iterator<T> iterator, Predicate<T> pred){
        List<T> list = new ArrayList<>();
        while (iterator.hasNext()){
            T current = iterator.next();
            if (pred.predicate(current)){
                list.add(current);
            }
        }
        return list;
    }

    public static <T> int count(Iterator<T> iterator, T value){
        int count = 0;
        while(iterator.hasNext()){
            if(iterator.equals(value)){
                count += 1;
            }
        }
        return count;
    }

    public static <T> int count(T[] array, T value){
        int count = 0;
        for(T item : array){
            if(item.equals(value)){
                count += 1;
            }
        }
    }

    public static <T> int count(Iterable<T> iterable, Predicate<T> pred){
        int count = 0;
        for (T item : iterable){
            if(pred.predicate(item)){
                count += 1;
            }
        }
        return count;
    }

    public static <T> int count(T[] array, Predicate<T> pred){
        int count = 0;
        for (T item : array){
            if(pred.predicate(item)){
                count += 1;
            }
        }
        return count;
    }

    public static <T> int count(Iterator<T> iterator, Predicate<T> pred){
        int count = 0;
        while (iterator.hasNext()){
            if (pred.predicate(iterator.next()))
                count += 1;
        }
        return count;
    }

    public static <T> int count(Iterable<T> iterable, T value){
        int count = 0;
        for (T item : iterable){
            if(item.equals(value)){
                count += 1;
            }
        }
        return count;
    }

    public static <T> boolean exists(Iterable<T> iterable, T value){
        final Iterator<T> it = iterable.iterator();
        return exists(it, value);
    }

    public static <T> boolean exists(Iterable<T> iterable, Predicate<T> pred){
        final Iterator<T> it = iterable.iterator();
        return exists(it, pred);
    }

    public static <T> boolean exists(T[] array, Predicate<T> pred){
        final Iterator<T> it = Arrays.stream(array).iterator();
        return exists(it, pred);
    }

    public static <T> boolean exists(T[] array, T value){
        final Iterator<T> counter = Arrays.stream(array).iterator();
        return exists(counter, value);
    }

    public static <T> boolean exists(Iterator<T> iterator, T value){
        final Predicate<T> pred = value::equals;
        return exists(iterator, pred);
    }

    public static <T> boolean exists(Iterator<T> iterator, Predicate<T> pred){
        while (iterator.hasNext()){
            T current = iterator.next();
            if (pred.predicate(current)){
                return true;
            }
        }
        return false;
    }

    public static <T> find(T[] array, Predicate<T> pred){
        for(T item : array){
            if(pred.predicate(item)){
                return item;
            }
        }
        return null;
    }

    public static <T> find(Iterable<T> iterable, Predicate<T> pred){
        for(T item : iterable){
            if(pred.predicate(item)){
                return item;
            }
        }
        return null;
    }

    public static <T> find(T[] array, T value){
        for(T item : array){
            if(item.equals(value)){
                return item;
            }
        }
        return null;
    }

    public static <T> find(Iterable<T> iterable, T value){
        for(T item : iterable){
            if(item.equals(value)){
                return item;
            }
        }
        return null;
    }

    public static <T> find(Iterator<T> iterator, T value){
        while(iterator.hasNext()){
            if(iterator.next().equals(value)){
                return iterator.next();
            }
        }
        return null;
    }

    public static <T> find(Iterator<T> iterator, Predicate<T> pred){
        while (iterator.hasNext()) {
            if (pred.predicate(iterator.next())) {
                return iterator.next();
            }
        }
        return null;
    }

    public static <T> List<T> paginate(T[] array, int start, int fin, Predicate<T> pred){
        List<T> list = new ArrayList<>();
        for (int i = 0; i < array.length; i += 1){
            if (pred.predicate(array[i])){
                list.add(array[i]);
            }
        }
        return list;
    }

    public static <T> List<T> paginate(Iterator<T> iterator, int start, int fin, Predicate<T> pred){
        List<T> list = new ArrayList<>();
        for (int i = start; i < fin; i += 1){
            if (pred.predicate(iterator.next())){
                list.add(iterator.next());
            }
        }
        return list;
    }

    public static <T> List<T> paginate(Iterable<T> iterable, int start, int fin, Predicate<T> pred){
        List<T> list = new ArrayList<>();
        for (int i = start; i < fin; i += 1){
            if (pred.predicate(iterable.iterator().next())){
                list.add(iterable.iterator().next());
            }
        }
        return list;
    }
}
*/