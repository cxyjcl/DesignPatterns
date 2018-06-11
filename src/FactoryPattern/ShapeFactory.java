package FactoryPattern;

/**
 * Created by pohoulong on 2018/6/11.
 */
public class ShapeFactory {
    public static Shape create(String name){
        switch (name) {
            case "Square":return new Square();
            case "Circle":return new Circle();
            default:throw new NameException("错误命名");
        }
    }
}
