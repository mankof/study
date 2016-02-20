package ua.com.manko.studyjava8;

/**
 * Created by Sergej on 24.01.2016.
 */
public interface Function<R extends Long, T extends Long> {
    R apply(T t);
}
