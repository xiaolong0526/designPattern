package com.xiaolong.pattern.factory.simplefactory.pizzastore.pizza;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/19 14:48
 */
public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("准备奶酪");
    }
}
