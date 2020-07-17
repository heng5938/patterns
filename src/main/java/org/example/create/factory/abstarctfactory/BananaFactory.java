package org.example.create.factory.abstarctfactory;

import org.example.entity.Fruit;
import org.example.entity.bag.Bag;
import org.example.entity.bag.BananaBag;
import org.example.entity.fruit.Banana;

/**
 * @content
 */
public class BananaFactory extends FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Banana();
    }

    @Override
    public Bag getBag() {
        return new BananaBag();
    }

}
