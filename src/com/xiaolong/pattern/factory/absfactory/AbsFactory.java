package com.xiaolong.pattern.factory.absfactory;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/19 15:28
 */

import com.xiaolong.pattern.factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * 抽象工厂
 */

public interface AbsFactory {
    // 让工厂子类具体实现
    public Pizza createPizza(String orderType);
}
