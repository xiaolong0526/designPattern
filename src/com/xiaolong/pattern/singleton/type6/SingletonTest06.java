package com.xiaolong.pattern.singleton.type6;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/19 13:18
 */

import javax.swing.*;

/**
 * 静态内部类：
 * 优点：类的静态属性只会在第一次加载类的时候初始化，所有JVM保证了线程的安全性
 *  利用静态内部类特点实现了延迟加载，效率高
 * 实际开发中推荐使用
 */
public class SingletonTest06 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
    }
}

class Singleton {
    private Singleton() {
    }

    private static volatile Singleton instance;

    // 静态内部类
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static synchronized Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
