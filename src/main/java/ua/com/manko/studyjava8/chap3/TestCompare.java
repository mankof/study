package ua.com.manko.studyjava8.chap3;

import java.util.*;

/**
 * Created by Sergej on 07.02.2016.
 */
public class TestCompare {
    private static List<User> users = Arrays.asList(
            new User("Steve", 30),
            new User("Joe",10),
            new User("Alex", 15),
            new User("Mike", 60),
            new User("George", 35)
    );
    public static void main(String[] args) {

//        Collections.sort(users, (o1, o2) -> o1.getName().compareTo(o2.getName()));
//        Collections.sort(users, new Comparator<User>() {
//            @Override
//            public int compare(User o1, User o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
        Collections.sort(users,
                Comparator.comparing(User::getName));

                System.out.println(users);

        users.forEach(user -> System.out.println(user));

        /**
         * removeIf
         */
        users.removeIf(user -> user.getName().equals("Asja"));
        System.out.println();
        users.forEach(System.out::println);

        /**
         * replaceAll
         */
        List<String> listString = Arrays.asList("Hello", "Sergio");
        listString.replaceAll(s -> {
            StringBuilder sb = new StringBuilder(s);
            return sb.reverse().toString();
        });
        System.out.println(listString);

        System.out.println();

        users.stream()
                .filter(user -> user.getAge()>34)
                .sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
                .skip(1)
                .forEach(System.out::println);
    }

    void removeUser(String name) {

    }

    public void example() {
        List<String> listString = Arrays.asList("Hello", "Sergio");

    }

    public static void avg(List<User> users) {
      // int average = users.parallelStream().map(u -> u.getAge()).average().getAsDouble();
    }

}
