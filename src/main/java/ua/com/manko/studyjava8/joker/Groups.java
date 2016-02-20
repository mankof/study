package ua.com.manko.studyjava8.joker;

/**
 * Created by Sergej on 14.02.2016.
 */
@FunctionalInterface
public interface Groups {
    Groups getGroup();

    default int getSize() {
        return 0;
    };

    default String getName(){
        return "Name";
    };
}
