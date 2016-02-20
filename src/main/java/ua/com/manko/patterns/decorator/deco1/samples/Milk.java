package ua.com.manko.patterns.decorator.deco1.samples;

/**
 * Created by Sergej on 07.02.2016.
 */
public class Milk extends Additive {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return super.cost() + 3;
    }

    @Override
    public String description() {
        return super.description() + "milk";
    }
}
