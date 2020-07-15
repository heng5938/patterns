package org.example.entity.fruit;

import org.example.entity.Fruit;

/**
 * @author jason
 * @create 2020/7/15
 */
public class Orange implements Fruit {
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
        System.out.println("橘子");
    }


}
