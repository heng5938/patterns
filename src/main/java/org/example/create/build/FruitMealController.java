package org.example.create.build;

/**
 * @content
 */
public class FruitMealController {
    public static void main(String[] args) {
        new FruitMealController().construct();
    }

    public void construct(){
        HoildayBuilder builder = new HoildayBuilder();

        //一下代码模板，轻易是不变的
        builder.buildApple(120);  //设置苹果价格
        builder.buildBanana(100); //设置香蕉价格
        builder.buildOrange(80);  //设置橘子价格

        FruitMeal fruitMeal = builder.getFruitMeal();

        fruitMeal.cost();
    }
}
