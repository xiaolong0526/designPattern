package com.xiaolong.pattern.factory.simplefactory.pizzastore.order;

import com.xiaolong.pattern.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.xiaolong.pattern.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.xiaolong.pattern.factory.simplefactory.pizzastore.pizza.Pizza;

import javax.imageio.IIOException;
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
 * 缺点：单增加一个新pizza种类时，创建pizza对象的代码也需要修改
 * 思路：把创建pizza对象封装到一个类中，这样有新的pizza种类，只需要修改该类就行了=====引申出简单工厂模式
 */
public class OrderPizza {

    public OrderPizza() {
        Pizza pizza = null;
        //订购披萨的类型
        String orderType;
        do {
            // 获取用户输入pizza种类
            orderType = getType();
            if (orderType.equals("Greel")) {
                pizza = new GreekPizza();
            }else if (orderType.equals("cheese")) {
                pizza = new CheesePizza();
            }else {
                break;
            }
            //制作pizza
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
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
