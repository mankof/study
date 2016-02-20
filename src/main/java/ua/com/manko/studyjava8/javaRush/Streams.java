package ua.com.manko.studyjava8.javaRush;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Sergej on 07.02.2016.
 */

public class Streams  {
    private enum Status {
        OPEN, CLOSED
    };

    private static final class Task {
        private final Status status;
        private final int points;

        Task( final Status status, final int points ) {
            this.status = status;
            this.points = points;
        }

        public Integer getPoints() {
            return points;
        }

        public Status getStatus() {
            return status;
        }

        @Override
        public String toString() {
            return String.format( "[%s, %d]", status, points );
        }
    }

    public static void main(String[] args) {
        Collection<Task> tasks = Arrays.asList(
                new Task(Status.OPEN, 5),
                new Task(Status.OPEN, 13),
                new Task(Status.CLOSED, 5)
        );

        long sum = tasks.stream()
                .filter(task -> task.getStatus() == Status.OPEN)

                .mapToInt(Task :: getPoints)
                .sum();
        System.out.println(sum);
    }
}
