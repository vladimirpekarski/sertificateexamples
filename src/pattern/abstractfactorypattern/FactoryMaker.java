package pattern.abstractfactorypattern;

/**
 * Created by asus on 17.04.15.
 */
public class FactoryMaker {
    public static ShapeFactory getFactory(String factoryType) {
        switch (factoryType) {
            case "DisplayFriendly" :
                return new DisplayFriendlyFactory();
            case "PrinterFriendly" :
                return new PrinterFriendlyFactory();
        }

        return null;
    }
}
