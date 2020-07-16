package org.example.create.singleton;

/**
 * @author jason
 * @create 2020/6/18
 *
 * 懒汉式
 * 可以对方法加锁,但是效率会下降
 */
public class Mgr05 {
    private static Mgr05 m;

    private Mgr05(){

    }

    public static Mgr05 getInstance(){
        if (m == null) {
            //妄图通过减少同步代码块的方式提高效率，然后不可行
            synchronized(Mgr05.class){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                m = new Mgr05();
            }
        }
        return m;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Mgr05.getInstance().hashCode());
            }).start();
        }
    }

}
