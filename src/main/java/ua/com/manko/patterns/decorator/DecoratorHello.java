package ua.com.manko.patterns.decorator;

/**
 * Created by Sergej on 03.02.2016.
 */
public class DecoratorHello extends Decorator {
    public DecoratorHello(InterfaceComponent interfaceComponent) {
        super(interfaceComponent);
    }

    @Override
    public void doOperation() {
        System.out.print("Hello");
        super.doOperation();
    }

    @Override
    public void newOperation() {
        System.out.println("New hello operation");
    }
}
