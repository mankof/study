package ua.com.manko.patterns.factory;

/**
 * Created by Sergej on 24.01.2016.
 */
public class TestFactoryMethod {
    public static void main(String[] args) {
        Creator[] creators = {new ConcreteCreatorA(), new ConcreteCreatorB()};
        // iterate over creators and create products
        for (Creator creator: creators) {
            Product product = creator.factoryMathod();
            System.out.printf("Created {%s}\n", product.getClass());
        }
    }
}
