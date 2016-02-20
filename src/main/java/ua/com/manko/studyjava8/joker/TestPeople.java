package ua.com.manko.studyjava8.joker;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

/**
 * Created by Sergej on 14.02.2016.
 */
public class TestPeople {
    public static void main(String[] args) throws IOException {
        List<String> collection = Arrays.asList("a1", "a2", "a3", "a1");



        collection.stream()
                .sorted((o1, o2) -> -o1.compareTo(o2))
                .distinct()

                //.collect(Collectors.toList())
                .forEach(System.out::println)
        ;
        System.out.println();
        System.out.println(collection);



        Collection<Integer> collectionInt = Arrays.asList(1, 2, 3, 4, 2);
        int sum  = collectionInt.stream()
                .reduce((integer, integer2) -> integer + integer2)

                .orElse(0);
        System.out.println("Sum = "  +sum);

        int max = collectionInt.stream()
               // .reduce((integer, integer2) -> integer > integer2 ? integer : integer2)
                .reduce(Integer::max)
                .orElse(0);

        int last = collectionInt.stream()
                .reduce((integer, integer2) -> integer2 )
                .orElse(0);

        int sumMoreTwo = collectionInt.stream()
                .filter(integer -> integer>2)
                .reduce((integer, integer2) -> integer2 + integer)
                .orElse(0);

        int sumOdd  = collectionInt.stream()
                .filter(integer -> integer%2==0)
                .reduce((integer, integer2) -> integer2 + integer)
                .orElse(0);

        System.out.println("last = " + last);
        System.out.println("Sum numbers more then to = " + sumMoreTwo);
        System.out.println("sumOdd = " + sumOdd);


    }

    public void printGroup(List<People> people) {
        Set<Groups> groups = new HashSet<>();
        for(People p: people) {
            if (p.getAge() >= 65) {
                groups.add(p.getGroup());
            }
        }

        List<Groups> sorted = new ArrayList<>(groups);
        Collections.sort(sorted, new Comparator<Groups>() {
            @Override
            public int compare(Groups o1, Groups o2) {
                return Integer.compare(o1.getSize(), o2.getSize());
            }
        });

        for(Groups g: sorted) {
            System.out.println(g.getName());
        }
    }

    public void printGroupNewJ8(List<People> peoples) {
        peoples.stream()
                .filter(p -> p.getAge()>=65)
                .map(p -> p.getGroup())
                .distinct()
                .sorted(comparing(g-> g.getSize()))
                .map(g -> g.getName())
                .forEach(n -> System.out.println(n));
    }


    // Метод Map изменяет выборку по определенному правилу, возвращает stream с новой выборкой
    private static void testMap() {
        System.out.println();
        System.out.println("Test map start");
        Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a1");
        // Изменение всех элементов коллекции
        List<String> transform = collection.stream().map((s) -> s + "_1").collect(Collectors.toList());
        System.out.println("transform = " + transform); // напечатает transform = [a1_1, a2_1, a3_1, a1_1]

        // убрать первый символ и вернуть числа
        List<Integer> number = collection.stream().map((s) -> Integer.parseInt(s.substring(1))).collect(Collectors.toList());
        System.out.println("number = " + number); // напечатает transform = [1, 2, 3, 1]

    }

    // Метод MapToInt - изменяет выборку по определенному правилу, возвращает stream с новой числовой выборкой
    private static void testMapToInt() {
        System.out.println();
        System.out.println("Test mapToInt start");
        Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a1");
        // убрать первый символ и вернуть числа
        int[] number = collection.stream().mapToInt((s) -> Integer.parseInt(s.substring(1))).toArray();
        System.out.println("number = " + Arrays.toString(number)); // напечатает number = [1, 2, 3, 1]

    }

    // Метод FlatMap - похоже на Map - только вместо одного значения, он возвращает целый stream значений
    private static void testFlatMap() {
        System.out.println();
        System.out.println("Test flat map start");
        Collection<String> collection = Arrays.asList("1,2,0", "4,5");
        // получить все числовые значения, которые хранятся через запятую в collection
        String[] number = collection.stream().flatMap((p) -> Arrays.asList(p.split(",")).stream()).toArray(String[]::new);
        System.out.println("number = " + Arrays.toString(number)); // напечатает number = [1, 2, 0, 4, 5]
    }

    // Метод FlatMapToInt - похоже на MapToInt - только вместо одного значения, он возвращает целый stream значений
    private static void testFlatMapToInt() {
        System.out.println();
        System.out.println("Test flat map start");
        Collection<String> collection = Arrays.asList("1,2,0", "4,5");
        // получить сумму всех числовые значения, которые хранятся через запятую в collection
        int sum = collection.stream().flatMapToInt((p) -> Arrays.asList(p.split(",")).stream().mapToInt(Integer::parseInt)).sum();
        System.out.println("sum = " + sum); // напечатает sum = 12
    }

    // Метод ForEach применяет указанный метод к каждому элементу стрима и заканчивает работу со стримом
    private static void testForEach() {
        System.out.println();
        System.out.println("For each start");
        Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a1");
        // Напечатать отладочную информацию по каждому элементу стрима
        System.out.print("forEach = ");
        collection.stream().map(String::toUpperCase).forEach((e) -> System.out.print(e + ",")); // напечатает forEach = A1,A2,A3,A1,
        System.out.println();

        Collection<StringBuilder> list = Arrays.asList(new StringBuilder("a1"), new StringBuilder("a2"), new StringBuilder("a3"));
        list.stream().forEachOrdered((p) -> p.append("_new"));
        System.out.println("forEachOrdered = " + list); // напечатает forEachOrdered = [a1_new, a2_new, a3_new]
    }

    // Метод Peek возвращает тот же стрим, но при этом применяет указанный метод к каждому элементу стрима
    private static void testPeek() {
        System.out.println();
        System.out.println("Test peek start");
        Collection<String> collection = Arrays.asList("a1", "a2", "a3", "a1");
        // Напечатать отладочную информацию по каждому элементу стрима
        System.out.print("peak1 = ");
        List<String> peek = collection.stream().map(String::toUpperCase).peek((e) -> System.out.print(e + ",")).
                collect(Collectors.toList());
        System.out.println(); // напечатает peak1 = A1,A2,A3,A1,
        System.out.println("peek2 = " + peek); // напечатает peek2 = [A1, A2, A3, A1]

        Collection<StringBuilder> list = Arrays.asList(new StringBuilder("a1"), new StringBuilder("a2"), new StringBuilder("a3"));
        List<StringBuilder> newList = list.stream().peek((p) -> p.append("_new")).collect(Collectors.toList());
        System.out.println("newList = " + newList); // напечатает newList = [a1_new, a2_new, a3_new]
    }
}

