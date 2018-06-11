package BuildFactoryPattern;

/**
 * Created by pohoulong on 2018/6/11.
 */
public class Coke extends ColdDrink{
    @Override
    public String getName() {
        return "可口可乐";
    }

    @Override
    public Packing packing() {
        return super.packing();
    }

    @Override
    public float getPrice() {
        return 16;
    }
}
