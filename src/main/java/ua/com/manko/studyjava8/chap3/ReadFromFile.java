package ua.com.manko.studyjava8.chap3;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by Sergej on 07.02.2016.
 */
public class ReadFromFile {
    public static void main(String[] args) throws IOException {
        Path dir = Paths.get("d:\\2014_java");
        try(Stream<Path> files = Files.walk(dir)) {
            long count = files
                    .filter(p -> p.toString().endsWith(".txt"))
                    .peek(System.out::println)
                    .flatMap(ReadFromFile::getLines)
                    .filter(s -> s.toUpperCase().contains("JAVA"))
                    .peek(System.out::println)
                    .count();
            System.out.println(count);
        }
    }

    private static Stream<String> getLines (Path path) {
        try {
            return Files.lines(path);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

}
