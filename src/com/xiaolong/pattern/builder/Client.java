package com.xiaolong.pattern.builder;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/22 15:28
 */

/**
 * 缺点：将产品和创建产品的过程封装在一起，耦合性增强
 * 改机：建造者模式：将产品和产品建造过程解耦
 */
public class Client {

    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        commonHouse.build();
    }
}
