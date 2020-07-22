package com.xiaolong.pattern.decorator;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/22 16:30
 */

public class Coffee extends Drink {

    @Override
    public float cost() {

        return super.getPrice();

    }
}
