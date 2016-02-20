package ua.com.manko.patterns.decorator.deco1.samples;

/**
 * Created by Sergej on 07.02.2016.
 */
public class Salt extends Additive {

    public Salt(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }

    @Override
    public String description() {
        return super.description() + "salt";
    }
}
