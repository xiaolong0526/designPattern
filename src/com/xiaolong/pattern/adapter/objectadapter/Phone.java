package com.xiaolong.pattern.adapter.objectadapter;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/22 15:49
 */
public class Phone {
    //充电
    public void charging(IVoltage5V iVoltage5V) {
        if (iVoltage5V.output5V() == 5){
            System.out.println("电压5V，可以充电");
        }else if (iVoltage5V.output5V() > 5){
            System.out.println("电压大于5V，不能充电");
        }
    }
}
