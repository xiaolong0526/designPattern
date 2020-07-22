package com.xiaolong.pattern.command;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/22 20:48
 */
public class LightOnCommand implements Command {

    LightReceiver light;

    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        // 调用接受者的消息
        light.on();
    }

    @Override
    public void undo() {
        // 调用接受者的消息
        light.off();
    }
}
