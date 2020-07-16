package org.example.create.singleton;

/**
 * @author jason
 * @create 2020/6/18
 *
 * 懒汉式
 *
 * 开始没有初始化，当有需要的时候再创建对象
 * 但是这样又带来了线程不安全的问题
 */
public class Mgr03 {
    private static Mgr03 m;

    private Mgr03(){

    }

    public static Mgr03 getInstance(){
        if (m == null) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            m = new Mgr03();
        }
        return m;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Mgr03.getInstance().hashCode());
            }).start();
        }
    }

}
