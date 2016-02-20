package ua.com.manko.patterns.decorator.deco1.samples;

/**
 * Created by Sergej on 07.02.2016.
 */
public abstract class Additive extends Beverage {
    private Beverage beverage;

    public Additive(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return beverage.cost();
    }

    @Override
    public String description() {
        return beverage.description() + " + ";
    }
}
