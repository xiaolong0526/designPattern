package com.xiaolong.pattern.factory.factory;

import com.xiaolong.pattern.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.xiaolong.pattern.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.xiaolong.pattern.factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/19 15:24
 */

/**
 * pizza实例化对象让子类实现
 */
public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("greek");
        }else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("cheese");
        }
        return pizza;
    }
}
