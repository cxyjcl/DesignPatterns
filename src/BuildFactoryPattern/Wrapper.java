package BuildFactoryPattern;

/**
 * Created by pohoulong on 2018/6/11.
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "袋子打包";
    }
}
