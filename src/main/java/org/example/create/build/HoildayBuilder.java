package org.example.create.build;

import org.example.entity.Fruit;
import org.example.entity.fruit.Apple;
import org.example.entity.fruit.Banana;
import org.example.entity.fruit.Orange;

/**
 * @content
 */
public class HoildayBuilder implements Builder {
    private FruitMeal fruitMeal = new FruitMeal();

    @Override
    public void buildApple(int price) {
        Apple apple = new Apple();
        apple.setPrice(price);
        fruitMeal.setApple(apple);
    }

    @Override
    public void buildBanana(int price) {
        Banana banana = new Banana();
        banana.setPrice(price);
        fruitMeal.setBanana(banana);
    }

    @Override
    public void buildOrange(int price) {
        Orange orange = new Orange();
        orange.setPrice(price);
        fruitMeal.setOrange(orange);
    }

    @Override
    public FruitMeal getFruitMeal() {
        fruitMeal.setDiscount(10);
        fruitMeal.init();
        return fruitMeal;
    }
}
