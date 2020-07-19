package com.xiaolong.pattern.singleton.type5;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/19 13:12
 */

/**
 * 双重检查:
 * 优点：线程安全，效率较高
 * 实际开发中推荐使用
 */
public class SingletonTest05 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
    }
}

class Singleton {

    private Singleton() {
    }


    private static volatile Singleton instance;

    public static synchronized Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
