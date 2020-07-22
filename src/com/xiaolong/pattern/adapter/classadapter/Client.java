package com.xiaolong.pattern.adapter.classadapter;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/22 15:45
 */

public class Client {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new Volatage());
    }
}
