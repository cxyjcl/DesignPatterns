package BuildFactoryPattern;

/**
 * Created by pohoulong on 2018/6/11.
 */
public class Bottle implements Packing{
    @Override
    public String pack() {
        return "用盒子打包";
    }
}
