package ua.com.manko.studyjava8.joker;

/**
 * Created by Sergej on 14.02.2016.
 */
public class People implements Groups {
    private String name;
    private int age;

    @Override
    public Groups getGroup() {
        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }



}
