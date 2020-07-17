package org.example.create.factory.factorymethod;

import org.example.entity.Fruit;

/**
 * @author jason
 * @create 2020/7/15
 *
 * 工厂方法测试
 */
public class FruitFactoryTest {
    public static void main(String[] args) {
        FruitFactory fruitFactory = new AppleFactoty();
        Fruit apple = fruitFactory.getFruit();
        apple.draw();
    }
}
