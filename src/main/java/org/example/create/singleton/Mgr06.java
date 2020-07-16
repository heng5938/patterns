package org.example.create.singleton;

/**
 * @author jason
 * @create 2020/6/18
 *
 * 懒汉式
 * 通过加锁来实现，
 *
 * 线程安全，也是最完美的
 */
public class Mgr06 {
    //要加上volatile
    private static volatile Mgr06 m;

    private Mgr06(){

    }

    /**
     * 通过双重机制来判断实例是否已经存在
     * @return
     */
    public static Mgr06 getInstance(){
        //这次判断是很有必要的，因为大多数线程判断实例不是null，直接返回了
        if (m == null) {
            synchronized(Mgr06.class){
                if (m == null){
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    m = new Mgr06();
                }
            }
        }
        return m;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Mgr06.getInstance().hashCode());
            }).start();
        }
    }

}
