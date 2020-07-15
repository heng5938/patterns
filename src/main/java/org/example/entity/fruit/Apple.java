package org.example.entity.fruit;

import org.example.entity.Fruit;

/**
 * @author jason
 * @create 2020/7/15
 */
public class Apple implements Fruit {
    int price = 0;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int price() {
        return price;
    }

    public void draw() {
        System.out.println("苹果---红富士");
    }

}
