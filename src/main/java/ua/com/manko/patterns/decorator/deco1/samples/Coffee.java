package ua.com.manko.patterns.decorator.deco1.samples;

/**
 * Created by Sergej on 07.02.2016.
 */
public class Coffee extends Beverage {
    @Override
    public int cost() {
        return 10;
    }

    @Override
    public String description() {
        return "Coffee";
    }
}
