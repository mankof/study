package ua.com.manko.studyjava8.chap3;

/**
 * Created by Sergej on 07.02.2016.
 */
import java.util.Arrays;
import java.util.List;

public class UserAverageTest {
    private static List<User> users = Arrays.asList(
            new User("Steve", 30),
            new User("Joe",10),
            new User("Alex", 15),
            new User("Mike", 60),
            new User("George", 35)
    );

    public static void main(String[] args) {
        oldJavaWay();
        newJavaWay();
    }

    private static void oldJavaWay() {
        int total = 0;

        for (User u : users) {
            total += u.getAge();
        }

        double average = (double)total / (double)users.size();

        System.out.println("OLDWAY Average User Age: " + average);
    }

    private static void newJavaWay() {
//        double average = users.parallelStream()
//                .map(u -> u.age)
//                .average()
//                .getAsDouble();
//
//        System.out.println("NEWWAY Average User Age: " + average);
    }
}
