package ua.com.manko.patterns.decorator;

/**
 * Created by Sergej on 03.02.2016.
 */
public abstract class Decorator implements InterfaceComponent {
    protected InterfaceComponent interfaceComponent;

    public Decorator(InterfaceComponent interfaceComponent) {
        this.interfaceComponent = interfaceComponent;
    }



    @Override
    public void doOperation() {
        interfaceComponent.doOperation();
    }

    public void newOperation() {
        System.out.println("Do Nothing");
    }
}
