package SingletonPattern;

/**
 * Created by pohoulong on 2018/4/17.
 */
public class SingletonMain {
    public static void main(String[] args) {
        LazyMan.getInstance().say();
        HungryMan.getInstance().say();
    }
}
