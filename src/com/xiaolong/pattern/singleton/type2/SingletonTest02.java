package com.xiaolong.pattern.singleton.type2;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/19 12:41
 */

public class SingletonTest02 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
    }
}

/**
 * 饿汉式：静态代码块
 * 优缺点和静态变量是一样的，会造成内存浪费
 */
class Singleton {
    // 私有化构造方法
    private Singleton() {
    }

    private static Singleton instance;

    static {
        instance = new Singleton();
    }

    public static Singleton getInstance(){
        return instance;
    }
}
