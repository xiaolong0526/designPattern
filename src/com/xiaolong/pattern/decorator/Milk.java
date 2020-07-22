package com.xiaolong.pattern.decorator;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/22 16:37
 */
public class Milk extends Decorator {
    public Milk(Drink obj) {
        super(obj);

        setDes("milk");
        setPrice(2.0f);
    }
}
