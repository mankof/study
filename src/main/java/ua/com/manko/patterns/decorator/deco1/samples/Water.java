package ua.com.manko.patterns.decorator.deco1.samples;

/**
 * Created by Sergej on 07.02.2016.
 */
public class Water extends Beverage {
    @Override
    public int cost() {
        return 1;
    }

    @Override
    public String description() {
        return "Water";
    }
}
