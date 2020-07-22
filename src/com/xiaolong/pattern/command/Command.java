package com.xiaolong.pattern.command;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/22 20:46
 */

//创建命令接口
public interface Command {

    // 执行动作（操作）
    public void execute();
    // 撤销动作（操作）
    public void undo();
}
