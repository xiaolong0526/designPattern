package com.xiaolong.pattern.singleton.type4;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/19 12:53
 */

/**
 * 懒汉式：
 * 优点：对前面线程不安全进行了改进
 * 缺点：方法进行同步效率太低
 * 实际开发过程中不推荐使用这种方式
 */
public class SingletonTest04 {
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
    // 加入线程同步代码，解决线程安全问题
    public static synchronized Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    // 同步代码块
    public static Singleton getInstance2(){
        if (instance == null){
            synchronized (Singleton.class){
                instance = new Singleton();
            }
        }
        return instance;
    }
}
