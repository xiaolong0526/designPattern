package com.xiaolong.pattern.decorator;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/22 16:40
 */
public class CoffeeBar {

    public static void main(String[] args) {

        // 装饰者模式下的订单：2份巧克力+ 一份牛奶的LongBlack
        Drink order = new LongBlack();

        System.out.println("费用1=" + order.cost());
        System.out.println("描述1+" + order.getDes());

        // 加入一份牛奶
        order = new Milk(order);

        System.out.println("order加入一份牛奶 费用=" + order.cost());
        System.out.println("order加入一份牛奶 描述=" + order.getDes());
    }
}
