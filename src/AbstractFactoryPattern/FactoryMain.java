package AbstractFactoryPattern;

/**
 * Created by pohoulong on 2018/6/11.
 */
public class FactoryMain {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        shapeFactory.getShape("Circle").draw();
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        colorFactory.getColor("Green").fill();
    }
}
