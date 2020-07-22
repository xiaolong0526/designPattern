package com.xiaolong.pattern.command;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/22 21:07
 */
public class TVOnCommand implements Command {

    TVReceiver tv;

    public TVOnCommand(TVReceiver tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
