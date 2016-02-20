package ua.com.manko.patterns.decorator.deco1.samples;

/**
 * Created by Sergej on 07.02.2016.
 */
public class Client {
    public static void main(String[] args) {

        Beverage saltWater = new Salt(new Water());
        System.out.println("Salt water: "+ saltWater);

        Beverage sweetTea = new Sugar(new Sugar(new Tea()));
        System.out.println("Sweet tea = " + sweetTea);

        Beverage tea = new Sugar(new Tea());
        System.out.println("tea = " + tea);

        Beverage capuccino = new Milk(new Sugar(new Coffee()));
        System.out.println("Capuccino = " + capuccino);

        Beverage latte = new Milk(new Milk(new Sugar(new Coffee())));
        System.out.println("Latte = " + latte);

    }
}
