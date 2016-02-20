package ua.com.manko.patterns.decorator;

/**
 * Created by Sergej on 03.02.2016.
 */
public class DecoratorComma extends Decorator {
    public DecoratorComma(InterfaceComponent interfaceComponent) {
        super(interfaceComponent);
    }

    @Override
    public void doOperation() {
        System.out.print(",");
        super.doOperation();
    }

    @Override
    public void newOperation() {
        System.out.println("New comma operation");
    }
}
