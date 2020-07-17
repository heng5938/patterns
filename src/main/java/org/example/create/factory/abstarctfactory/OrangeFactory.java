package org.example.create.factory.abstarctfactory;

import org.example.entity.Fruit;
import org.example.entity.bag.Bag;
import org.example.entity.bag.OrangeBag;
import org.example.entity.fruit.Orange;

/**
 * @content
 */
public class OrangeFactory extends FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Orange();
    }

    @Override
    public Bag getBag() {
        return new OrangeBag();
    }

}
