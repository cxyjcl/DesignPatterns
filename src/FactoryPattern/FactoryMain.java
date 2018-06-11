package FactoryPattern;

/**
 * Created by pohoulong on 2018/6/11.
 */
public class FactoryMain {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.create("123123");
        shape.draw();
    }
}
