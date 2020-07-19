package com.xiaolong.pattern.factory.absfactory;

import com.xiaolong.pattern.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.xiaolong.pattern.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.xiaolong.pattern.factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/19 15:35
 */


public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用抽象工厂模式");
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
