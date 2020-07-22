package com.xiaolong.pattern.factory.simplefactory.pizzastore.pizza;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/19 14:44
 */

/**
 * pizza抽象类
 */
public abstract class Pizza {

    protected String name;

    // 准备原材料，不同的披萨不一样，因此做成抽象方法
    public abstract void prepare();

    public void bake() {
        System.out.println(name + "baking");
    }

    public void cut() {
        System.out.println(name + "cutting");
    }

    public void box() {
        System.out.println(name + "boxing");
    }

    public void setName(String name) {
        this.name = name;
    }
}