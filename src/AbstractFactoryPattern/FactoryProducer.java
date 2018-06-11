package AbstractFactoryPattern;

/**
 * Created by pohoulong on 2018/6/11.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        switch(choice){
            case "color":return new ColorFactory();
            case "shape":return new ShapeFactory();
            default:throw new NameException("错误命名");
        }
    }
}
