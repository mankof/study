package ua.com.manko.patterns.facade.shape;

/**
 * Created by Sergej on 20.02.2016.
 */
public class ClientUseShape {
    public static void main(String[] args) {
        ShapeMakerFacade shapeMakerFacade = new ShapeMakerFacade();
        shapeMakerFacade.drawCircle();
        shapeMakerFacade.drawRectangle();
    }
}
