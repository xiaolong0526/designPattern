package com.xiaolong.pattern.command;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/22 21:04
 */
public class TVOffCommand implements Command {

    TVReceiver tv; // 聚合TV

    public TVOffCommand(TVReceiver tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
