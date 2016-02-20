package ua.com.manko.patterns.decorator.deco1.samples;

/**
 * Created by Sergej on 07.02.2016.
 */
public class Sugar extends Additive {
    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return super.cost() + 5;
    }

    @Override
    public String description() {
        return super.description() + "sugar";
    }
}
