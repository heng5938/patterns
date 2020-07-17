# 设计模式

## 一、概述

创建型模式,共五种:工厂方法模式、抽象工厂模式、单例模式、建造者模式、原型模式.

结构型模式,共七种:适配器模式、装饰器模式、代理模式、外观模式、桥接模式、组合模式、享元模式.

行为型模式,共十一种:策略模式、模板方法模式、观察者模式、迭代子模式、责任链模式、命令模式、备忘录模式、状态模式、访问者模式、中介者模式、解释器模式.



ps：

设计模式是解决问题的思想，重要的是思想

写代码时，不刻意追求设计模式



## 二、设计模式六大原则

单一职责原则

```
一个类只负责一项职责
```

里氏替换原则

```
子类可以扩展父类的功能，但不要改变父类原有的功能
```

依赖倒置原则

```
面向接口编程
```

接口隔离原则

```
设计接口功能尽量细粒度，最小功能单元
```

迪米特法则

```
降低耦合，不要在局部变量中引入新的类
```

开闭原则

```
对扩展开放，对修改关闭
```



## 三、简单工厂

1.概述：用一个类（工厂类）来负责一种产品对象的创建。

2.实现原理

![image-20200715121556259](%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F.assets/image-20200715121556259.png)

代码实现

```java
package org.example.create.factory.simplefactory;

import org.example.entity.Fruit;
import org.example.entity.fruit.Apple;
import org.example.entity.fruit.Banana;
import org.example.entity.fruit.Orange;

/**
 *
 * 简单工厂实现类
 */
public class StaticFactory {

    public static final int FRUIT_APPLE = 1; //苹果类型
    public static final int FRUIT_ORANGE = 2; //橘子类型
    public static final int FRUIT_BANANA = 3; //香蕉类型


    public static Fruit getFruit(int type) {
        if (type == FRUIT_APPLE) {
            return new Apple();
        } else if (type == FRUIT_ORANGE) {
            return new Orange();
        } else if (type == FRUIT_BANANA) {
            return new Banana();
        }

        return null;
    }

    /**
     * 多工厂实现方法
     */

    public static Fruit getApple(){
        return new Apple();
    }

    public static Fruit getOrange(){
        return new Orange();
    }

    public static Fruit getBanana(){
        return new Banana();
    }
}

```



3.优点：

当再新增一个水果香蕉时，只需要改造StaticFactory类代码即可



4.缺点：

不符合单一职责原则：一个类负责了各类水果的创建

不符合开闭原则：扩展品类时，需要修改已有代码



## 四、工厂方法模式

1.概述

将静态工厂打散，每一种产品对应一个工厂来生产

2.实现原理

![image-20200715125046509](%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F.assets/image-20200715125046509.png)

代码实现

```java
package org.example.create.factory.factorymethod;

import org.example.entity.Fruit;

/**
 *
 * 工厂方法接口
 */
public interface FruitFactory {
    //返回具体水果对象
    public Fruit getFruit();
}

```



```java
package org.example.create.factory.factorymethod;

import org.example.entity.Fruit;
import org.example.entity.fruit.Apple;

/**
 * 苹果工厂，创建苹果类
 */
public class AppleFactoty implements FruitFactory {
    public Fruit getFruit() {
        return new Apple();
    }
}

```



```java
package org.example.create.factory.factorymethod;

import org.example.entity.Fruit;
import org.example.entity.fruit.Banana;

/**
 * 香蕉工厂，创建香蕉类
 */
public class BananaFactory implements FruitFactory {
    public Fruit getFruit() {
        return  new Banana();
    }
}

```



```java
package org.example.create.factory.factorymethod;

import org.example.entity.Fruit;
import org.example.entity.fruit.Orange;

/**
 * 橘子工厂，创建橘子类
 */
public class OrangeFactory implements FruitFactory{
    public Fruit getFruit() {
        return new Orange();
    }
}

```



3.优点：

弥补了扩展性，在工厂方法模式中，将工厂方法抽象出来，形成单独接口

当新增一个产品类时，新加对应的工厂子类即可，不在需要修改既有类



4.缺点：

跟静态工厂模式比，工厂类膨胀太多，根据需求取舍



## 五、抽象工厂模式



## 六、建造者模式

 

## 七、工厂模式总结

 