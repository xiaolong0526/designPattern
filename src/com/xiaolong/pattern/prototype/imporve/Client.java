package com.xiaolong.pattern.prototype.imporve;

import jdk.nashorn.internal.ir.CallNode;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/22 15:11
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {

        Sheep sheep = new Sheep("tom", 1, "白色");

        Sheep sheep1 = (Sheep)sheep.clone();
    }
}
