package org.example.create.factory.simpleFactory;

import org.example.entity.Fruit;

/**
 * @author jason
 * @create 2020/7/15
 */
public class StaticFactoryTest {
    public static void main(String[] args) {
        Fruit apple = StaticFactory.getApple();
        apple.draw();
    }
}
