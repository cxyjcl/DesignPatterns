package BuildFactoryPattern;

/**
 * Created by pohoulong on 2018/6/11.
 */
public class Burger implements Item{

    @Override
    public String getName() {
        return "汉堡";
    }

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public float getPrice() {
        return 32;
    }
}
