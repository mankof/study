package ua.com.manko.patterns.decorator;

/**
 * Created by Sergej on 03.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        Decorator c = new DecoratorHello(new DecoratorComma(new DecoratorSpace(new MainComponent())));
        c.doOperation();
        c.newOperation();
    }
}
