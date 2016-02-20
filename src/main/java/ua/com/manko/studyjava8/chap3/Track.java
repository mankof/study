package ua.com.manko.studyjava8.chap3;

/**
 * Created by Sergej on 06.02.2016.
 */
public class Track {
    private String name;
    private int len;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Track{" +
                "name='" + name + '\'' +
                ", len=" + len +
                '}';
    }

    public int getLen() {
        return len;
    }


    public Track(String name, int len) {
        this.name = name;
        this.len = len;
    }


}
