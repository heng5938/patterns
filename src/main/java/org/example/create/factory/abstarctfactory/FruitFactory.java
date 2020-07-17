package org.example.create.factory.abstarctfactory;

import org.example.entity.Fruit;
import org.example.entity.bag.Bag;

/**
 * @content 定义一个抽象工厂接口
 */
public abstract class FruitFactory {
    //获取水果类型
    public abstract Fruit  getFruit();
    //获取水果包装
    public abstract Bag getBag();

}
