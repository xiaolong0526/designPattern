package com.xiaolong.pattern.proxy.staticproxy;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/22 17:46
 */


public class Client {

    public static void main(String[] args) {
        // 创建目标对象，被代理对象
        TeacherDao teacherDao = new TeacherDao();
        // 创建代理对象， 同时将被代理对象传递给代理对象
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
        // 通过代理对象，调用被代理对象的方法
        teacherDaoProxy.teach();
    }
}
