package com.xiaolong.pattern.adapter.objectadapter;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/22 16:05
 */

/**
 * 对象适配器类
 */
public class VoltageAdapter implements IVoltage5V {

    private Voltage220V voltage220V; //关联关系-聚合

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dst = 0;
        if (voltage220V != null) {
            int src = voltage220V.output220V();
            System.out.println("使用对象适配器，进行适配");
            dst = src / 44;
        }
        return dst;
    }
}
