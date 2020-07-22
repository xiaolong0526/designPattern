package com.xiaolong.pattern.proxy.staticproxy;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/22 17:48
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("授课中");
    }


}
