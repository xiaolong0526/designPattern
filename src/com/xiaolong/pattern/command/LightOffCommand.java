package com.xiaolong.pattern.command;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/22 20:47
 */
public class LightOffCommand implements Command {

    LightReceiver light; // 聚合

    public LightOffCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        // 调用接受者的方法
        light.off();
    }

    @Override
    public void undo() {
        // 调用接受者的方法
        light.on();
    }
}
