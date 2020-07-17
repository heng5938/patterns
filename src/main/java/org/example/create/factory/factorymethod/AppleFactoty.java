package org.example.create.factory.factorymethod;

import org.example.entity.Fruit;
import org.example.entity.fruit.Apple;

/**
 * @author jason
 * @create 2020/7/15
 */
public class AppleFactoty implements FruitFactory {
    public Fruit getFruit() {
        return new Apple();
    }
}
