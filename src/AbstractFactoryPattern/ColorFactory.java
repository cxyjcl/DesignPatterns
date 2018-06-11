package AbstractFactoryPattern;

/**
 * Created by pohoulong on 2018/6/11.
 */
public class ColorFactory extends AbstractFactory{

    @Override
    public Shape getShape(String name) {
        return null;
    }

    @Override
    public Color getColor(String name) {
        switch (name) {
            case "":return new Red();
            case "Green":return new Green();
            default:throw new NameException("错误命名");
        }
    }
}
