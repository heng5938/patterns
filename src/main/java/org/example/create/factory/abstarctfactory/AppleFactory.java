package org.example.create.factory.abstarctfactory;

import org.example.entity.Fruit;
import org.example.entity.bag.AppleBag;
import org.example.entity.bag.Bag;
import org.example.entity.fruit.Apple;

/**
 * @content: 苹果工程生产一些列关于苹果的东西
 */
public class AppleFactory extends FruitFactory{
    @Override
    public Fruit getFruit() {
        return new Apple();
    }

    @Override
    public Bag getBag() {
        return new AppleBag();
    }

}
