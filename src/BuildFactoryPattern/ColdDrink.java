package BuildFactoryPattern;

/**
 * Created by pohoulong on 2018/6/11.
 */
public class ColdDrink implements Item{
    @Override
    public String getName() {
        return "冷饮";
    }

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public float getPrice() {
        return 12;
    }
}
