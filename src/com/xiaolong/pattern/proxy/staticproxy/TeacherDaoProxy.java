package com.xiaolong.pattern.proxy.staticproxy;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/22 17:48
 */

/**
 * 代理对象
 */
public class TeacherDaoProxy implements ITeacherDao {

    private ITeacherDao target; //目标对象，通过接口来聚合

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("开始代理 完成某些操作");
        target.teach();
        System.out.println("提交===");
    }
}
