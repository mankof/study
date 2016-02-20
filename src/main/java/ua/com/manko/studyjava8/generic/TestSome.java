package ua.com.manko.studyjava8.generic;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Sergej on 24.01.2016.
 */
public class TestSome {
    public static void main(String[] args) {
        Some some = new Some();
        List<Integer> list = Arrays.asList(new Integer(100), new Integer(200));
        List<Double> listD = Arrays.asList(new Double(100), new Double(200));
        some.someFoo(list);
        some.someFoo(listD);
    }
}
