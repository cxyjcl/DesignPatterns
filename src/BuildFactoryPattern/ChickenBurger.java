package BuildFactoryPattern;

/**
 * Created by pohoulong on 2018/6/11.
 */
public class ChickenBurger extends Burger{

    @Override
    public String getName() {
        return "鸡肉味汉堡";
    }

    @Override
    public Packing packing() {
        return super.packing();
    }

    @Override
    public float getPrice() {
        return 64;
    }
}
