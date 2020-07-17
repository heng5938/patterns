package org.example.create.build;

import org.example.entity.fruit.Apple;
import org.example.entity.fruit.Banana;
import org.example.entity.fruit.Orange;

/**
 * @content:创建一个水果套餐类
 */
public class FruitMeal {
    private Apple apple;
    private Banana banana;
    private Orange orange;
    private int discount; //折扣价
    private int totalPrice;//总价

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setApple(Apple apple) {
        this.apple = apple;
    }

    public void setBanana(Banana banana) {
        this.banana = banana;
    }

    public void setOrange(Orange orange) {
        this.orange = orange;
    }

    public void init(){
        if (null != apple) {
            totalPrice += apple.price();
        }
        if (null != banana) {
            totalPrice += banana.price();
        }
        if (null != orange){
            totalPrice += orange.price();
        }
        if (totalPrice > 0){
            totalPrice -= discount;
        }
    }

    /**
     * 花费多少钱
     * @return
     */
    public void cost(){
        System.out.println("花费了"+totalPrice+"钱");
    }
}
