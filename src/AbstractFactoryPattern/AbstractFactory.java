package AbstractFactoryPattern;

/**
 * Created by pohoulong on 2018/6/11.
 */
public abstract class AbstractFactory {

    public abstract Shape getShape(String name);

    public abstract Color getColor(String name);
}
