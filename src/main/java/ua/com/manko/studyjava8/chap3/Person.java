package ua.com.manko.studyjava8.chap3;

/**
 * Created by Sergej on 07.02.2016.
 */
public class Person {

    String firstName;
    String lastName;

    public Person() {}

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{firstName: "+ firstName + ", lastName: " + lastName + "}";
    }

}