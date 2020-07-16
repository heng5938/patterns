package org.example.create.singleton;

/**
 * @author jason
 * @create 2020/6/18
 *
 * 静态内部类的写法
 * JVM保证单例
 * 加载外部类时不会加载内部类，这样可以实现懒加载
 */
public class Mgr07 {
    private Mgr07(){}

    private static class Mgr07Hloder{
        private static final Mgr07 m = new Mgr07();
    }

    public static Mgr07 getInstance(){
        return Mgr07Hloder.m;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Mgr07.getInstance().hashCode());
            }).start();
        }
    }
}
