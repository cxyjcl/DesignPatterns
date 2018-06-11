package SingletonPattern;

/**
 * Created by pohoulong on 2018/4/17.
 */
public class LazyMan {

    private static LazyMan man = null;

    private String name;

    private LazyMan(){}

    public static LazyMan getInstance(){
        if(man==null){//线程不安全，因为实例化对象时间很长，可能实例化的时候另一个线程到if判断内存就会生成两个man；
            man = new LazyMan();
        }
        return man;
    }

    public static LazyMan getMan() {
        return man;
    }

    public static void setMan(LazyMan man) {
        LazyMan.man = man;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void say(){
        System.out.println("我是懒汉式");
    }
}
