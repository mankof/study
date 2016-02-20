package ua.com.manko.patterns.facade.shape;

/**
 * Created by Sergej on 20.02.2016.
 */
public class ShapeMakerFacade {
    private Circle circle;
    private Rectangle rectangle;

    public ShapeMakerFacade() {
        circle = new Circle();
        rectangle = new Rectangle();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
}
