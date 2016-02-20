package ua.com.manko.studyjava8.chap3;

/**
 * Created by Sergej on 07.02.2016.
 */
public class WorkPerson {
    public static void main(String[] args) {
        PersonFactory<Person> personFactory = Person :: new;
        Person person = personFactory.create("Sergio", "Manko");
        System.out.println(person);
    }
}
