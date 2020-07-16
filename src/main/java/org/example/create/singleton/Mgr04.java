package org.example.create.singleton;

/**
 * @author jason
 * @create 2020/6/18
 *
 * 懒汉式
 * 可以对方法加锁,但是效率会下降
 * 线程安全
 */
public class Mgr04 {
    private static Mgr04 m;

    private Mgr04(){

    }

    public static synchronized Mgr04 getInstance(){
        if (m == null) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            m = new Mgr04();
        }
        return m;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Mgr04.getInstance().hashCode());
            }).start();
        }
    }

}
