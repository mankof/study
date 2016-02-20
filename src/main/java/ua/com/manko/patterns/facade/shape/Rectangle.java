package ua.com.manko.patterns.facade.shape;

/**
 * Created by Sergej on 20.02.2016.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
