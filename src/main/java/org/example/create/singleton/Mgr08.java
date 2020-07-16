package org.example.create.singleton;

/**
 * @author jason
 * @create 2020/6/18
 *
 * 枚举
 * 没有构造方法
 */
public enum Mgr08 {
    INSTANCE;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Mgr08.INSTANCE.hashCode());
            }).start();
        }
    }
}
