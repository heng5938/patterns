package org.example.create.singleton;

/**
 * @author jason
 * @create 2020/6/18
 *
 * 和Mgr01一样
 *
 * 线程安全
 */
public class Mgr02 {

    private static Mgr02 m;

    static{
        m = new Mgr02();
    }

    private Mgr02(){
    }

    public static Mgr02 getInstance(){
        return m;
    }
    public static void main(String[] args) {
        Mgr02 m1 = Mgr02.getInstance();
        Mgr02 m2 = Mgr02.getInstance();
        System.out.println(m1 == m2);
    }
}
