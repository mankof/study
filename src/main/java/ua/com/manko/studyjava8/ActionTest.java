package ua.com.manko.studyjava8;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

/**
 * Created by Sergej on 24.01.2016.
 */
public class ActionTest {
    public static void main(String[] args) {
        final String str = getUserName();

        Button button = new Button();
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.out.println("Hello from java 7 and older" + str);
            }
        });

        button.addActionListener(event -> System.out.println("Hello from Java 8"));

        Runnable oneArg = () -> System.out.println("Hello from Java 8 thread " + str);
        oneArg.run();


        ActionListener oneArg1 = e -> System.out.println("");

        Runnable multiArgs = () -> {
            System.out.println("Hello from multi 1");
            System.out.println("Hello from multi 2");

        };
        multiArgs.run();


        BinaryOperator<Double> add = ( x,  y) -> x++;


        System.out.println(add.apply(20.0, 3.0));

        Predicate<Integer> atLest5 = x -> x < 1000;
        System.out.println("atlest5 = "+ atLest5.test(1000));
        Function<Long, Long> sum = (x) -> x*20;
        System.out.println(sum.apply(10L));


        Predicate<String> stringPredicate = x-> x == null;
        System.out.println("x == A = "+ stringPredicate.test(null));
        System.out.println("x == A = "+ stringPredicate.and(s -> s==null));


    }

    public static String getUserName() {
        return "String";
    }
}
