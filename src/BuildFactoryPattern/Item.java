package BuildFactoryPattern;

/**
 * Created by pohoulong on 2018/6/11.
 */
public interface Item {
    public String getName();

    public Packing packing();

    public float getPrice();
}
