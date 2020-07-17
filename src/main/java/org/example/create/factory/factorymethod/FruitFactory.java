package org.example.create.factory.factorymethod;

import org.example.entity.Fruit;

/**
 * @author jason
 * @create 2020/7/15
 *
 * 工厂方法接口
 */
public interface FruitFactory {
    //返回具体水果对象
    public Fruit getFruit();
}
