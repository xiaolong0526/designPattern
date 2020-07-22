package com.xiaolong.pattern.proxy.dynamicproxy;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/22 18:03
 */
public class TeacherDao implements ITeachertDao {
    @Override
    public void teach() {
        System.out.println("授课中");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("hello" + name);
    }
}
