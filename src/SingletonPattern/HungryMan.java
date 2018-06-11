package SingletonPattern;

/**
 * Created by pohoulong on 2018/4/17.
 */
public class HungryMan {

    private static final HungryMan man = new HungryMan();

    private String name;

    private HungryMan(){}

    public static HungryMan getInstance(){
        return man;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void say(){
        System.out.println("我是饿汉式");
    }

}
