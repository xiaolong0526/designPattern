package com.xiaolong.pattern.adapter.classadapter;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/22 15:54
 */

/**
 * 适配器类
 */
public class Volatage extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        // 获取到220V电压
        int srcV = output220V();
        //转换为5V
        int dstV = srcV / 44;
        return dstV;
    }
}
