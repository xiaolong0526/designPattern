package com.xiaolong.pattern.singleton.type3;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/19 12:48
 */

/**
 * 懒汉式
 * 优点：改进了饿汉式内存浪费
 * 缺点：多线程会产生多个实例，在实际开发过程中要避免使用
 */
public class SingletonTest03 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
    }
}

class Singleton {
    // 私有化构造方法。外部不能new
    private Singleton() {
    }

    private static Singleton instance;

    // 对外暴露一个创建实例方法，只有调用该方法的时候才会去创建实例
    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}