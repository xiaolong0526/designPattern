package com.xiaolong.pattern.adapter.classadapter;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/22 15:51
 */

/**
 * 被适配的类
 */
public class Voltage220V {

    public int output220V() {
        int src = 220;
        System.out.println("电压" + src + "伏");
        return src;
    }
}
