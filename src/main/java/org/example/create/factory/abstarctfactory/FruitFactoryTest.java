package org.example.create.factory.abstarctfactory;

import org.example.entity.Fruit;
import org.example.entity.bag.Bag;

/**
 * @content
 */
public class FruitFactoryTest {
    public static void main(String[] args) {

        FruitFactory factory = new AppleFactory();
        Fruit fruit = factory.getFruit();
        fruit.draw();

        Bag bag = factory.getBag();
        bag.pack();
    }
}
