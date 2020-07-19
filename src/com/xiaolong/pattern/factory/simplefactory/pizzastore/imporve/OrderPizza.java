package com.xiaolong.pattern.factory.simplefactory.pizzastore.imporve;

import com.xiaolong.pattern.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.xiaolong.pattern.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.xiaolong.pattern.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/19 14:49
 */

/**
 * pizza订单
 * 使用简单工厂模式进行改进，将制作pizza对象的代码封装到一个工程中
 * */

public class OrderPizza {

    // 定义一个简单工厂对象
    SimpleFactory simpleFactory;
    Pizza pizza = null;

    public OrderPizza(SimpleFactory simpleFactory) {
        setFactory(simpleFactory);
    }

    public void setFactory(SimpleFactory simpleFactory){

        String orderType = ""; // 用户输入pizza种类
        this.simpleFactory = simpleFactory;

        do {
            // 获取用户输入pizza种类
            orderType = getType();

            // 改进的地方：利用工厂来制作pizza
            pizza = simpleFactory.createPizza(orderType);
            if (pizza != null) {
                //制作pizza
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购披萨失败");
                break;
            }
        }while (true);
    }

    // 获取用户需要的pizza种类
    private String getType() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:" );
            String str = bufferedReader.readLine();
            return str;
        } catch (IOException e){
            e.printStackTrace();
            return "";
        }
    }
}
