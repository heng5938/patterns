package org.example.create.factory.simplefactory;

import org.example.entity.Fruit;
import org.example.entity.fruit.Apple;
import org.example.entity.fruit.Banana;
import org.example.entity.fruit.Orange;

/**
 * @author jason
 * @create 2020/7/15
 *
 * 简单工厂实现类
 */
public class StaticFactory {

    public static final int FRUIT_APPLE = 1; //苹果类型
    public static final int FRUIT_ORANGE = 2; //橘子类型
    public static final int FRUIT_BANANA = 3; //香蕉类型


    public static Fruit getFruit(int type) {
        if (type == FRUIT_APPLE) {
            return new Apple();
        } else if (type == FRUIT_ORANGE) {
            return new Orange();
        } else if (type == FRUIT_BANANA) {
            return new Banana();
        }

        return null;
    }

    /**
     * 多工厂实现方法
     */

    public static Fruit getApple(){
        return new Apple();
    }

    public static Fruit getOrange(){
        return new Orange();
    }

    public static Fruit getBanana(){
        return new Banana();
    }
}
