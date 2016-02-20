package ua.com.manko.patterns.factory;

/**
 * Created by Sergej on 24.01.2016.
 */
public class ConcreteCreatorA implements Creator {
    @Override
    public Product factoryMathod() {
        return new ConcreteProductA();
    }
}
