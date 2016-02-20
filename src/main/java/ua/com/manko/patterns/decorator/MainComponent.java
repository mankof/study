package ua.com.manko.patterns.decorator;

/**
 * Created by Sergej on 03.02.2016.
 */
public class MainComponent implements InterfaceComponent {
    @Override
    public void doOperation() {
        System.out.println("Hello from Main");
    }
}
