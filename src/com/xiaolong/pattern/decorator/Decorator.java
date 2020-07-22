package com.xiaolong.pattern.decorator;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/22 16:32
 */


public class Decorator extends Drink {

    private Drink obj;

    // 组合
    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        // 输出被装饰者的信息
        return des + "" + getPrice() + "&&" +obj.getDes();
    }
}
