package org.example.create.build;

/**
 * @content: 这个建造者接口负责创建套餐Meal对象
 */
public interface Builder {

    void buildApple(int price);//设置苹果价格
    void buildBanana(int price);//设置香蕉价格
    void buildOrange(int price);//设置橘子价格

    FruitMeal getFruitMeal();//返回创建的套餐
}
