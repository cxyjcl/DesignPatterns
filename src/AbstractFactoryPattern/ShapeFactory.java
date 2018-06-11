package AbstractFactoryPattern;

/**
 * Created by pohoulong on 2018/6/11.
 */
public class ShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String name) {
        switch (name) {
            case "Square":return new Square();
            case "Circle":return new Circle();
            default:throw new NameException("错误命名");
        }
    }

    @Override
    public Color getColor(String name) {
        return null;
    }
}
