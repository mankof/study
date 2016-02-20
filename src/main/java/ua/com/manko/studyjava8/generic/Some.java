package ua.com.manko.studyjava8.generic;

import java.util.List;

/**
 * Created by Sergej on 24.01.2016.
 */
public class Some {

    public void someFoo(List<? extends Number> numbers) {
        System.out.println("Hello "+ numbers);
    }
}
