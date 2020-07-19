package com.xiaolong.pattern.factory.simplefactory.pizzastore.imporve;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/19 15:02
 */

import com.xiaolong.pattern.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.xiaolong.pattern.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.xiaolong.pattern.factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * 简单工厂
 */
public class SimpleFactory {

    // 根据orderType返回对应的pizza对象
    public static Pizza createPizza(String orderType){
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        }else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }
        return pizza;
    }
}
