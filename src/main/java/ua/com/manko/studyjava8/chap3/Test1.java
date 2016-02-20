package ua.com.manko.studyjava8.chap3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.*;

/**
 * Created by Sergej on 06.02.2016.
 */
public class Test1 {
    public static void main(String[] args) {

        List<String> collected = new ArrayList<>();
        for(String string : Arrays.asList("A", "B", "Hello")) {
            String upper = string.toUpperCase();
            collected.add(upper);
        }


        List<String> collectedL = Stream.of("A", "1B", "Hello")
                .map(s -> s.toUpperCase())
                .filter(value -> Character.isDigit(value.charAt(0)))
                .collect(Collectors.toList());

        System.out.println(collectedL);


        List<Track> tracks = asList(new Track("Bakai", 524),
                                    new Track("Violets for Your Furs", 378),
                                    new Track("Time Was", 45));

        Track shortestTrack = tracks.stream()
                                .min(Comparator.comparing(t -> t.getName()))
                                .get();

        System.out.println(shortestTrack);
        System.out.println(tracks.get(1));

        /**
         * Reduce
         */
        List<Integer> integerList = asList(1,2,3);
        int sum = Stream.of(1,2,3)
                .reduce(0, (acc, element) -> acc + element);
        System.out.println("Sum of reduce = " + sum);





    }


}
