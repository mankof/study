package ua.com.manko.studyjava8.chap3;

/**
 * Created by Sergej on 07.02.2016.
 */
@FunctionalInterface
public interface PersonFactory<P extends Person> {
    P create(String firstName, String lastName);
}
