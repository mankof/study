package ua.com.manko.patterns.decorator;

/**
 * Created by Sergej on 03.02.2016.
 */
public class DecoratorSpace extends Decorator {
    public DecoratorSpace(InterfaceComponent interfaceComponent) {
        super(interfaceComponent);
    }

    @Override
    public void newOperation() {
        System.out.print(" ");
        super.newOperation();
    }

    @Override
    public void doOperation() {
        System.out.println("New space operation");
    }
}
