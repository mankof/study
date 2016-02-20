package ua.com.manko.patterns.decorator.deco1.samples;

/**
 * Created by Sergej on 07.02.2016.
 */
public abstract class Beverage {
    public abstract int cost();
    public abstract String description();

    @Override
    public String toString() {
        return String.format("%s = %s$", description(), cost());
    }
}
